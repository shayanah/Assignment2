package d;

public class FoodCategoryNode<T> {
	private FoodItemLinkedList<T> foods;
	private FoodCategoryNode link;
	
	public FoodCategoryNode(T food)
	{
		this.foods = foods;
		link = null;
	}
	
	public FoodItemLinkedList<T> getFoods() {
		return foods;
	}
	public void setFoods(FoodItemLinkedList<T> foods) {
		this.foods = foods;
	}
	public FoodCategoryNode getLink() {
		return link;
	}
	public void setLink(FoodCategoryNode link) {
		this.link = link;
	}
}
