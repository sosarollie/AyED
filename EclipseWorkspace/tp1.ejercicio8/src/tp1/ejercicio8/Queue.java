package tp1.ejercicio8;

import java.util.*;

public class Queue<T> extends Sequence{
	protected List<T> data;
	
	public Queue() {
		this.data = new LinkedList<T>();
	}
	
	public void enqueue (T dato) {
		this.data.addLast(dato);
	}
	
	public T dequeue() {
		return this.data.removeFirst();			
	}
	
	public T head() {
		return this.data.getFirst();
	}
	
	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.data.isEmpty() ? true : false;
	}
	
	public String toString() {
		String str = "| ";
		for (T d: data) {
			str+= d + " |" + "| ";
		}
		return str;
	}

}
