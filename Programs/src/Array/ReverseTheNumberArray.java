package Array;

import java.util.Arrays;

public class ReverseTheNumberArray {
	static int maxElement(int arr[])
	{int fmax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fmax)
				fmax=arr[i];		
		}
		return fmax;
	}
	public static void main(String[] args) {
		int arr[]= {36,56,27,78,70,903,102};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=maxElement(arr))
			{
				int n=arr[i];
				String resElement="";
				int j=1;
				while(n>0)
				{
					
					int rem=n%10;
					if(j==1 && rem==0)
					{
						n=n/10;
						continue;
					}
					j++;
					resElement+=rem;
					n=n/10;

					
				}
				arr[i]=Integer.parseInt(resElement);
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
