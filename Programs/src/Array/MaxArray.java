package Array;



public class MaxArray {
	static void maxMin(int [] arr)
	{
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]< min)
			{
				
				min=arr[i];
			}
		}
		
		System.out.println("max Value="+max);
		System.out.println("min Value="+min);

	}
	
	public static void main(String[] args) {
		int arr[]= {23,67,2,89,56};
		maxMin(arr);
		
		
	}
}
