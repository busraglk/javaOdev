package day3;

public class Instructor extends User {
	
	private String description;

	
	public Instructor() {
		
	}


	public Instructor(String description) {
		super();
		this.description = description;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}
