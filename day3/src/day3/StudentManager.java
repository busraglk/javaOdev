package day3;

public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getEmail() +" "+ student.getStudentNumber() +" " + " eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getEmail() +" "+ student.getStudentNumber() +" " + " silindi.");
	}
	
	public void update(Student student) {
		System.out.println(student.getEmail() +" "+ student.getStudentNumber() +" " + " güncellendi.");
	}
}
