package ma.lndroid.tp.spring.di.factory.exemple;

public class PrintableFactory {

	public static Printable getPrintableA() {
			System.out.println("#Factory Printable static  A from printableFactory");
		/** return any one instance, either A or B */

		return new A();
	}
	
	public Printable getPrintableB() {
		System.out.println("#Factory Printable non static  B from printableFactory");
		/** return any one instance, either A or B */

		return new B();
		
	}

}
