package ma.lndroid.tp.spring.aop.aspect.j.annotation.aftert.throwing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@AfterThrowing(pointcut="execution(* Operation.*(..))",throwing="throwingRes")
	public void myadvice(JoinPoint jp, Throwable throwingRes ){
		System.out.println("\t #MyAdvice after Throwing  -> execution(* Operation.*(..))");
		System.out.println("\t    ##Method Signature: "  + jp.getSignature());
		System.out.println("\t    ##throwing in advice: "+throwingRes);  
        System.out.println("\t #end of after Throwing advice...");  
		
	}

}
