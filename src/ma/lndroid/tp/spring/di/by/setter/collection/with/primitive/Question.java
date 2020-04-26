package ma.lndroid.tp.spring.di.by.setter.collection.with.primitive;

import java.util.List;

public class Question {
	
	private int id;  
	private String name;  
	private List<String> answers;
	
	
	public Question() {
		System.out.println("#Constructeur Question Sans Parametre)");
	}



	public Question(int id,String name) {
		System.out.println("#Constructeur Question Avec Parametre: ID & NAME ");
		this.id = id;
		this.name = name;

	}
	
	

	public void setId(int id) {
		
		System.out.println("#Seter Question ID ");
		this.id = id;
	}



	public void setName(String name) {
		System.out.println("#Seter Question NAMZ ");
		this.name = name;
	}



	public void setAnswers(List<String> answers) {
		System.out.println("#Seter Question ANSWER List<String>");
		this.answers = answers;
	}



	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + " => answers=" + answers	+ "]";
	}
	
	
	
	

}
