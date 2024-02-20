package Array;

import java.util.Arrays;

public class RotatedArray {

	public static void main(String[] args) {
		int[] arr= {4,2,7,9,5,8};
		int n=1;
		int temp;
		for(int k=0;k<n;k++)
		{
			boolean b=true;
	
			for(int i=arr.length-1;b;i--)
			{
			for(int j=arr.length-1;j>=0;j--)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			b=false;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
