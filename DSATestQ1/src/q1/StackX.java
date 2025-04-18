package q1;

public class StackX {
	private int top;
	private char[] stackArray;
	private int maxSize;
	
	public StackX(int s) {
		
		this.top = -1;
		this.maxSize = s;
		this.stackArray = new char[maxSize];
		
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==-1;
	}
	
	public void push(char j) {
		if(top==maxSize-1) {
			System.out.println("Stack full");
		}
		else {
			 stackArray[++top]=j;
		}
	}
	public char pop() {
		if(top==-1) {
			System.out.println("Stack Empty");
			return 0;
		}
		else {
			return stackArray[top--];
		}
		
	}	
	public char peek() {
		if(top==-1) {
			System.out.println("Stack full");
			return 0;
		}
		else {
			return stackArray[top];
		}
	}
	
}
