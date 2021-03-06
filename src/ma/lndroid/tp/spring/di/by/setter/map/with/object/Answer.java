package ma.lndroid.tp.spring.di.by.setter.map.with.object;

public class Answer {
	
	private int id;  
	private String name;  
	private String by;  
	
	public Answer() {
		System.out.println("#Constructeur Answer Sans Parametre");
		
	}  
	public Answer(int id, String name, String by) {  
		System.out.println("#Constructeur Answer Avec Parametre: id,name & by");
	    this.id = id;  
	    this.name = name;  
	    this.by = by;  
	}
	
	

	public void setId(int id) {
		System.out.println("#Setter Answer ID");
		this.id = id;
	}
	public void setName(String name) {
		System.out.println("#Setter Answer NAME");
		this.name = name;
	}
	
	public void setBy(String by) {
		System.out.println("#Setter Answer BY");
		this.by = by;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", by=" + by + "]";
	}  
	
	
	  

}
