package container;

import item.*;

public class BagClass extends ContainerClass<Item> implements Bag{
	public BagClass(String id, int capacity) {
		super(id, capacity);
	}

	public String getItem(){
		String lista = "";
		for(Item i : items)
			lista += i.toString()+"\n";
				
		return lista;
	}
}
