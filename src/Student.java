
public class Student {
	private String name;
	private int id;
	private double finalGrade;
	private String gender;

	public Student(String name, String gender, int id, double finalGrade) {
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.finalGrade = finalGrade;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student : [ Name : " + name + ", Gender : " + gender + ", ID : " + id + ", Final Grade: " + finalGrade + " ]";
	}
}
