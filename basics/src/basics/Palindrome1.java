package basics;

public class Palindrome1 {
public static void main(String[] args) {
	

	String s="121",rev="";
	int len=s.length();
	
	for (int i=len-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}

	if(s.equals(rev))
		System.out.println(rev+" palindrome");
	else
		System.out.println(rev+"not a palidrome");
}	
}
