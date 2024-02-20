package stringPrograms;

public class vowels {
	public static void main(String[] args) {
		String s="this is my program";
		String sentance="";
		String[] b=s.split(" ");
		for(int i=0;i<b.length;i++)
		{
			String word=b[i];
			for(int j=0;j<word.length();j++)
			{
				char ch=word.charAt(j);
				if(ch =='A'|| ch=='E'||ch =='I'||ch=='O'||ch=='U'||ch =='a'|| ch=='e'||ch =='i'||ch=='o'||ch=='u')
				{
					ch='*';
					sentance=sentance+ch;
				}
				else
					sentance+=ch;
			}
			sentance+=" ";
		}
		System.out.println("-"+sentance);
	}

}
