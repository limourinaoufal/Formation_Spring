package ma.lndroid.tp.spring.orm.hibernate.annotation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

@Transactional
public class EmployeeDaoHT implements IEmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int clearTableEmployee() {
		return 0;
	}

	public void saveEmployee(Employee e) {
		hibernateTemplate.save(e);

	}

	public void updateEmployee(Employee e) {
		hibernateTemplate.update(e);
	}

	public void deleteEmployee(Employee e) {
		hibernateTemplate.delete(e);
	}

	public Employee getEmployeeById(int id) {
		return (Employee) hibernateTemplate.get(Employee.class, id);
	}

	public List<Employee> getAllEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}

}
