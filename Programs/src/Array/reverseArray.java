package Array;

import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {
		int  arr[]= {3,567,2,56,2,56,13};
		int  arr1[]= {3,567,2,56,2,56,13};

//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+", ");
//		}
	      System.out.println(Arrays.equals(arr, arr1));
	      

		int start=0,end=arr.length-1;
		int temp=0;

		while (start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
      System.out.println("sorted Array:"+Arrays.toString(arr));
		}

}
