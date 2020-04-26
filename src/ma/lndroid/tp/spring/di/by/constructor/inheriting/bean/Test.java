package ma.lndroid.tp.spring.di.by.constructor.inheriting.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	private static final String APPLICATION_CONTEXT_XML_PATH = "ma/lndroid/tp/spring/di/by/constructor/inheriting/bean/applicationContext.xml";

	public static void main(String[] args) {

		Resource resource = new ClassPathResource(APPLICATION_CONTEXT_XML_PATH);
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Employee employee = beanFactory.getBean("employeeBean2", Employee.class);
		System.out.println(employee);

	}

}
