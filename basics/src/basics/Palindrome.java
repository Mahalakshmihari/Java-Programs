package basics;

public class Palindrome {
	static boolean palindrome(int n)
	{
		int temp=n;
	int rev=0;
	while(n>0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
				
	} 
	
	return (temp==rev);
	}
	public static void main(String[] args) {
	System.out.println("palidromeOrNot");
	for(int i=1;i<=100;i++)
		{
			if(palindrome(i))
			{
				System.out.println(i+ "is pailndrome");
			}
		}
		
	}

}
