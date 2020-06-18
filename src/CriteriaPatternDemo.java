
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

//		/** finalGradeAbove50 ***/
//		ICriteria finalGradeAbove50 = new CriteriaFinalGradeAbove(50);
//		List<Student> finalGradeAbove50List = finalGradeAbove50.meetCriteria(students);
//		System.out.println("students with final grade above 50:");
//		printStudents(finalGradeAbove50List);

		
//		
//		/** Male and final GradeAbove50 ***/
//		ICriteria maleAndFinalGradeAbove50 = new AndCriteria(male, finalGradeAbove50);
//		List<Student> maleAndFinalGradeAbove50List = maleAndFinalGradeAbove50.meetCriteria(students);
//		System.out.println("male students with final grade above 50:");
//		printStudents(maleAndFinalGradeAbove50List);
//
//		
		
		/*** above90 or Under40 ***/
//		ICriteria finalGradeAbove90 = new CriteriaFinalGradeAbove(90);
//		ICriteria finalGradeUnder40 = new CriteriaFinalGradeUnder(40);
//		ICriteria above90orUnder40 = new OrCriteria(finalGradeAbove90, finalGradeUnder40);
//		List<Student> result = above90orUnder40.meetCriteria(students);
//		System.out.println("average above 90 or under 40:");
//		printStudents(result);
//
//		
//		
//		/*** above90 or Under10 ***/
//		ICriteria finalGradeAbove60 = new CriteriaFinalGradeAbove(60);
//		ICriteria finalGradeUnder101 = new CriteriaFinalGradeUnder(101);
//		ICriteria Between60And101 = new AndCriteria(finalGradeAbove60, finalGradeUnder101);
//		ICriteria maleBetween60And101 = new AndCriteria(male, Between60And101);
//
//		ICriteria finalGradeAbove20 = new CriteriaFinalGradeAbove(20);
//		ICriteria finalGradeUnder50 = new CriteriaFinalGradeUnder(50);
//		ICriteria Between20And50 = new AndCriteria(finalGradeAbove20, finalGradeUnder50);
//		ICriteria femaleBetween20And50 = new AndCriteria(female, Between20And50);
//
//		ICriteria maleBetween60And100_OR_femaleBetween20And50 = new OrCriteria(maleBetween60And101,
//				femaleBetween20And50);
//
//		System.out.println("average above 90 or under 10:");
//		List<Student> result2 = maleBetween60And100_OR_femaleBetween20And50.meetCriteria(students);
//		printStudents(result2);

	}

	public static void printStudents(List<Student> students) {

		for (Student student : students) {
			System.out.println(student);
		}
	}
}