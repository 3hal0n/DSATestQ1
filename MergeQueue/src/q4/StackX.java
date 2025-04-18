package q4;

public class StackX {
	private int maxSize;
	private char stackArray[];
	private int top;
	
	public StackX(int s) {
		this.maxSize = s;
		this.stackArray =new char[maxSize];
		this.top = 0;
	}
	public boolean isFull() {
		return top==maxSize-1;
	}
	public boolean isEmpty(){
		return top==0;
	}
	public void push(char j) {
		if(!isFull()) {
			stackArray[top++]=j;
		}
		else {
			System.out.println("Stack full");
		}
	}
	public char pop() {
		if(!isEmpty()) {
			return stackArray[--top];
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
