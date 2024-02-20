package Array;

import java.util.Arrays;

public class NthMaxMin {
	static void nthMax(int[] arr)
	{
		int fmax=0,smax=0,tmax=0;
		for(int x:arr)
		{
			if(x>fmax)
			{
				tmax=smax;
				smax=fmax;
				fmax=x;
			}
			else if(x> smax)
			{
				tmax=smax;
				smax=x;
			}
			else if(x>tmax)
			{
				tmax =x;
			}
			
		}
		System.out.println("First Maximum Value:"+fmax);
		System.out.println("Second Maximum Value:"+smax);
		System.out.println("Third Maximum Value:"+tmax);


	}
	static void nthMin(int[] arr)
	{
		int fmin=Integer.MAX_VALUE,smin=Integer.MAX_VALUE,tmin=Integer.MAX_VALUE;
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]<fmin)
			{
				tmin=smin;
				smin=fmin;
				fmin=arr[x];
			}
			else if(arr[x]<smin)
			{
				tmin=smin;
				smin=arr[x];
			}
			else if(arr[x]<tmin)
			{
				tmin =arr[x];
			}
			
		}
		System.out.println("First Minimum Value:"+fmin);
		System.out.println("Second  Minimum Value:"+smin);
		System.out.println("Third  Minimum Value:"+tmin);


	}
	public static void main(String[] args) {
		int[] arr= {5,1,2,3,9,7,12};
		
		nthMax(arr);
		System.out.println("--------------");
		nthMin(arr);
		System.out.println("*************************************");
		int [] arr1= {3,5,46,24,78,34,98,6};
		Arrays.sort(arr1);
		System.out.println("using in built......");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("-----------------");
		System.out.println(arr1[arr1.length-1]);
		System.out.println(arr1[arr1.length-2]);
		System.out.println(arr1[arr1.length-3]);



		
		
	}
}
