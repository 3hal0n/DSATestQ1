package sortQueue;

public class QueueX {
	int maxSize;
	int queArray[];
	int front;
	int rear;
	int nItems;
	
	public QueueX(int s) {
		
		this.maxSize = s;
		this.queArray = new int[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems=0;
	}
	
	public boolean isFull() {
		return rear==maxSize-1;
	}
	public boolean isEmpty() {
		return nItems==0;
	}
	
	public void insert(int j) {
		if(!isFull()) {
			queArray[++rear]=j;
			nItems++;
		}
		else {
			System.out.println("Queue full");
		}
	}
	public int remove() {
		if(!isEmpty()) {
			nItems--;
			return queArray[front++];
		}
		else {
			System.out.println("Queue empty");
			return '\0';
		}
	}
	public int peekFront() {
		if(!isEmpty()) {
			return queArray[front];
		}
		else {
			System.out.println("Queue empty");
			return '\0';
		}
	}
	
}
