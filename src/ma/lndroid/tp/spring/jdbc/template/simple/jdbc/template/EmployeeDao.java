package ma.lndroid.tp.spring.jdbc.template.simple.jdbc.template;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
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
	
	public Boolean saveEmployee(Employee e){
		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		return jdbcTemplate.update(query, e.getId(),e.getName(),e.getSalary())==1?true:false;
		
	}
	
	public int updateEmployee(Employee e){
		String query="UPDATE EMPLOYEE SET NAME= ? , SALARY= ? where ID= ?";  
		return jdbcTemplate.update(query, e.getName(),e.getSalary(),e.getId());
	}
	
	public int deleteEmployee(Employee e){
		String query = "DELETE FROM EMPLOYEE WHERE id = ? ";
		return jdbcTemplate.update(query,e.getId());
	}
	
	
	
	

}
