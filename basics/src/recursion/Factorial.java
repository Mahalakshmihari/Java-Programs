package recursion;

import java.util.Scanner;

public class Factorial {

	static int fact(int n)
	{
	
			   if(n==0 || n==1)
			{
				return 1;
			}
			else
			{
				return n*fact(n-1);
			}
		}
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter number:"
				+ "");
		int x= s1.nextInt();
		System.out.println("factorial is="+fact(x));
		System.out.println("n th elemrnt of fibonacci element is="+fibonacci.fib(8));
		s1.close();	}
	
}
//printing element nth of  fibonacci
class fibonacci
{
	static int  fib(int n)
	{
		if (n==0)
		
			return 0;
		else if(n==1|| n==2)
			return 1;
		else 
			return fib(n-1)+fib(n-2);
		
	}
	
	
	}