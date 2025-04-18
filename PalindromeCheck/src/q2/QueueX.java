package q2;

public class QueueX {
	
	int maxSize;
	char queArray[];
	int front;
	int rear;
	int nItems;
	public QueueX(int s) {
		
		this.maxSize = s;
		this.queArray =new char[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public boolean isEmpty() {
		return nItems==0;
	}
	public boolean isFull() {
		return rear==maxSize-1;
	}
	
	public void insert(char j) {
		if(!isFull()) {
			queArray[++rear]=j;
			nItems++;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	public char remove() {
		if(!isEmpty()) {
			nItems--;
			return queArray[front++];
		}
		else {
			System.out.println("Stack Empty");
			return '\0';
		}
		
	}
	public char peekFront() {
		if(!isEmpty()) {
			return queArray[front];
		}
		else {
			System.out.println("Stack Empty");
			return '\0';
		}
	}
	
}
