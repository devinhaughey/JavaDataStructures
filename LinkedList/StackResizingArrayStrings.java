public class StackResizingArrayStrings
{
	private String[] s;
	private int N = 0;
	
	public StackResizingArrayStrings() 
	{
		s = new String[1];
	}
	
	public boolean isEmpty()
	{
		return N == 0;
	}

	public void push(String item) 
	{
		if (N == s.length) 
		{
			resize(2 * s.length);
		}
		
		s[N++] = item;
	}

	public String pop() 
	{
		// avoid loitering, can reclaim memory since no references
		String item = s[--N];
		s[N] = null;
		
		if (N > 0 && N == s.length/4) 
		{
			resize(s.length/2);
		}
		
		return item;
	}
	
	private void resize(int capacity)
	{
		String[] copy = new String[capacity];
		
		for (int i = 0; i < N; i++) 
		{
			copy[i] = s[i];
		}
		
		s = copy;
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
		StackResizingArrayStrings stackArray = new StackResizingArrayStrings();
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

		stackArray.push("bob");
		stackArray.push("steve");
	}
}
