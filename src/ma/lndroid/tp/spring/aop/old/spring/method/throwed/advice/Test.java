package ma.lndroid.tp.spring.aop.old.spring.method.throwed.advice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	private static final String PATH="ma/lndroid/tp/spring/aop/old/spring/method/throwed/advice/applicationContext.xml";
	
	public static void main(String[] args)  {
		
		Resource resource = new ClassPathResource(PATH);
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Validator v = beanFactory.getBean("proxy",Validator.class);
			System.out.println(v.getClass().getName());
			try {
				v.validate("Lina xxxxxxxxxx");	
			} catch (Exception e) {
				System.err.println("!! Message Stack"+e.getMessage());
			}
			
		
	}

}
