package Array;

public class DuplicateArray {
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
		if(count>1)// if(count>2) ==> repeated number
		{
			System.out.println("Duplicate number:"+arr[i]);
		}
		}
	}
	
}

}
