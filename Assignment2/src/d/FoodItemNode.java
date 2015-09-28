package d;

public class FoodItemNode<T> 
{
	private T value;
	private FoodItemNode link;
	
	public FoodItemNode(T value) {
		this.value = value;
		this.link = null;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public FoodItemNode getLink() {
		return link;
	}

	public void setLink(FoodItemNode link) {
		this.link = link;
	}
}
