package ma.lndroid.tp.spring.di.by.constructor.inheriting.bean;

public class Address {
	private String city;
	private String state;
	private String country;
	
	public Address(String city, String state, String country) {		
		System.out.println("#Constructeur Address Avec  Parametre : city,state ans country");
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
	
	
}
