package q1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueX q=new QueueX(5);
		StackX s= new StackX(5);
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 5 characters: ");
		for(int i=0; i<5; i++) {  //Insert to queue
			char num=scanner.next().charAt(0);
			q.insert(num);
		}
		
		System.out.println("Before:");
		for(int i=0; i<5; i++) {//Remove from queue display then add to stack
			char x=q.remove();
			System.out.print(x+" ");
			s.push(x);
		}
		System.out.println(" ");
		
		System.out.println("After:");
		for(int i=0; i<5; i++) {//Remove from stack and display
			char y=s.pop();
			System.out.print(y+" ");
			
		}
		
	}

}
