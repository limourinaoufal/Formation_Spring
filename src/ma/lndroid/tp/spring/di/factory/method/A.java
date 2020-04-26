package ma.lndroid.tp.spring.di.factory.method;

public class A {
	
	private B b;
	
	public A() {
		System.out.println("#Constructor A sans parametre");
	}
	
	public void setB(B b) {
		this.b = b;
	}
	
	public void print(){
		System.out.println("Hello from A");
	}
	
	public void display(){
		this.print();
		b.print();
	}
	
	public static A getA(){
		System.out.println("#With Satic Factory Methode getA() ");
		return new A();
	}
	
	public static B getB(){
		System.out.println("#With Satic Factory Methode getB() In class A ");
		return new B();
	}
	

	

}
