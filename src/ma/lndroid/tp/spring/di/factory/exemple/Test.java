package ma.lndroid.tp.spring.di.factory.exemple;

import ma.lndroid.tp.spring.hello.world.Student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	private static final String APPLICATION_CONTEXT_XML_PATH = "ma/lndroid/tp/spring/di/factory/exemple/applicationContext.xml";

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML_PATH);
		Printable p =  applicationContext.getBean("p",Printable.class);
		p.print();

	}

}
