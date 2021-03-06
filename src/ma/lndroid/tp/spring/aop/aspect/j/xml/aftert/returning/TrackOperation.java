package ma.lndroid.tp.spring.aop.aspect.j.xml.aftert.returning;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class TrackOperation {

	public void myadvice(JoinPoint jp, Object result ){
		System.out.println("\t #MyAdvice after returning  -> execution(* Operation.*(..))");
		System.out.println("\t    ##Method Signature: "  + jp.getSignature());
		System.out.println("\t    ##Result in advice: "+result);  
        System.out.println("\t #end of after returning advice...");  
		
	}

}
