package ma.lndroid.tp.spring.di.by.constructor.map.with.primitive;

import java.util.Map;

public class Question {
	
	private int id;  
	private String name;  
	private Map<String,String> answers;  
	  
	public Question() {}  
	public Question(int id, String name, Map<String, String> answers) {  
		System.out.println("#Constructeur Question Avec Parametre: id,name & answer (map with <String,String>"); 
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers
				+ "]";
	}  
	
	


}
