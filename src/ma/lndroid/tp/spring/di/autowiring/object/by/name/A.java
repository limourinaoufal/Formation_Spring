package ma.lndroid.tp.spring.di.autowiring.object.by.name;

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
	

}
