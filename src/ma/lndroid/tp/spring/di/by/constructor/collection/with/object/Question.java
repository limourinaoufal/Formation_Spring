package ma.lndroid.tp.spring.di.by.constructor.collection.with.object;

import java.util.Set;


public class Question {
	
	private int id;  
	private String name;  
	private Set<Answer> answers;
	
	public Question(int id,String name,Set<Answer>answers) {
		System.out.println("#Constructeur Question Avec Parametre: id,name & answers(list of obj)");
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + " => answers=" + answers	+ "]";
	}
	
	
	
	

}
