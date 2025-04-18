package q2;

public class StackX {
	private int top;
	private int maxSize;
	private char stackArray[];
	
	public StackX(int s) {
	
		this.maxSize = s;
		this.top = -1;
		this.stackArray = new char[maxSize];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==maxSize-1;
	}
	
	public void push(char j) {
		if(!isFull()) {
			stackArray[++top]=j;
		}
		else {
			System.out.println("Stack full");
		}
	}
	
	public char pop() {
		if(!isEmpty()) {
			return stackArray[top--];
		}
		else {
			System.out.println("Stack empty");
			return '\0';
		}
	}
	
	public char peek() {
        if(!isEmpty()) {
			return stackArray[top];
		}
		else {
			System.out.println("Stack empty");
			return '\0';
		}
	}
	
}
