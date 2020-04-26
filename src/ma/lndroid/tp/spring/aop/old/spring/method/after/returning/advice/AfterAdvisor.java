package ma.lndroid.tp.spring.aop.old.spring.method.after.returning.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AfterAdvisor implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object paramObject1, Method paramMethod,
			Object[] paramArrayOfObject, Object paramObject2) throws Throwable {
		
		System.out.println("\t#Methode After Returning Advice Spring AOP.");
		System.err.println("\t\t - methode info :" + paramMethod.getName() + " " + paramMethod.getModifiers());
		System.err.println("\t\t - Arguments info :");
		for(Object arg : paramArrayOfObject)
			System.err.println("\t\t\t* "+arg);
		
		System.err.println("\t\t - Target Object : " + paramObject2);
		System.err.println("\t\t - Target Object Class Name: " + paramObject2.getClass().getName());
		
		
	}

	

}
