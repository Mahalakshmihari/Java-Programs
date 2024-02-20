package stringPrograms;

public class addingZero {

	public static void main(String[] args) {
		String s="12345";
		String s1="";
		String s3="12345";
		for (int i=0;i<s.length();i++)
		{
		  s1=s1+s.charAt(i)+"0";	
		}
		System.out.println(s1);
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s3.length();i++)
		{
			sb.append(s3.charAt(i)+"0");
		}
		System.out.println(sb);
	}
}

