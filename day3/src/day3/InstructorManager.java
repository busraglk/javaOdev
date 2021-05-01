package day3;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() +" " + " eklendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getDescription() + " silindi.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getDescription() + " güncellendi.");
	}
	
	
}
