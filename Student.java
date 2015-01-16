import java.util.*;

public class Student {
	//Private variables
	private int studentId;
	private String studentName;
	
	//Public methods
	public Student(int id, String name)
	{
		studentId = id;
		studentName = name;
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public void setStudentId(int id)
	{
		studentId = id;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String name)
	{
		studentName = name;
	}
	
}
