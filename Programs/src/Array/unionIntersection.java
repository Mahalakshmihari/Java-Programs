package Array;

import java.util.Arrays;

public class unionIntersection {
	public static String toString(int a[]) {
		if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
        	if(a[i]!=0)
        	{
            b.append(a[i]);
        	}
            if (i == iMax)
                return b.append(']').toString();
            if(a[i+1]!=0 )
            {
            b.append(", ");
            }
        }
	}
public static void main(String[] args) {
	int arr1[]= {2,4,6,1,9,7};
	int arr2[]= {3,6,1,12,4,13};
	int intersection[]= new int[(arr1.length)];
	int union[]=new int[arr1.length+arr2.length];
//	System.out.println(unionIntersection.toString(intersection));
	int k=0;
	int m=0;
	for(int i=0;i<arr1.length;i++)
	{
		for (int j=0;j<arr2.length;j++)
		{
			if(arr1[i]==arr2[j])	
			{
				intersection[k]=arr1[i];
				k++;
			}			
		}
		union[m]=arr1[i];
		m++;
	}
	System.out.println(m);
	for(int i=0;i<arr2.length;i++)
	{
		boolean check=true;
		for(int j=0;j<intersection.length;j++)
		{
			if(arr2[i]==intersection[j])
			{
				check=false;
			}
		}
		if(check)
		{
			union[m]=arr2[i];
			m++;
		}

	}
	System.out.println("intersection:"+unionIntersection.toString(intersection));
	System.out.println("union: "+unionIntersection.toString(union));

//	System.out.println(intersection.length);
	Object arr[]=new Object[4];
	System.out.println(Arrays.toString(arr));

}
}
