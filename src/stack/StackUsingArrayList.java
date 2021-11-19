package stack;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList {
	
	List<Integer> stack = new ArrayList<>();
	
	public void push(int value) {
		stack.add(value);
	}
	
	public int pop() {
		if(stack.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stack.remove(stack.size()-1);
	}
	
	public int peak() {
		if(stack.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stack.get(stack.size()-1);
	}
	
}
