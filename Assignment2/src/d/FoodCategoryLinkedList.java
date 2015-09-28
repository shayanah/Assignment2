package d;

public class FoodCategoryLinkedList<T> 
{
	
	private String name;
	
	private FoodCategoryNode head, tail;
	private int size;
	
	public FoodCategoryLinkedList()
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
		FoodCategoryNode node = new FoodCategoryNode(element);
		if(isEmpty())
			head = node;
		else
			tail.setLink(node);
		tail = node;
		size++;
	}
	public boolean search(T element)
	{
		FoodCategoryNode current = head;
		while(current != null)
		{
			if(current.getFoods().equals(element))
				return true;
			current = current.getLink();
		}
		return false;
	}
	
	public String toString() 
	{
		String list = "";
		FoodCategoryNode current;
		current = head;
		while (current != null) {
			list += current.getFoods() + " ";
			current = current.getLink();
		}
		return list;
	}
}
