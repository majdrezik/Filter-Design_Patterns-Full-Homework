import java.util.ArrayList;
import java.util.List;

public class CriteriaFinalGradeAbove implements ICriteria {
private double min;
	public CriteriaFinalGradeAbove(double min) {
	// TODO Auto-generated constructor stub
		this.min = min;
}
	@Override
	public List<Student> meetCriteria(List<Student> students) {
		List<Student> studentsWithGradeAbove50 = new ArrayList<>();

		for (Student student : students) {
			if (student.getFinalGrade() > min ){
				studentsWithGradeAbove50.add(student);
			}
		}
		return studentsWithGradeAbove50;
	}
}
