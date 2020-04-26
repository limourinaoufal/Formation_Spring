package ma.lndroid.tp.spring.aop.old.spring.method.interceptor.named.around.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation paramMethodInvocation)
			throws Throwable {
		
		Object obj ;
			System.out.println("\t#Methode [Around] : Before Advice Spring AOP.");
				obj = paramMethodInvocation.proceed();
				System.out.println("\t#Methode [Around] : After Advice Spring AOP.");
		return obj;
	}



}
