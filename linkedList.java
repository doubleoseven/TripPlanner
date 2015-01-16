
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
	
	public void add(Object data){
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
	
	public void add(Object data, int fence)
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
		
		return currentNode.getData();
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
			output += "[" + currentNode.getData().toString() + "]";
			currentNode = currentNode.getNext();
		}
		return output;
	}
	
	
}

class nodeClass {
	
	nodeClass next;
	Object data;
	
	//This constructor sets the next node to null 
	public nodeClass(Object dataValue)
	{
		next = null;
		data = dataValue;
	}
	
	//This constructor specifies which node to point to
	public nodeClass(nodeClass nextNode, Object dataValue)
	{
		next = nextNode;
		data = dataValue;
	}
	
	
	//Setter and Getter Functions
	public Object getData()
	{
		return data;
	}
	
	public void setData(Object dataValue)
	{
		data = dataValue;
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
