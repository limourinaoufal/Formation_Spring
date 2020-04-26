package ma.lndroid.tp.spring.di.autowiring.object.by.constructor;

public class A {

	private B b;

	public A() {
		System.out.println("#Constructor A sans parametre");
	}

	/*
	 * public A(B b) {
	 * System.out.println("#Constructor A Avec parametre: B Obj"); this.b = b; }
	 */

	public void setB(B b) {
		this.b = b;
	}

	public void print() {
		System.out.println("Hello from A");
	}

	public void display() {
		this.print();
		b.print();
	}

}
