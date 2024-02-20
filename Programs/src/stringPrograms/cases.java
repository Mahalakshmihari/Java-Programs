package stringPrograms;

import java.util.Scanner;

public class cases {
	static String toUpperCase(String s1)
	{
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch= s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				s2=s2+(char)(ch-32);
			}
			else
			{
				s2=s2+ch;
			}
		}
		return s2;
	}
	static String toLowerCase(String s1)
	{
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch= s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				s2=s2+(char)(ch+32);
			}
			else
			{
				s2=s2+ch;
			}
		}
		return s2;
	}
	static String lowerToUpper(String s1)
	{
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch= s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				s2=s2+(char)(ch+32);
			}
			else if(ch>='a'&& ch<='z')
			{
				s2=s2+(char)(ch-32);
			}
			else
			{
				s2=s2+ch;
			}
		}
		return s2;
	}
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter the string:");
	String s1=sc1.nextLine();
	System.out.println(toLowerCase(s1));
	System.out.println(toUpperCase(s1));
	System.out.println("enter the gmail:");
	String s2=sc1.nextLine();
	System.out.println(lowerToUpper(s2));
	
}
}
