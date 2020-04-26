package ma.lndroid.tp.spring.hello.world;

import ma.lndroid.tp.spring.hello.world.Student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	private static final String APPLICATION_CONTEXT_XML_PATH = "/ma/lndroid/tp/spring/hello/world/applicationContext.xml";

	public static void main(String[] args) {

		Resource resource = new ClassPathResource(APPLICATION_CONTEXT_XML_PATH);
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Student studentA = (Student) beanFactory.getBean("studentBean");
		studentA.helloStudent();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML_PATH);
		Student studentB = (Student) applicationContext.getBean("student");
		studentB.helloStudent();

	}

}
