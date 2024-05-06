package branching_looping;
import java.util.*;
public class pattern {
	public static void main(String args[]) {
		Scanner val=new Scanner(System.in);
		System.out.println("Enter number :");
		int k=val.nextInt();
	
		for(int i=k;i>=1;i--) {
			
			for(int j=k;j>=1;j--) {
				if(j>=i) {
					System.out.print(j);
				}
				else {
					System.out.print(i);
				}
				
			}
			System.out.println();
		}
		val.close();
	}

}
