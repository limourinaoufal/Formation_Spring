package ma.lndroid.tp.spring.aop.old.spring.method.interceptor.named.around.advice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	private static final String PATH="ma/lndroid/tp/spring/aop/old/spring/method/interceptor/named/around/advice/applicationContext.xml";
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource(PATH);
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		A a = beanFactory.getBean("proxy",A.class);
			System.out.println(a.getClass().getName());
			a.m("Lina AOP Around");
		
	}

}
