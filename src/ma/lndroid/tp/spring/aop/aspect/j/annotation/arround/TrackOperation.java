package ma.lndroid.tp.spring.aop.aspect.j.annotation.arround;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	//@Pointcut("execution(* Operation.*(..))")
	@Pointcut("execution(* Operation.k*(..))")  
	public void pointCut() { }

	@Around("pointCut()")
	public Object myadvice(ProceedingJoinPoint pjp) throws Throwable{
		Object obj;
		
		System.out.println("\t #MyAdvice [Around] Before pointcut -> execution(* Operation.*(..))");
		obj = pjp.proceed();
		System.out.println("\t #MyAdvice [Around] After pointcut -> execution(* Operation.*(..))");
		System.out.println("\t    ##still After pointcut => Method Signature: "  + pjp.getSignature());
		
		return obj;
		
	}

}
