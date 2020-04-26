package ma.lndroid.tp.spring.aop.aspect.j.xml.before;

public class Operation {

	public void msg() {
		System.out.println("\t\t   -msg method invoked");
	}

	public int m() {
		System.out.println("\t\t   -m method invoked");
		return 2;
	}

	public int k() {
		System.out.println("\t\t   -k method invoked");
		return 3;
	}

}
