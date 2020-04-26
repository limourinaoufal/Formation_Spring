package ma.lndroid.tp.spring.aop.aspect.j.xml.aftert.throwing;

public class Operation {
	
	public void validate(int age) throws Exception {
		if (age < 18) {
			throw new ArithmeticException("Not valid age");
		} else {
			System.out.println("Thanks for vote");
		}
	}
}
