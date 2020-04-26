package ma.lndroid.tp.spring.aop.old.spring.method.throwed.advice;

public class Validator {
	
	 public void validate(String text)throws Exception{  
	        if(text.length()>10){  
	            throw new ArithmeticException("Not Valid data > 10 char : "+text);  
	        }  
	        else{  
	            System.out.println("data confirmed : "+text);  
	        }  
	    }  

}
