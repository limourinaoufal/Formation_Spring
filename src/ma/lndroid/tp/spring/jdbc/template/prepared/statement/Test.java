package ma.lndroid.tp.spring.jdbc.template.prepared.statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static final String PATH = "ma/lndroid/tp/spring/jdbc/template/prepared/statement/applicationContext.xml";
	
	public static void main(String[] args) {
		System.out.println("START JDBC EMAPLE ...");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(PATH);
		EmployeeDao empDao = applicationContext.getBean("empDao",EmployeeDao.class);
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
		
		/**Update Employee id=2 ( staus : 1 = OK )*/
		Employee e2 = applicationContext.getBean("emp",Employee.class);
			e2.setId(2);
			e2.setName("LINA 99999");
			e2.setSalary(9999.99F);
		int resU = empDao.updateEmployee(e2);
		System.out.println("\t-UPDATE data status : {"+(resU==1?true:false)+"} - EMP ID = 2 To -> "+e2);
		
		/**Delete employee id=3 ( staus :  1 = OK )*/
		Employee e3 = applicationContext.getBean("emp",Employee.class);
			e3.setId(3);
		int resD = empDao.deleteEmployee(e3);
		System.out.println("\t-DELETE data status: {"+(resD==1?true:false)+"} : EMPLOYEE ID = 3  ");
		
		System.out.println("END ...");
	}
}
