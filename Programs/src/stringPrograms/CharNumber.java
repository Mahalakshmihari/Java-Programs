package stringPrograms;
public class CharNumber {
	static String manipulation(int num,String c,String res)
	{
		String b=c;
		for(int i=0;i<num-1;i++)
		{
			b=b+c;
		}
		return b;
	}
	public static void main(String[] args) {
		String a="12A3B4C5D";
		String res="";
//		for(int i=0;i<a.length();i=i+2)
//		{
			
//			String s1=String.valueOf(a.charAt(i));
//			int num=Integer.parseInt(s1);
//			for(int j=i+1;j<=i+1;j++)
//			{
//				String c=String.valueOf(a.charAt(j));
//				res+= manipulation(num,c,res);
//			}
//		}
//		String n="";
//		for(int i=0;i<a.length();i++)
//		{
//			char s=a.charAt(i);
//			if(s>='0'& s<='9')
//			{
//				 n=n+s;
//			}
//			else
//			{
//				s=a.charAt(i);
//				int num=Integer.parseInt(n);
//				for(int k=0;k<num;k++)
//				{
//					System.out.print(s);
//				}
//				n="";
//			}
//			
//
//		}
//		System.out.println(res);
		
		char[] ch=a.toCharArray();
		for( int i=0;i<ch.length;i++)
		{
			String result="";
			while(ch[i]>='0' && ch[i]<='9')
			{
				result=result+ch[i];
				i++;
			}
			int number=Integer.parseInt(result);
			char c=ch[i];
			for(int j=0;j<number;j++)
			{
				System.out.print(c);
			}
		}
	}
}
