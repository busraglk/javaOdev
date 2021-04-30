package day2;

public class CourseManager {
	public void add(Course course) {
		System.out.println(course.name+ " Eklendi. ");
	}
	
	public void delete(Course course) {
		System.out.println(course.name + " Silindi. ");
	}
	
	public void update(Course course) {
		System.out.println(course.name + " Güncellendi. ");
	}
}
