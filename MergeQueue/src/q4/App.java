package q4;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackX s=new StackX(10);
		QueueX q=new QueueX(10);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 5 characters: ");
		for(int i=0; i<5;i++) {
			char c=scanner.next().charAt(0);
			q.insert(c);
			
		}
		System.out.println("Before: ");
		for(int i=0; i<5;i++) {
		    char x=q.remove();
		    System.out.print(x+" ");
		    s.push(x);
		    q.insert(x);
		    
		}
		
		for(int i=0; i<5;i++) {
		    char y=s.pop();
		    q.insert(y);
		}
		
		System.out.println("\nAfter: ");
		for(int i=0; i<10;i++) {
		    char z=q.remove();
		    System.out.print(z+" ");
		}
		
		
	}

}
