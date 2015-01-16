
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Teacher firstTeacher = new Teacher("1", "Dr Nigaht");
	Teacher secondTeacher = new Teacher ("2", "Dr Wadee");
	Teacher thirdTeacher = new Teacher ("3", "Dr Susan");
	
	linkedList teacherList = new linkedList();
	
	teacherList.add(firstTeacher);
	teacherList.add(secondTeacher);
	teacherList.add(thirdTeacher);
	
	System.out.println("There are " + teacherList.size() + " teachers in this list. They are: " + teacherList);
	
	
	}

}
