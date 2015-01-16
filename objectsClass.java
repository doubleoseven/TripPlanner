
public class objectsClass {
	
	private String type; //Teacher or Student
	private String id; //Teacher id starts with t, student id starts with s
	private String name; 
	
	public objectsClass(String type, String id, String name)
	{
		this.type = type;
		this.id = id;
		this.name = name;
	}
	
	public objectsClass(String id, String name)
	{
		type = null;
		this.id = id;
		this.name = name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
}
