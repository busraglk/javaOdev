package day3;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		Student student = new Student();
		student.setId(1);
		student.setStudentNumber(123);
		student.setFirstName("ogrenciAd");
		student.setLastName("ogrenciSoyad");
		userManager.add(student);
		userManager.update(student);
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setDescription("Kral hoca");
		userManager.add(instructor);	
		
	}

}
