package stack;

public class StackUsingArray {

	// Size of Stack
	private int maxSize;
	
	// container for list of items
	private int [] stackArray;
	
	// this will represent an index position of the last item that was placed on top of the stack
	private int top;
	
	
	public StackUsingArray(int size) {
		this.maxSize = size;
		this.stackArray = new int [maxSize];
		this.top = -1;
	}
	
	
	// Push - putting an item on top of the stack
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack is already full");
			return;
		}
		top++;
		stackArray[top] = item;
	}
	
	/** Pop - remove item from top of the stack 
	 *  top variable is very important
	 *  it is being used as a pointer to reference certain cells in the array
	 *  in reality we are not removing item from the array 
	 *  we changing the pointer and overriding those values
	 * 
	 * @return
	 */
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int oldTop = top;
		top--;
		return stackArray[oldTop];
	}
	
	public int peak() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	
}
















