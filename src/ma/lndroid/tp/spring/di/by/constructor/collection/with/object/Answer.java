package ma.lndroid.tp.spring.di.by.constructor.collection.with.object;

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
	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", by=" + by + "]";
	}  
	
	
	  

}
