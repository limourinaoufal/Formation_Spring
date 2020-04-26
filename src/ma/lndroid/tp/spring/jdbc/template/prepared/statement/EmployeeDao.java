package ma.lndroid.tp.spring.jdbc.template.prepared.statement;

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
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
					ps.setInt(1, e.getId());
					ps.setString(2, e.getName());
					ps.setFloat(3, e.getSalary());
				return ps.executeUpdate()==1?true:false;
			}
			
		});
		
	}
	
	public int updateEmployee(Employee e){
		String query="UPDATE EMPLOYEE SET NAME= ? , SALARY= ? where ID= ?";  
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Integer>() {

			@Override
			public Integer doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
						ps.setString(1, e.getName());
						ps.setFloat(2, e.getSalary());
						ps.setInt(3, e.getId());
				return  ps.executeUpdate();
				
			}
		});
	}
	
	public int deleteEmployee(Employee e){
		String query = "DELETE FROM EMPLOYEE WHERE id = ? ";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Integer>() {

			@Override
			public Integer doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
						ps.setInt(1, e.getId());
					return ps.executeUpdate();
			}
		});
	}
	
	
	
	

}
