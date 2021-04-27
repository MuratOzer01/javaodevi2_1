package javaodevi2_1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C# & Angular Yazilim Gelistirici Yetistirme Kampi", "Engin Demirog", "Ücretsiz Kurs", 20);
		Course course2 = new Course(2, "Java & React Yazilim Gelistirici Yetistime Kampi", "Engin Demirog", "Ücretsiz Kurs", 50);	
		Course course3 = new Course(3, "Programlamaya Giris İçin Temel Kurs", "Engin Demirog", "Ücretsiz Kurs", 100);	
		
		Course[] courses = {course1, course2, course3};	
		CourseManager courseManager = new CourseManager();
		
		for(int i=0; i < courses.length; i++) {
			courseManager.Entry(courses[i]);
			System.out.println("Kurs Adi: " + courses[i].courseName);
			System.out.println("Kurs Egitmeni: " + courses[i].courseInstructor);
			System.out.println("Kurs Ücreti: " + courses[i].coursePrice);
			courseManager.Completion(courses[i]);
		}

	}

}
