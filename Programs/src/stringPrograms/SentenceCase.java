package stringPrograms;

public class SentenceCase {
	public static void main(String[] args) {
		String s="this is my program";
		String sentance="";
		String[] b=s.split(" ");
		for(int i=0;i<b.length;i++)
		{
			String word=b[i];
			for(int j=0;j<word.length();j++)
			{
				if(j==0 && Character.isLowerCase(word.charAt(j)))
				{
					sentance=sentance+(char)(word.charAt(j)-32);
				}
				else
					sentance+=word.charAt(j);
			}
			sentance+=" ";
		}
		System.out.println("-"+sentance);
	}
}
