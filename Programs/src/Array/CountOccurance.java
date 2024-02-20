package Array;

public class CountOccurance {
	public static void main(String[] args) {
		int tmaxElement=0,thirdCount=0;
	
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
		if(count==1)// if(count>2) ==> repeated number
			System.out.println("unique number:"+arr[i]);
		if(count>1)
		{
			thirdCount++;
			tmaxElement=arr[i];
			if(thirdCount==3)
				break;

		}}
	}
	if(thirdCount==3)
		System.out.println("third max number: "+tmaxElement);
	
	}
}
