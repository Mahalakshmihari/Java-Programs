package numbers;

import java.util.Scanner;

public class SuperDigit {
	static int super_digit(int num)
	{
		int sum=0;
		while (num>0|| sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the digit:");
	int n=s1.nextInt();
	System.out.println(super_digit(n));
	
}
}
