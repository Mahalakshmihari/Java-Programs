package Array;

public class OccuranceElement {
	public static void main(String[] args) {
		int [] arr= {5,4,3,4,5,2,1,3,2,9};
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
			System.out.println(arr[i]+" = "+count+" times");
			}
		}
		
	}

}
