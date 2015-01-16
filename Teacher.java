import java.util.*;

public class Teacher {
	//Private variables
	private String teacherId;
	private String teacherName;
	
	//Public methods
	public Teacher (String id, String name)
	{
		teacherId = id;
		teacherName = name;
	}
	
	public String getTeacherID ()
	{
		return teacherId;
	}
	
	public void setID (String id)
	{
		teacherId = id;
	}
	
	public String getTeacherName()
	{
		return teacherName;
	}
	
	public void setTeacherName(String name)
	{
		teacherName = name;
	}

}
