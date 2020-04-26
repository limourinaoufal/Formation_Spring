package ma.lndroid.tp.spring.di.by.constructor.map.with.object;

public class User {
	
	private String email;

	public User() {
		System.out.println("#Constructeur User Sans Parametre");
	}

	public User(String email) {
		System.out.println("#Constructeur User Avec Parametre: email");
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [email=" + email + "]";
	}
	
	
	

}
