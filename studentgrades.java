package task2;
import java.util.*;
public class studentgrades {
	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the number of subject:" );
		int totalsub=sc.nextInt();
		
		int mark[]=new int[totalsub];
	
		for(int i=0;i<totalsub;i++)
		{
			System.out.print("Enter the mark"+(i+1)+":");
			mark[i]=sc.nextInt();
		}
		int total=0;
		for(int totalmarks :mark) {
			total+=totalmarks;
		}
		double avg=total/totalsub;
		
		char grade;
		if(avg>=90)
		{
			grade='A';
		}
		else if(avg>=80)
		{
			grade='B';
		}
		else if(avg>=70)
		{
			grade='C';
		}
		else if(avg>=60)
		{
			grade='D';
		}
		else
		{
			grade='F';
			System.out.println("Sorry ! You are fail");
		}
		System.out.println("Total mark : "+total+" Average mark : "+avg+" Grade : "+grade);
	}

}
