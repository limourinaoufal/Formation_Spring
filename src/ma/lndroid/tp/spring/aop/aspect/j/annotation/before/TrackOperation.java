package ma.lndroid.tp.spring.aop.aspect.j.annotation.before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Pointcut("execution(* Operation.*(..))")
	//@Pointcut("execution(* Operation.m*(..))")  
	public void k() { }

	@Before("k()")
	public void myadvice(JoinPoint jp){
		System.out.println("\t #MyAdvice Before pointcut -> execution(* Operation.*(..))");
		System.out.println("\t    ##Method Signature: "  + jp.getSignature());
		
	}

}
