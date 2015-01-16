
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	objectsClass firstTeacher = new objectsClass("Teacher", "1", "Dr Nigaht");
	objectsClass secondTeacher = new objectsClass ("Teacher", "2", "Dr Wadee");
	objectsClass thirdTeacher = new objectsClass ("Teacher", "3", "Dr Susan");
	
	linkedList teacherList = new linkedList();
	
	teacherList.add(firstTeacher);
	teacherList.add(secondTeacher);
	teacherList.add(thirdTeacher);

	
	System.out.println("There are " + teacherList.size() + " teachers in this list. They are: " + teacherList.toString());
	System.out.println(teacherList.get(2));
	System.out.println(teacherList.get(3));
	System.out.println(teacherList.get(4));
	System.out.println(teacherList.get(5));
	}

}
