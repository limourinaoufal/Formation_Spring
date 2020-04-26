package ma.lndroid.tp.spring.di.by.constructor.collection.with.primitive;

import java.util.List;

public class Question {
	
	private int id;  
	private String name;  
	private List<String> answers;
	
	public Question(int id,String name,List<String>answers) {
		System.out.println("#Constructeur Question Avec Parametre: id,name & answers(list of String)");
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + " => answers=" + answers	+ "]";
	}
	
	
	
	

}
