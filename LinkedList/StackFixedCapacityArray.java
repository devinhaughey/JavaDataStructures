
public class StackFixedCapacityArray
{
	private String[] s;
	private int N = 0;
	
	public StackFixedCapacityArray(int capacity) 
	{
		s = new String[capacity];
	}
	
	public boolean isEmpty()
	{
		return N == 0;
	}

	public void push(String item) 
	{
		s[N++] = item;
	}

	public String pop() 
	{
		// avoid loitering, can reclaim memory since no references
		String item = s[--N];
		s[N] = null;
		return item;
	}
	
	void status() {
		
		if (isEmpty()) {
		    System.out.println("Stack is empty");
		} else {
		    System.out.println("Stack is not empty");
		}

	}
	
	public static void main (String[] args)
	{
		// Since array is fixed size, if greater than 10 items pushed on
		// stack will cause a ArrayIndexOutOfBoundsException
		StackFixedCapacityArray stackArray = new StackFixedCapacityArray(10);
		stackArray.push("bob");
		stackArray.push("steve");
		stackArray.push("bob");
		stackArray.push("steve");
		stackArray.push("bob");
		stackArray.push("steve");
		stackArray.push("bob");
		stackArray.push("steve");
		stackArray.push("bob");
		stackArray.push("steve");
		
		stackArray.status();
	}
}
