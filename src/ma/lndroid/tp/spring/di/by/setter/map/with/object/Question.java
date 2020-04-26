package ma.lndroid.tp.spring.di.by.setter.map.with.object;

import java.util.Map;

public class Question {
	
	private int id;  
	private String name;  
	private Map<Answer,User> answers;  
	  
	public Question() {
		System.out.println("#Constructeur Question Sans Parametre");
	}  
	public Question(int id, String name, Map<Answer,User> answers) {  
		System.out.println("#Constructeur Question Avec Parametre: id,name & answer (map with obj <Answer,User>"); 
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}
	
	
	public void setId(int id) {
		System.out.println("#Setter Question ID");
		this.id = id;
	}
	public void setName(String name) {
		System.out.println("#Setter Question NAME");
		this.name = name;
	}
	public void setAnswers(Map<Answer, User> answers) {
		System.out.println("#Setter Question ANSWERS Map<Obj,Obj>");
		this.answers = answers;
	}
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers
				+ "]";
	}  
	
	


}
