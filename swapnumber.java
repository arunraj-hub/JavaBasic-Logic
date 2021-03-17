package InterviewQA;

public class swapnumber {
	public static void main(String args[])
	{
		int a=10,b=20;
		System.out.println("Before Swapping:"+a+" & "+b);
		/*Logic 1
		int t=a;
		a=b;
		b=t;*/
		
		/*logic 2 using (+&-),without using third variable
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//10-30=20*/
		
		/*Logic 3 using (* & /)
		a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/20 */
		
		/*Logic 4 using Bitwise operator (XOR)
		a=a^b;//10^20=30
		b=a^b;//30^20=10
		a=a^b;//30^b=20 */
		
		//Logic 5-->Single line comment
		b=a+b-(a=b);
		System.out.println("After swapping:"+a+" & "+b);
	}
	
}
