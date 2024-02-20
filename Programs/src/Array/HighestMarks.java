package Array;

import java.util.Arrays;
import java.util.Scanner;

public class HighestMarks 
{
 public static void main(String[] args)
 {
	 Scanner sc1=new Scanner(System.in);
	 System.out.println("enter the number of elements in array: ");
	 int n=sc1.nextInt();
	 int[] arr=new int[n];
	 System.out.println("enter the elements of array:");
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=sc1.nextInt();
	 }
	 System.out.println("No Of Highest Elements: ");
	 
	 int highest=sc1.nextInt();

	 for(int j=0;j<arr.length;j++)
	 {
		 for(int k=j+1;k<arr.length;k++)
		 {
			 if(arr[j]<arr[k])
			 {
				int temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
			 }
		 }
	 }
	 int sum=0;
	 for(int i=0;i<highest;i++)
	 {
		sum+=arr[i]; 
	 }
	 System.out.println("Output: "+sum);
}
}
