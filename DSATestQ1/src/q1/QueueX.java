package q1;

public class QueueX {
	int rear;
	int front;
	char queArray[];
	int maxSize;
	int nItems;
	
	public QueueX(int size) {
		this.maxSize = size;
		this.queArray = new char[maxSize];
		this.nItems = 0;
		this.rear = -1;
		this.front = 0;
	}
	
	public boolean isEmpty() {
		return nItems==0;
	}
	public boolean isFull() {
		return rear==maxSize-1;
	}
	
	public void insert(char j) {
		if(rear==maxSize-1) {
			System.out.println("Queue full");
		}
		else {
			queArray[++rear]=j;
			nItems++;
		}
	}
	
	public char remove() {
		if( nItems==0) {
			System.out.println("Empty Queue");
			return '\0';
		}
		else {
			nItems--;
			return queArray[front++];
		}
		
	}
	
	public char peekFront() {
		if( nItems==0) {
			System.out.println("Empty Queue");
			return '\0';
		}else {
			return queArray[front];
		}
	}
	
}
