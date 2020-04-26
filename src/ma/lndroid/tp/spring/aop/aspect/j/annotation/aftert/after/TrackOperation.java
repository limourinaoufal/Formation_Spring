package ma.lndroid.tp.spring.aop.aspect.j.annotation.aftert.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	//@Pointcut("execution(* Operation.*(..))")
	@Pointcut("execution(* Operation.m*(..))")  
	public void k() { }

	@After("k()")
	public void myadvice(JoinPoint jp){
		System.out.println("\t #MyAdvice After pointcut -> execution(* Operation.*(..))");
		System.out.println("\t    ##Method Signature: "  + jp.getSignature());
		
	}

}
