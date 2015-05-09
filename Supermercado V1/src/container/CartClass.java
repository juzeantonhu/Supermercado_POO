package container;


public class CartClass extends ContainerClass<Bag> implements Cart{
	public CartClass(String id, int capacity) {
		super(id, capacity);
	}

	public void emptyCart(){
		items.clear();
	}	
	
	public String getItem(){
		String lista = "";
		for(Bag i : items)
			lista += i.toString()+"\n"+i.getItem();
				
		return lista;
	}

}
