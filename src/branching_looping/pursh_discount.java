package branching_looping;
import java.util.*;
public class pursh_discount {
	public static void main(String args[]) {
		double dis;
		Scanner val=new Scanner(System.in);
		System.out.print("Enter the purshase amount :");
		Double amt=val.nextDouble();
		
		if(amt<500) {
			System.out.println("No discount is applied and price  :"+amt);
		}else if(amt>=500 && amt<=1000) {
			dis=10*amt/100;
			System.out.println(dis);
			amt=amt-dis;
			System.out.println("10% discount is applied and the Price :"+amt);
		} if (amt>1000) {
			dis=20*amt/100;
			amt=amt-dis;
			System.out.println("20% discount is applied and the Price :"+amt);
		}
		val.close();
		}

}
