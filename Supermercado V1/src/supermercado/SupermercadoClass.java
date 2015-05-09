package supermercado;

import java.util.*;

import item.*;
import container.*;

public class SupermercadoClass implements Supermercado{
	private static final String NEW_CART = "Carrinho criado com sucesso.";
	private static final String IS_CART = "Carrinho existente!";	
	private static final String NEW_BAG = "Saco criado com sucesso.";
	private static final String IS_BAG = "Saco existente!";
	private static final String NEW_ITEM = "Artigo criado com sucesso.";
	private static final String IS_ITEM = "Artigo existente!";
	private static final String ADD_ITEM = "Artigo adicionado com sucesso.";
	private static final String NO_ITEM = "Saco ou artigo inexistentes!";	
	//private static final String FULL = "Capacidade excedida!";
	private static final String ADD_BAG = "Saco adicionado com sucesso.";
	private static final String NO_BAG = "Carrinho ou saco inexistentes!";
	private static final String NO_CART = "Carrinho inexistente!";	
 
	
	List <Item> items;
	List <Bag> bags;
	List <Cart> carts;
	
	public SupermercadoClass(){
		items = new ArrayList<Item>();
		bags = new ArrayList<Bag>();
		carts = new ArrayList<Cart>();
	}

	public String addItem(String id, int preco){
		Item item = new ItemClass(id,preco);//faltam excecoes
		if(isItem(id) == null){
			items.add(item);
			return NEW_ITEM;
		}
		else{
			return IS_ITEM;
		}
	}
	
	public String addBag(String id, int capacity){
		Bag bag = new BagClass(id,capacity);//faltam excecoes
		if(isBag(id) == null){
			bags.add(bag);
			return NEW_BAG;
		}
		else{
			return IS_BAG;
		}
	}
	
	public String addCart(String id, int capacity){
		Cart cart = new CartClass(id,capacity);//faltam excecoes
		if(isCart(id) == null){
			carts.add(cart);
			return NEW_CART;
		}
		else{
			return IS_CART;			
		}
		
	}
	
	public Item isItem(String id){
		for(Item i : items)
			if(i.getId().equals(id))
				return i;
		return null;
	}
	
	public Bag isBag(String id){
		for(Bag i : bags)
			if(i.getId().equals(id))
				return i;
		return null;
	}
	
	public Cart isCart(String id){
		for(Cart i : carts)
			if(i.getId().equals(id))
				return i;
		return null;
	}
	
	public String toCart(String bag, String cart){
		for(Cart i : carts){
			if(i.getId().equals(cart))
				for(Bag j : bags){
					if(j.getId().equals(bag)){
						i.addItem(j);
						bags.remove(j);
					}}
				return ADD_BAG;
		}		
			
		return NO_BAG;
	}
	
	public String toBag(String item, String bag){
		for(Bag i : bags)
			if(i.getId().equals(bag)){
				for(Item j : items)
					if(j.getId().equals(item)){
						i.addItem(j);
						return ADD_ITEM;
					}
			}
		return NO_ITEM;
	}
	
	public String pay(String cart){
		for(Cart i : carts)
			if(i.getId().equals(cart)){
				i.emptyCart();
			}
		return NO_CART;
	}
	
	public String list(String cart){
		String lista = "";
		for(Cart i : carts)
			lista += i.getItem();
				
		return lista;
	}
	

}
