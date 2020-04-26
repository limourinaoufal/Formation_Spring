package ma.lndroid.tp.spring.orm.spring.data.jpa.xml;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class EmployeeDao implements IEmployeeDao {

	@PersistenceContext
	private EntityManager entityManager;

	

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public int clearTableEmployee() {
		return 0;
	}

	public void saveEmployee(Employee e) {
		entityManager.persist(e);

	}

	public void updateEmployee(Employee e) {
		Employee en = entityManager.find(Employee.class,e.getId());
		en.setName(e.getName());
		en.setSalary(e.getSalary());
	}

	public void deleteEmployee(Employee e) {
		Employee re = entityManager.find(Employee.class, e.getId());
		entityManager.remove(re);
	}

	public Employee getEmployeeById(int id) {
		return entityManager.find(Employee.class, id);
	}

	public List<Employee> getAllEmployees() {
		Query q = entityManager.createQuery(
				"SELECT e FROM Employee e",Employee.class);
		return  q.getResultList();

	}

}
