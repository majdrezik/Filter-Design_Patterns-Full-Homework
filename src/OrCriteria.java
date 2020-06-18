
import java.util.List;

public class OrCriteria implements ICriteria {

	/*
	 * implement the class and fill in the missing methods.
	 */
	
	private ICriteria criteria;
	private ICriteria otherCriteria;
	
	public OrCriteria(ICriteria criteria, ICriteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	

	@Override
	public List<Student> meetCriteria(List<Student> students) {
		List<Student> firstCriteriaStudents = criteria.meetCriteria(students);
		List<Student> secondCriteriaStudents = otherCriteria.meetCriteria(students);
		
		for(Student student : secondCriteriaStudents) {
			if(!firstCriteriaStudents.contains(student))
				firstCriteriaStudents.add(student);
		}
		return firstCriteriaStudents;
	}
	
}