package basics;
public class anagram {
public static void main(String[] args) {
	String s="maha"; 
	String t="ahma";
			
	int sc=0,tc=0;
	char[] sChar=s.toCharArray();
	char[] tChar=t.toCharArray();


	if(sChar.length == tChar.length)
		{
		for(int i=0;i<sChar.length;i++)
		{
			sc+=s.charAt(i);
		
			tc+=t.charAt(i);
			
		}
		
		System.out.println((sc==tc)? "anagaram strings":"not anagram string");
		}
	else
	{System.out.println("not an anagram");}

	
}
}
