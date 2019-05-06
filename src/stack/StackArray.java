package stack;

public class StackArray<T> implements Stack<T> {
	
	private int top;
	private int size;
	private T data[];
	
	public StackArray(int size) {
		this.size = size;
		this.top = -1;
		data = (T[]) new Object[size];
	}



	@Override
	public void push(T item) 
	{
		data[++top] = item;
	}

	@Override
	public T pop() throws StackEmpty {
		if(top == -1) {
			throw new StackEmpty("Stack is empty");
		}
		return data[top--];
	}
	
	public int getTop()
	{
		return top;
	}
	
	public T[] getData()
	{
		return data;
	}
	
	public int getSize()
	{
		return size;
	}
}
