package supermercado;

import item.Item;
import container.Bag;
import container.Cart;

public interface Supermercado {

	String addItem(String id, int preco);
	
	String addBag(String id, int capacity);
	
	String addCart(String id, int capacity);
	
	String toCart(String bag, String cart);
	
	String toBag(String item, String bag);
	
	String pay(String cart);
	
	String list(String cart);
	
	Item isItem(String id);
	
	Bag isBag(String id);
	
	Cart isCart(String id);
	
}
