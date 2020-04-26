package ma.lndroid.tp.spring.jdbc.template.result.set.extractor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;


public class EmployeeDao implements ApplicationContextAware{

	private ApplicationContext applicationContext;
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
	

	
	public List<Employee> getAllEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		String query = "SELECT * FROM EMPLOYEE";
		return jdbcTemplate.query(query,new ResultSetExtractor<List<Employee>>(){

			@Override
			public List<Employee> extractData(ResultSet rs)
					throws SQLException, DataAccessException {
					while(rs.next()){
						Employee e = applicationContext.getBean("emp",Employee.class);
							e.setId(rs.getInt(1));
							e.setName(rs.getString(2));
							e.setSalary(rs.getFloat(3));
						list.add(e);
					}
				return list;
			}
			
		});
	}

	@Override
	public void setApplicationContext(ApplicationContext appContext)
			throws BeansException {
		this.applicationContext = appContext;
		
	}
	
	
	
	

}
