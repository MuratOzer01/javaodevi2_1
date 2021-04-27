package javaodevi2_1;

public class CourseManager {
	
	
	public void Entry(Course course) 
	{
		System.out.println("Giris Yapildi.");
	}
	
	public void Completion(Course course) 
	{
		if(course.courseCompletionRate == 100) 
		{
			System.out.println("Tebrikler! kursu Tamamlandin.");
		}
		else 
		{
			System.out.println("Kursu %" + course.courseCompletionRate + " tamamladin.");
		}
	}
}
