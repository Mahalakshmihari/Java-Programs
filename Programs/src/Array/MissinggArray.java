package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MissinggArray {
	public static void main(String[] args) {
//		int arr[]= {2,4,5,6,7,9,10};
//		Scanner s1=new Scanner(System.in9);
		int arr[]=new int[10];
//		System.out.println("enter the/ values");
//		for (int i=0;i<arr.length;i++)
//		{
//			arr[i]=s1.nextInt();
//		}

		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=8;
		arr[5]=9;
System.out.println(Arrays.toString(arr));
      // sorting	
		for(int i=0;i<=arr.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;}
			}

		}
		System.out.println("Sorted Array:"+Arrays.toString(arr));
		int arr1[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
			   System.out.println(arr[i]);
				arr1[j]=arr[i];
				j++;
			}
		}
		System.out.println("--"+Arrays.toString(arr1));
//		System.out.println(arr.length);
		int index=0,range=1;

		
			while(range<=arr1.length)
			{
			if(arr1[index]!=range)
				System.out.println("Missing:"+range);
			else 
				index++;
			range++;
			}
			}

}
