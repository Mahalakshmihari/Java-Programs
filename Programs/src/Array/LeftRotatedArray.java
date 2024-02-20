package Array;

import java.util.Arrays;

public class LeftRotatedArray {


	public static void main(String[] args) {
		int[] arr= {4,2,7,9,5,8};
		int n=1;
		int temp;
		for(int k=0;k<n;k++)
		{
			boolean b=true;
	
			for(int i=0;b;i++)
			{
			for(int j=0;j<arr.length;j++)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			b=false;
			}
			
		}
		System.out.println(Arrays.toString(arr));

}}
