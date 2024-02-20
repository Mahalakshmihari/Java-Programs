package Array;

public class MaximumDuplicate {
	public static void main(String[] args) {
		int [] arr= {5,4,3,4,5,2,4,1,3,2,5,9};
		int maxCount=0,maxElement=0,TmaxDuplicate=1;
		boolean [] visited =new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i]==false)
			{
				int count =1;
			for(int j=i+1;j<arr.length;j++)
		    {
				if(arr[i]==arr[j])
				{
					count ++;
					visited[j]=true;
					
				}	
		    }  
			if(count>maxCount)
			{
				maxCount=count;
				maxElement=arr[i];
			}
//			if(count==1)// if(count>2) ==> repeated number
//			{
//				System.out.println("unique number:"+arr[i]);
//			}
			}
		}
		System.out.println("Maximum Duplicate Value:"+maxElement+" Present "+maxCount+" times");
		
		
	}
}
