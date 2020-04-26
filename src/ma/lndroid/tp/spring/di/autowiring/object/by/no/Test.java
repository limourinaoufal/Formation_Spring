package ma.lndroid.tp.spring.di.autowiring.object.by.no;

import ma.lndroid.tp.spring.hello.world.Student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	private static final String APPLICATION_CONTEXT_XML_PATH = "ma/lndroid/tp/spring/di/autowiring/object/by/no/applicationContext.xml";

	public static void main(String[] args) {

	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML_PATH);
		A a = applicationContext.getBean("a",A.class);
			a.display();
	}

}
