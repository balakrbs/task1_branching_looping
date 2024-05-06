package branching_looping;
import java.util.*;
public class small_3num {
	public static void main(String args[]) {
		Scanner val=new Scanner(System.in);
		System.out.println("Enter first number :");
		int a=val.nextInt();
		System.out.println("Enter second number :");
		int b=val.nextInt();
		System.out.println("Enter third number :");
		int c=val.nextInt();
		val.close();
		
		if(a<b) {
			if(a<c) {
				System.out.println(a+" is the smallest number");
			}
			else if(c<b) {
				System.out.println(c+" is the smallest number");
			}
		} else if(b<c) {
			System.out.println(b+" is the smallest number");
		}
	}

}
