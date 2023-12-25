package basics;

public class PrintingNumAndReverse 
{
	
	static void print (int f,int s,int n)
	{
		if(n>=1)
		{
			
			int t=f+s;
			System.out.println(t);
			
			print(s,t,--n);
		
		System.out.println(t);
		}
		
	}
public static void main(String[] args) {
	int n=3;
	int f=0,s=1;
	print(f,s,n);
}	
	

}
