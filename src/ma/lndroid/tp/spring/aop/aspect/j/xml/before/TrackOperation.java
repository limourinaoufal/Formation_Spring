package ma.lndroid.tp.spring.aop.aspect.j.xml.before;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {


	public void myadvice(JoinPoint jp){
		System.out.println("\t #MyAdvice Before pointcut -> execution(* Operation.*(..))");
		System.out.println("\t    ##Method Signature: "  + jp.getSignature());
		
	}

}
