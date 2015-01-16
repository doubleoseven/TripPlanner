import java.lang.*;

public class linkedList {
	private nodeClass head;
	private int itemsCount = 0;
	
	
	//The constructor sets the initial node to null
	public linkedList()
	{
		head = new nodeClass(null);
		itemsCount = 0;
	}
	
	//The object data can be an instance from the
	//teacher class or the student class
	
	public void add(objectsClass data){
		//The node you want to add
		nodeClass tempNode = new nodeClass(data);
		//The current node is set to the head
		nodeClass currentNode = head;
		
		//Current node starts at the head 
		//and iterates through all the nodes
		//to check if they're the last node
		//in the list. 
		while (currentNode.getNext()!=null)
		{
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(tempNode);
		itemsCount++;	
	}
	
	public void add(objectsClass data, int fence)
	{
		//The
		nodeClass tempNode = new nodeClass(data);
		nodeClass currentNode = head;
		
		//Iterate until the fence
		for (int i = 1; i<fence && currentNode.getNext()!=null; i++)
		{
			currentNode = currentNode.getNext();
		}
		
		//If the currentNode points to null, temp points to null
		//If not, temp points to the node after currentNode
		tempNode.setNext(currentNode.getNext());
		
		//curreNode points to temp
		currentNode.setNext(tempNode);
		itemsCount++;
	}
	
	//Returns the object at the fence
	public Object get(int fence)
	{
		if(fence<=0){ return null; }
		

		nodeClass currentNode = head.getNext();
		for (int i = 1; i<fence; i++)
		{
			if(currentNode.getNext() == null)
			{
				return null;
			}
			
			currentNode = currentNode.getNext();
		}
		
		return currentNode.getName();
	}
	
	public boolean remove(int fence)
	{
		if(fence<1 || fence > size()) { return false; }
		
		nodeClass currentNode = head;
		for (int i =1; i<fence; i++)
		{
			if(currentNode.getNext()==null) return false;
			
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(currentNode.getNext().getNext());
		itemsCount--;
		return true;
	}
	
	public int size()
	{
		return itemsCount;
	}
	
	public String toString()
	{
		nodeClass currentNode = head.getNext();
		String output ="";
		while (currentNode!=null) 
		{
			output += "[" + currentNode.getType()+" "+currentNode.getId()+" "+currentNode.getName()+ "]";
			currentNode = currentNode.getNext();
		}
		return output;
	}
	
	public boolean sortList()
	{
		//Sort list by name
		//Current Node = head
		//if current->next == null
		//return false;
		//Look at the beginning of each name
		//See if there's a function that sorts already
		//If one is greater than the other (ex a = node b = node and a>b)
		//and it is b and then a 
		//b -> next = a.next (which is after b) 
		//Then a -> next = b 
		//Need a temp to iterate over the entire line
		//Need a current to keep the one that you're comparing 
		// ex current = b temp = a
		//if a>b 
		//Then current->next = a->next
		//And temp ->next = b;
		//Sorting algorithm:
		//Compare(String1, String2)
		//If returns < 0 
			//String 1 <Sting 2
		//If return 0
			//String 1 = String 2
		//If returns >0 
			//String 1>String 2
		nodeClass temp = head.getNext().getNext(); // b
		nodeClass current = head.getNext(); //a
		
		if(current == null) return false;
		for (int i = 1; i<size(); i++)
		{
			if(temp.getName().compareTo(current.getName())<0)
			{
				
			}
			
			
			//(temp.getName(), current.getName());
		}
		
		return true;
	}
	
	
}

class nodeClass {
	
	nodeClass next;
	objectsClass data;
	
	//This constructor sets the next node to null 
	public nodeClass(objectsClass dataValue)
	{
		next = null;
		data = dataValue;
	}
	
	//This constructor specifies which node to point to
	public nodeClass(nodeClass nextNode, objectsClass dataValue)
	{
		next = nextNode;
		data = dataValue;
	}
	
	
	//Setter and Getter Functions
	public String getType()
	{
			return data.getType();
	}
	
	
	public void setType(String type)
	{
		data.setType(type);
	}
	
	public String getName()
	{
			return data.getName();
	}
	
	
	public void setName(String name)
	{
		data.setName(name);
	}
	
	public String getId()
	{
			return data.getId();
	}
	
	
	public void setId(String id)
	{
		data.setId(id);
	}
	
	public nodeClass getNext()
	{
		return next;
	}
	
	public void setNext(nodeClass nextNode)
	{
		next = nextNode;
	}
	
	
}
