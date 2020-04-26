package ma.lndroid.tp.spring.aop.old.spring.method.before.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice {

	@Override
	public void before(Method paramMethod, Object[] paramArrayOfObject,	Object paramObject) throws Throwable {
		System.out.println("\t#Methode Before Advice Spring AOP.");
		System.err.println("\t\t - methode info :" + paramMethod.getName() + " " + paramMethod.getModifiers());
		System.err.println("\t\t - Arguments info :");
		for(Object arg : paramArrayOfObject)
			System.err.println("\t\t\t* "+arg);
		
		System.err.println("\t\t - Target Object : " + paramObject);
		System.err.println("\t\t - Target Object Class Name: " + paramObject.getClass().getName());
		
	}

}
