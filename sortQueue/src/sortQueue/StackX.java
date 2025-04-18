package sortQueue;

public class StackX {
	private int maxSize;
	private int stackArray[];
	private int top;
	public StackX(int s) {
		
		this.maxSize = s;
		this.stackArray = new int[maxSize];
		this.top = -1;
	}
	public boolean isFull() {
		return top==maxSize-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(int j) {
		if(!isFull()) {
			stackArray[++top]=j;
		}
		else {
			System.out.println("Stack Full");
		}
	}
	public int pop() {
		if(!isEmpty()) {
			return stackArray[top--];
		}
		else {
			System.out.println("Stack Empty");
			return '\0';
		}
	}
	public int peek() {
		if(!isEmpty()) {
			return stackArray[top];
		}
		else {
			System.out.println("Stack Empty");
			return '\0';
		}
	}
}
