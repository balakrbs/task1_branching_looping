package branching_looping;
import java.util.*;
public class neg_posit {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int x=obj.nextInt();
		
		if(x>0) {
			System.out.println(x+" is positive");
		}else {
			System.out.println(x+" is negative");
		}
		obj.close();

}
}
