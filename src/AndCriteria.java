
import java.util.List;

public class AndCriteria implements ICriteria {

	/*
	 * implement the class and fill in the missing methods.
	 */
	
	private ICriteria criteria;
	private ICriteria otherCriteria;
	
	public AndCriteria(ICriteria criteria, ICriteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	

	@Override
	public List<Student> meetCriteria(List<Student> students) {
		List<Student> firstCriteriaStudent = criteria.meetCriteria(students);
		return otherCriteria.meetCriteria(firstCriteriaStudent);
	}
}