package branching_looping;
import java.util.*;
public class reverse_no {
	public static void main(String args[]) {
		int xy,size=0,yz=0,temp;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number :");
		xy=obj.nextInt();
		obj.close();		
		int st=xy;
		for(;st!=0;st=st/10,++size) {}
	
		for(int i=0;i<size;i++) {
			 temp=xy%10;
			 yz=yz*10+temp;
			 xy=xy/10;
		}
			
		System.out.println("The reversed number is: "+yz);
		
	}
}
