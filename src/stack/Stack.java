package stack;

public interface Stack<T> {
	/**
	 * 
	 * @param item
	 */
	public void push(T item) throws StackFull;
	
	/**
	 * 
	 * @return
	 */
	public T pop() throws StackEmpty;

}
