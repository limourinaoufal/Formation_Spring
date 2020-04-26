package ma.lndroid.tp.spring.aop.old.spring.method.throwed.advice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice {

	public void afterThrowing(Exception ex) {
		System.out.println("\t#Methode [Throws] Spring AOP.");
	}

}
