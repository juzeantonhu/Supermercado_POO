package container;


public interface Container<T> {
	public String getId();
	public int getCapacity();
	boolean hasReachedMaxCapacity();
	void addItem(T item);
	String getItem();
}
