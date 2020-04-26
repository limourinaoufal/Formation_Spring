package ma.lndroid.tp.spring.di.by.setter.object;

public class Employee {

	private int id;

	private String name;

	private Address address;

	public Employee() {
		System.out.println("#Constructeur Employee Sans Parametre");
	}

	public Employee(int id) {
		System.out.println("#Constructeur Employee Avec Parametre ID");
		this.id = id;
	}

	public Employee(String name) {
		System.out.println("#Constructeur Employee Avec Parametre Name");
		this.name = name;
	}

	public Employee(int id, String name) {
		System.out.println("#Constructeur Employee Avec Parametres ID & Name");
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, Address address) {
		System.out
				.println("Constructeur Employee Avec Parametres ID & Name & Address");
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void setId(int id) {
		System.out.println("#Setter Employee ID");
		this.id = id;
	}

	public void setName(String name) {
		System.out.println("#Setter Employee NAME");
		this.name = name;
	}

	public void setAddress(Address address) {
		System.out.println("#Setter Employee ADDRESS obj");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}

}
