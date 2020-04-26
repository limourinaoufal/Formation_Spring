package ma.lndroid.tp.spring.di.by.setter.object;

public class Address {
	
	private String city;
	private String state;
	private String country;
	
	
	
	public Address() {
		System.out.println("#Constructeur Address Sans  Parametre");
	}



	public Address(String city, String state, String country) {		
		System.out.println("#Constructeur Address Avec  Parametre : city,state ans country");
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	

	public void setCity(String city) {
		System.out.println("#Setter Address CITY");
		this.city = city;
	}



	public void setState(String state) {
		System.out.println("#Setter Address STATE");
		this.state = state;
	}



	public void setCountry(String country) {
		System.out.println("#Setter Address COUNTRY");
		this.country = country;
	}



	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
	
	
	

}
