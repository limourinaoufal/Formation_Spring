package ma.lndroid.tp.spring.orm.hibernate.session.factory;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;


@Transactional
public class EmployeeDao implements IEmployeeDao {

	
	private SessionFactory sessionFactory;

	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public int clearTableEmployee(){
		return 0;
	}
	

	public void saveEmployee(Employee e){
		sessionFactory.getCurrentSession().save(e);
		
	}


	public void updateEmployee(Employee e){
		sessionFactory.getCurrentSession().update(e);
	}

	public void deleteEmployee(Employee e){
		sessionFactory.getCurrentSession().delete(e);
	}
	
	public Employee getEmployeeById(int id){  
	    return (Employee) sessionFactory.getCurrentSession().get(Employee.class,id);    
	}  
	
	public List<Employee> getAllEmployees(){  
	    List<Employee> list=new ArrayList<Employee>();  
	    
	    Query q =  sessionFactory.getCurrentSession().createQuery("SELECT e FROM Employee e",Employee.class);
	    list =  q.getResultList();
	    return list;  
	}  
	

	

}
