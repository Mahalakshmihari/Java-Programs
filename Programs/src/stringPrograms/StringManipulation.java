package stringPrograms;

public class StringManipulation {
	static void unique(String s)
	{
		char arr[]=s.toCharArray();
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
			
			if(count==1) // if(count>2) ==> repeated number
			{
				System.out.println("unique: "+arr[i]);
			}
			
			}
	}
	}
	static void countOccurance(String s)
	{
		char arr[]=s.toCharArray();
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
			System.out.println("Count of "+arr[i]+"= "+count+" times");
			}
	}
	}
	static void repeated(String s)
	{
		char arr[]=s.toCharArray();
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
			if(count>1)
				System.out.println(arr[i]+" Repeated "+count+" times");
			}
	}	
	}
	public static void main(String[] args) {
		String s="Programmer";
		s.toLowerCase();
		unique(s);
		System.out.println("------------");
		countOccurance(s);
		System.out.println("------------");
		repeated(s);
		
	}

}
