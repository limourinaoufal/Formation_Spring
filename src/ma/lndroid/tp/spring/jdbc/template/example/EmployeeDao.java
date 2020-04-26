package ma.lndroid.tp.spring.jdbc.template.example;

import ma.lndroid.tp.spring.jdbc.template.example.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


public class EmployeeDao {

	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int clearTableEmployee(){
		String query = "DELETE FROM EMPLOYEE";
			return jdbcTemplate.update(query);
	}
	
	public int saveEmployee(Employee e){
		String query = "INSERT INTO EMPLOYEE VALUES("
								+e.getId()+","
									+ "'"+e.getName()+"',"
										+e.getSalary()
											+ ")";
		return jdbcTemplate.update(query);
	}
	
	public int updateEmployee(Employee e){
		String query="UPDATE EMPLOYEE SET "
					+ "NAME='"+e.getName()+"',"
						+ "SALARY="+e.getSalary()+" "
							+ "WHERE ID="+e.getId()+" ";  
		return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(Employee e){
		String query = "DELETE FROM EMPLOYEE WHERE ID = "+e.getId()+"";
		return jdbcTemplate.update(query);
	}

}
