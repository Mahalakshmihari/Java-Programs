package basics;

public class Pattern {
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=5;i++)
		{
			for(int s=4;s>=i;s--)
			{
				System.out.print("  ");
			}
			int m=i;

			for(int k=1;k<=2*i-1;k++)
				
			{
				if(k>=i)
				{
			       System.out.print(m+" ");
			       m--;  
				}else
				{
					
					System.out.print(m+" ");
					m++;
					
					
				}

			}
			
			System.out.println();
		}
		
	}

}
