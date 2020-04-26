package ma.lndroid.tp.spring.hello.world;

public class Student {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void helloStudent(){
		System.out.println("HELLO WORLD : "+ this.getName());
	}

}
