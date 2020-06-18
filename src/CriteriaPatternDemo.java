
import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		int id = 0;
		students.add(new Student("Alex", "male", ++id, 79.5));
		students.add(new Student("Bob", "male", ++id, 60));
		students.add(new Student("Alice", "female", ++id, 55));
		students.add(new Student("Mark", "male", ++id, 100));
		students.add(new Student("Steve", "male", ++id, 95));
		students.add(new Student("Diana", "female", ++id, 29));
		students.add(new Student("Hans", "male", ++id, 38));
		students.add(new Student("Noemi", "female", ++id, 85));
		students.add(new Student("Laila", "female", ++id, 61));
		students.add(new Student("Elina", "female", ++id, 49));
		students.add(new Student("Ron", "male", ++id, 37));

		ICriteria male = new CriteriaMale();
		ICriteria female = new CriteriaFemale();
		ICriteria finalGradeAbove60 = new CriteriaFinalGradeAbove(60);
		ICriteria finalGradeAbove50 = new CriteriaFinalGradeAbove(50);


		ICriteria maleAndFinalGradeAbove50 = new AndCriteria(male, finalGradeAbove50);
		ICriteria femaleAndFinalGradeAbove40 = new AndCriteria(female, finalGradeAbove60);
		ICriteria maleORFemalWithFinalGradeAbove40 = new OrCriteria(maleAndFinalGradeAbove50,
				femaleAndFinalGradeAbove40);
		ICriteria maleORFemaleFinalGradeUnder90 = new CriteriaFinalGradeUnder(90);
		
		
		
		//male between 60-100 or female between 20-50
		ICriteria finalGradeUnder101 = new CriteriaFinalGradeUnder(101);
		ICriteria maleAndFinalGradeAbove60 = new AndCriteria(male, finalGradeAbove60);
		ICriteria maleAndFinalGrade60100 = new AndCriteria(maleAndFinalGradeAbove60, finalGradeUnder101);
		
		ICriteria finalGradeUnder50 = new CriteriaFinalGradeUnder(50);
		ICriteria femaleAndFinalGradeUnder50 = new AndCriteria(female, finalGradeUnder50);
		ICriteria Above20 = new CriteriaFinalGradeAbove(20);
		ICriteria femaleAbove20 = new AndCriteria(female, Above20);
		
		ICriteria femaleAndFinalGrade2050 = new AndCriteria(femaleAndFinalGradeUnder50, femaleAbove20);
		ICriteria maleBetween60and100 = new AndCriteria(maleAndFinalGradeAbove60, maleAndFinalGrade60100);
		
		ICriteria male3080female5090 = new OrCriteria(femaleAndFinalGrade2050, maleBetween60and100);
		
		printStudents(male3080female5090.meetCriteria(students));
	//	System.out.println("students with final grade above 50:");
		//printStudents(finalGradeAbove50.meetCriteria(students));
		
	//	System.out.println("male students with final grade above 50");
	//	printStudents(maleAndFinalGradeAbove50.meetCriteria(students));
		
		
		/*
		System.out.println("average above 60:");
		List<Student> studentsWithFinalGradeAbove60 = finalGradeAbove60.meetCriteria(students);
		double average = 0;
		for(Student student : studentsWithFinalGradeAbove60) {
			average += student.getFinalGrade();
		}
		average /= studentsWithFinalGradeAbove60.size();
		System.out.println(average);
		printStudents(studentsWithFinalGradeAbove60);
		*/
		//printStudents(maleORFemaleFinalGradeUnder70.meetCriteria(students));
		//System.out.println("between 40 and 90");
		//printStudents(allBetween40and90.meetCriteria(students));
		//printStudents(maleORFemalWithFinalGradeAbove50.meetCriteria(students));
		// System.out.println("male and final grade above 50");
		// printStudents(maleAndFinalGradeAbove50.meetCriteria(students));

		// System.out.println("\nfemale and final grade above 50");
		// printStudents(femaleAndFinalGradeAbove50.meetCriteria(students));

		// System.out.println("male or female (ALL)");
		// printStudents(maleORfemale.meetCriteria(students));

	}

	public static void printStudents(List<Student> students) {

		for (Student student : students) {
			System.out.println("Student : [ Name : " + student.getName() + ", Gender : " + student.getGender()
					+ ", ID : " + student.getId() + ", Final Grade: " + student.getFinalGrade() + " ]");
		}
	}
}