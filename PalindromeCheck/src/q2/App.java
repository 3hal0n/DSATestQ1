package q2;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter word to check: ");
		String t=scanner.next().toUpperCase();
		
		QueueX q=new QueueX(t.length());
		StackX s=new StackX(t.length());
		
		
		char[] v=t.toCharArray();
		for(int i=0; i<t.length(); i++) {
			char x=v[i];
			q.insert(x);
			s.push(x);
		}
		boolean isPalindrome=true;
		for(int i=0; i<t.length(); i++) {
			char y=q.remove();
			char z=s.pop();
			
			if(y==z) {
				isPalindrome=true;
			}
			else {
				isPalindrome=false;
				break;
			}
		}
		
		if(isPalindrome==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
		
   }

}
