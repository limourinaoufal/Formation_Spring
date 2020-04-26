package ma.lndroid.tp.spring.aop.aspect.j.xml.aftert.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class TrackOperation {


	public void myadvice(JoinPoint jp){
		System.out.println("\t #MyAdvice After pointcut -> execution(* Operation.*(..))");
		System.out.println("\t    ##Method Signature: "  + jp.getSignature());
		
	}

}
