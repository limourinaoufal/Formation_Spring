package ma.lndroid.tp.spring.orm.spring.data.jpa.xmlA;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static final String PATH = "ma/lndroid/tp/spring/orm/spring/data/jpa/xmlA/applicationContext.xml";
	
	public static void main(String[] args) {
		System.out.println("START JPA with hibernate EXAMPLE ...");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(PATH);
		IEmployeeDao empDao = applicationContext.getBean("empDao",IEmployeeDao.class);
			
			/*Delete Table Employee*/
				empDao.clearTableEmployee();
		
		/**INSERT INTO EMPLOYEE DATA*/
		for(int i = 1;i<5;i++){
			Employee e = applicationContext.getBean("emp",Employee.class);
				e.setId(i);
				e.setName("LINA:"+i);
				e.setSalary(i*1000);
			empDao.saveEmployee(e);
			System.out.println("\t-Insert data : "+e);
			
		}
		
		/** Get Employee id=2 show*/
		System.out.println(empDao.getEmployeeById(2));
		
		/**Update Employee id=2 */
		Employee e2 = applicationContext.getBean("emp",Employee.class);
			e2.setId(2);
			e2.setName("LINA 99999");
			e2.setSalary(9999.99F);
		empDao.updateEmployee(e2);
		System.out.println("\t-UPDATE data To : "+e2);
		
		/** Get Employee id=2 show after update */
		System.out.println(empDao.getEmployeeById(2));
		
		/**Delete employee id=3 */
		Employee e3 = applicationContext.getBean("emp",Employee.class);
			e3.setId(3);
		empDao.deleteEmployee(e3);
		System.out.println("\t-DELETE data EMPLOYEE ID = 3  ");
		
		/** Show All employee in DB*/
		System.out.println("Show All Employee In DB :");
			List<Employee> l = empDao.getAllEmployees();
			for(Employee le : l)
				System.out.println("\t ->"+le);
		


		
		System.out.println("END ...");
	}
}
