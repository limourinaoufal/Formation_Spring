package ma.lndroid.tp.spring.di.by.setter.collection.with.object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	private static final String APPLICATION_CONTEXT_XML_PATH = "ma/lndroid/tp/spring/di/by/setter/collection/with/object/applicationContext.xml";

	public static void main(String[] args) {

		Resource resource = new ClassPathResource(APPLICATION_CONTEXT_XML_PATH);
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Question question = beanFactory.getBean("questionBean", Question.class);
		System.out.println(question);

	}

}
