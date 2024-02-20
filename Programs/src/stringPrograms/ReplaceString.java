package stringPrograms;

public class ReplaceString {
public static void main(String[] args) {
	String s1="This is my program";
	System.out.println(s1.length());
	String[] s2=s1.split(" ");
	for(int i=s2.length-1;i>=0;i--)
	{
		System.out.print(s2[i]+" ");
	}
//	for(int i=0;i<s2.length;i++)
//	{
//		for(int j=s2.length;j>=0;j--)
//		{
//			if(s2[i])
//		}
//	}
}
}
