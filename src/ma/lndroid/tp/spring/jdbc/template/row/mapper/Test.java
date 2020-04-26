package ma.lndroid.tp.spring.jdbc.template.row.mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static final String PATH = "ma/lndroid/tp/spring/jdbc/template/row/mapper/applicationContext.xml";
	
	public static void main(String[] args) {
		System.out.println("START JDBC EMAPLE ...");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(PATH);
		EmployeeDao empDao = applicationContext.getBean("empDao",EmployeeDao.class);
		
		initDataBase(applicationContext, empDao);
		
		
		/**Show Table Employee Content*/
		System.out.println("#Fetching by RowMapper: Get List Of All Employees in Database DB");
		List<Employee> list = empDao.getAllEmployees();
		for(Employee e : list)
			System.out.println("\t-> "+e);
		
		
		System.out.println("END ...");
	}

	private static void initDataBase(ApplicationContext applicationContext,
			EmployeeDao empDao) {
		/*Delete Table Employee*/
			empDao.clearTableEmployee();
		
		/**INSERT INTO EMPLOYEE DATA ( staus :  1 = OK )*/
		for(int i = 1;i<5;i++){
			Employee e = applicationContext.getBean("emp",Employee.class);
				e.setId(i);
				e.setName("LINA:"+i);
				e.setSalary(i*1000);
			Boolean resI = empDao.saveEmployee(e);
			System.out.println("\t-Insert data status: {"+resI+"} -> "+e);
			
		}
	}
}
