package stringPrograms;

public class AbcProGram {
public static void main(String[] args) {
	String s="A2B3C4 ";
	int num=0;
	char mychar='\0';
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='0'&& ch<='9')
		{
			num=num*10+ch-48;
			
		}
		else
		{
			for(int j=1;j<=num;j++)
			{
//				System.out.print(ch);
				System.out.print(mychar);

			}
			num=0;
			mychar=ch;
			
		}
		
	}
}
}
