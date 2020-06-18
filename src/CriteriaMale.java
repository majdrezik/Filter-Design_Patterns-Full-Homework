
import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements ICriteria {

	@Override
	public List<Student> meetCriteria(List<Student> students) {
		List<Student> maleStudents = new ArrayList<>();

		for (Student student : students) {
			if (student.getGender().equalsIgnoreCase("male")) {
				maleStudents.add(student);
			}
		}
		return maleStudents;
	}
}