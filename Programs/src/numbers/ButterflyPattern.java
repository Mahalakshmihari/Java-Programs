package numbers;
import java.util.Scanner;
public class ButterflyPattern {
public static void main(String[] args) {
	int n=5;
	int print=1;
	for (int i=1;i<=n;i++) 
	{
		for(int k=1;k<=n;k++)
		{
			if(k<=print|| k>=n-print+1)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		if(i<=n/2)
			print++;
		else
		{
			print--;
		}
		System.out.println();
	}
}
}
