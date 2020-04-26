package ma.lndroid.tp.spring.di.by.constructor.inheriting.bean;

public class Employee {
	
	private int id;  
	private String name;  
	private Address address;  
	
	public Employee() {
		System.out.println("#Constructeur Employee Sans Parametre");

	}  
	  
	public Employee(int id, String name) {  
		System.out.println("#Constructeur Employee Avec Parametre: id,name ");
	    this.id = id;  
	    this.name = name;  
	}  
	public Employee(int id, String name, Address address) { 
		System.out.println("#Constructeur Employee Avec Parametre: id,name & adresse ( obj ) ");  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}  
	
	
	
	

}
