package branching_looping;
import java.util.*;

public class print10to50 {
	public static void main(String args[]) {
		Scanner val=new Scanner(System.in);
		System.out.println("Enter starting number :");
		int x=val.nextInt();
		System.out.println("Enter ending number :");
		int y=val.nextInt();
		for(int i=x;i<=y;i++) {
			System.out.print(i+" ");
		}
		val.close();

}
}
