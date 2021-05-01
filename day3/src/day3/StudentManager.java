package day3;

public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getEmail() +" " + " eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getEmail()  +" " + " silindi.");
	}
	
	public void update(Student student) {
		System.out.println(student.getEmail() +" " + " güncellendi.");
	}
}
