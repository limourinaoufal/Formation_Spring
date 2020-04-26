package ma.lndroid.tp.spring.di.factory.method;

public class B {

	public B() {
		System.out.println("Constructor B sans parametre");
	}

	public void print() {
		System.out.println("hello from B");
	}
	
	public static B getB(){
		System.out.println("#With Factory Methode getB() ");
		return new B();
	}
	
	public A getAOnRun(){
		System.out.println("#With non Satic Factory Methode getAOnRun() In class B ");
		return new A();
	}

}
