package ma.lndroid.tp.spring.di.by.setter.map.with.object;

public class User {
	
	private String email;

	public User() {
		System.out.println("#Constructeur User Sans Parametre");
	}

	public User(String email) {
		System.out.println("#Constructeur User Avec Parametre: email");
		this.email = email;
	}
	
	

	public void setEmail(String email) {
		System.out.println("#Setter User EMAIL");
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [email=" + email + "]";
	}
	
	
	

}
