package iterator;
import java.util.NoSuchElementException;

public interface Iterator<E> {

	void rewind();
	
	boolean hasNext();
	
	E next() throws NoSuchElementException;
}
