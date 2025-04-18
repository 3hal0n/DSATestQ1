package q4;

public class QueueX {
	int maxSize;
	char queArray[];
	int rear;
	int front;
	int nItems;
	
	public QueueX(int s) {
		this.maxSize = s;
		this.queArray =new char[maxSize];
		this.rear = -1;
		this.front = 0;
		this.nItems = 0;
	}
	public boolean isFull() {
		return nItems==maxSize;
	}
	public boolean isEmpty() {
		return nItems==0;
	} 
	
	public void insert(char j) {
		if(isFull()) {
			System.out.println("Queue full");
		}
		else {
			if(rear==maxSize-1) {
				rear=-1;
				}
			queArray[++rear]=j;
			nItems++;
		}
	}
	
	public char remove() {
		if(isEmpty()) {
			System.out.println("Queue empty");
			return '\0';
		}
		else {
			char temp=queArray[front++];
			if(front==maxSize) {
				front=0;
				}
			nItems--;
				return temp;
		}
	}
	public char peekFront() {
		if(!isEmpty()) {
			return queArray[front];
		}
		else {
			System.out.println("Queue empty");
			return '\0';
		}
	}
	
}
