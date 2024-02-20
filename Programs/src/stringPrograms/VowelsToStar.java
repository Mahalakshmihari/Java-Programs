package stringPrograms;

public class VowelsToStar {
	public static void main(String[] args) {
		String s1="I am Developer".toLowerCase();
		for(int i=0;i<s1.length();i++)
		{char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				s1=s1.replace(ch, '*');
			}
			
		}System.out.println(s1);
	}

}
