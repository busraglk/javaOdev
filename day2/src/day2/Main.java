package day2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð");
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin Demiroð");
		
		Course[] courses = {course1, course2};
		for (Course course: courses) {
			
			System.out.println(course.name);
		}

		Student student = new Student();
		student.id = 1;
		student.name = "öðrenci1";
		student.email = "ogrenci1@ogrenci.com";
		student.password ="123";
		
		Student student2 = new Student();
		student2.id = 2;
		student2.name = "öðrenci2";
		student2.email = "ogrenci2@ogrenci.com";
		student2.password ="123";
		

		Educator educator1 = new Educator(1, "Engin Demiroð","Kral Hoca");
		
		Educator[] educators = {educator1};
		for (Educator educator: educators) {
			
			System.out.println(educator.name);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
		courseManager.update(course1);
	}

}
