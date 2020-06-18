
import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements ICriteria {

	@Override
	public List<Student> meetCriteria(List<Student> students) {
		List<Student> femaleStudents = new ArrayList<>();

		for (Student student : students) {
			if (student.getGender().equalsIgnoreCase("female")) {
				femaleStudents.add(student);
			}
		}
		return femaleStudents;
	}
}