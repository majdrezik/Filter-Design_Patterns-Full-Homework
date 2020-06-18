import java.util.ArrayList;
import java.util.List;

public class CriteriaFinalGradeUnder implements ICriteria {
	private double max;

	public CriteriaFinalGradeUnder(double max){
		this.max = max;
	}

	@Override
	public List<Student> meetCriteria(List<Student> students) {
		List<Student> studentsWithGradeAbove50 = new ArrayList<>();

		for (Student student : students) {
			if (student.getFinalGrade() < max ){
				studentsWithGradeAbove50.add(student);
			}
		}
		return studentsWithGradeAbove50;
	}

}
