package javaodevi2_1;

public class Course 
{
	int courseId;
	String courseName;
	String courseInstructor;
	String coursePrice;
	int courseCompletionRate;
	
	public Course() 
	{	
		System.out.println("Kursu Seçtiniz.");
	}
	
	public Course(int courseId, String courseName, String courseInstructor, String coursePrice, int courseCompletionRate) 
	{		
		this();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.coursePrice = coursePrice;
		this.courseCompletionRate = courseCompletionRate;
	}

}
