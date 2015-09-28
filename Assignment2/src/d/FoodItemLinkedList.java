package d;

public class FoodItemLinkedList<T> {
	private FoodItemNode head, tail;
	private int size;
	
	public FoodItemLinkedList()
	{
		head = null;
		tail = null;
		size = 0 ;
	}
	private boolean isEmpty()
	{
		if(head == null)
			return true;
		else
			return false;
	}
	public void add(T element)
	{
		FoodItemNode node = new FoodItemNode(element);
		if(isEmpty())
			head = node;
		else
			tail.setLink(node);
		tail = node;
		size++;
	}
	public boolean search(T element)
	{
		FoodItemNode current = head;
		while(current != null)
		{
			if(current.getValue().equals(element))
				return true;
			current = current.getLink();
		}
		return false;
	}
	
	public String toString() {
		String list = "";
		FoodItemNode current;
		current = head;
		while (current != null) {
			list += current.getValue() + " ";
			current = current.getLink();
		}
		return list;
	}
}
