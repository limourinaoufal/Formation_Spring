package ma.lndroid.tp.spring.orm.spring.data.jpa.annotation;

import java.util.List;

public interface IEmployeeDao {

	public int clearTableEmployee();

	public void saveEmployee(Employee e);

	public void updateEmployee(Employee e);

	public void deleteEmployee(Employee e);

	public Employee getEmployeeById(int id);

	public List<Employee> getAllEmployees();

}
