package container;

import java.util.ArrayList;
import java.util.List;

public abstract class ContainerClass<T> implements Container<T>{
	private String id;
	protected int capacity;
	protected int counter;
	List<T> items;
	public ContainerClass(String id, int capacity){
		this.id = id;
		this.capacity = capacity;
		counter=0;
		items = new ArrayList<T>();
	}
	
	public String getId(){
		return id;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	public boolean hasReachedMaxCapacity(){
		return capacity<counter;
	}
	
	public void addItem(T item){
		items.add(item);
	}
	
	public abstract String getItem();
}
