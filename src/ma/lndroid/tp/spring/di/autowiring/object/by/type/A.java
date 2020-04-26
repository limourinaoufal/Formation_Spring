package ma.lndroid.tp.spring.di.autowiring.object.by.type;

public class A {
	
	private B bb;
	
	public A() {
		System.out.println("#Constructor A sans parametre");
	}
	
	public void setB(B b) {
		this.bb = b;
	}
	
	public void print(){
		System.out.println("Hello from A");
	}
	
	public void display(){
		this.print();
		bb.print();
	}
	

}
