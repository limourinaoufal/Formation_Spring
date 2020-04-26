package ma.lndroid.tp.spring.jdbc.template.named.parameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


public class EmployeeDao {

	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setNamedParameterJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public int clearTableEmployee(){
		String query = "DELETE FROM EMPLOYEE";
		return namedParameterJdbcTemplate.update(query, new HashMap<String,Object>());
	}
	
	public Boolean saveEmployee(Employee e){
		String query = "INSERT INTO EMPLOYEE VALUES(:id,:name,:salary)";
		Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", e.getId());
			map.put("name", e.getName());
			map.put("salary", e.getSalary());
		
		return namedParameterJdbcTemplate.execute(query,map,new PreparedStatementCallback<Boolean>(){

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				
				return ps.executeUpdate()==1?true:false;
			}
			
		});
			
		
	}
	
	public int updateEmployee(Employee e){
		String query="UPDATE EMPLOYEE SET NAME= :name , SALARY= :salary where ID= :id";
		Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", e.getId());
			map.put("name", e.getName());
			map.put("salary", e.getSalary());
		return namedParameterJdbcTemplate.execute(query,map, new PreparedStatementCallback<Integer>() {

			@Override
			public Integer doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				return  ps.executeUpdate();
				
			}
		});
	}
	
	public int deleteEmployee(Employee e){
		String query = "DELETE FROM EMPLOYEE WHERE id = :id ";
		Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", e.getId());
		return namedParameterJdbcTemplate.execute(query,map,new PreparedStatementCallback<Integer>() {

			@Override
			public Integer doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
					return ps.executeUpdate();
			}
		});
	}
	
	
	
	

}
