import supermercado.*;
import commands.*;

import java.util.Scanner;
public class Main {

	private static final String EXIT = "Volte sempre.";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Supermercado sm = new SupermercadoClass();
		Commands cmd = getCommand(input);
		while(!cmd.equals(Commands.SAIR)){
			switch (cmd){
				case CRIA:
					cmd = getCommand(input);
					switch (cmd){
						case CARRINHO:
							addCart(input, sm);
							break;
						case SACO:
							addBag(input, sm);
							break;
						case ARTIGO:
							addItem(input, sm);
							break;
					default:
						break;
					}
					break;
				case ARTIGONOSACO:
					addtoBag(input, sm);
					break;
				case SACONOCARRO:
					addtoCart(input, sm);
					break;
				case LISTA:
					list(input, sm);
					break;
				case PAGA:
					pay(input, sm);
					break;
				default:
					break;
			}
			cmd = getCommand(input);
			
		}
		System.out.println(EXIT);
		input.close();
	}

	private static Commands getCommand(Scanner input){
		try{
			String comm = input.next().toUpperCase();
			return Commands.valueOf(comm);
		}catch (IllegalArgumentException e) 
			{
				return Commands.UNKNOWN;
			}
	}
	private static void addCart(Scanner input, Supermercado sm){
		String id = input.next();
		int capacity = input.nextInt();
		System.out.println(sm.addCart(id, capacity));
	}
	
	private static void addBag(Scanner input, Supermercado sm){
		String id = input.next();
		int capacity = input.nextInt();
		System.out.println(sm.addBag(id, capacity));
	}
	
	private static void addItem(Scanner input, Supermercado sm){
		String id = input.next();
		int price = input.nextInt();
		System.out.println(sm.addItem(id, price));
	}
	private static void addtoBag(Scanner input, Supermercado sm){
		String item = input.next();		
		String bag = input.next();
		System.out.println(sm.toBag(bag, item));
	}
	private static void addtoCart(Scanner input, Supermercado sm){
		String bag = input.next();		
		String cart = input.next();
		System.out.println(sm.toCart(bag, cart));
	}
	private static void pay(Scanner input, Supermercado sm){
		String cart = input.next();
		System.out.println(sm.list(cart));
	}
	private static void list(Scanner input, Supermercado sm){	
		String cart = input.next();
		System.out.println(sm.pay(cart));
	}
}
