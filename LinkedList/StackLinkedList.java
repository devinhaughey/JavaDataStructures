public class StackLinkedList {

	private Node first = null;

	private class Node {
		String item;
		Node next;
	}

	void push(String item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}

	public String pop() {
		String item = first.item;
		first = first.next;
		return item;
	}

	public boolean isEmpty() {
		return first == null;
	}

	void status() {
		
		if (isEmpty()) {
		    System.out.println("Stack is empty");
		} else {
		    System.out.println("Stack is not empty");
		}

	}

	public static void main(String [] args) {
		StackLinkedList head = new StackLinkedList();

		head.push("bob");
		head.push("steve");
		head.pop();
		head.status();
		head.pop();

	}
}
