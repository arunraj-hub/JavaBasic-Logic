
package InterviewQA;
import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=in.nextInt();
		
		//Logic 1.Using Algorithm
		int rev=0;
		
		/*while(num!=0)
		{
			rev=rev*10+num%10;//0+1234%=4 40+3=43 430+2=432 4320+1=4321
			num=num/10;//1234/10=123  123/10=12  12/10=1 1/10=0
		}
		*/
		
		//using StringBuffer class
		StringBuffer rev1;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev1=sb.reverse();
		System.out.print("Reverse Number is: "+rev1);

	}

}
