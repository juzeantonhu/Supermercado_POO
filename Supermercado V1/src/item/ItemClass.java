package item;

public class ItemClass implements Item{
	String id;
	int price;
	
	public ItemClass(String id, int price){
		this.id = id;
		this.price = price;
	}
	public String getId() {

		return id;
	}


	public int getPrice() {

		return price;
	}

}
