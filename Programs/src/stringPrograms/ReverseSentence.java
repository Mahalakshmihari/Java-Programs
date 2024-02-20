package stringPrograms;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter String:");
		String s=s1.nextLine();
		String[] a=s.split(" ");
		String val="";

		for(int i=0;i<a.length;i++)
		{
			String word=a[i];
			String rev="";
			for(int j=word.length()-1;j>=0;j--)
			{
			
				rev+=word.charAt(j);
			}
			val+=rev+" ";
		}
		System.out.println(val);



	}
}
