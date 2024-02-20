package FileHandel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Admin  {
	 static Scanner sc1=new Scanner(System.in);
	 static File f1=new File("J:\\MAHA\\m\\Handling\\");	
	 static String[] files=f1.list();
	 static String fname="";
	 static boolean res=true;
	 public static int choice;
	 static String yesOrNo="".toLowerCase();
	 static void fileName(String fname)
	 {
	   f1=new File("J:\\MAHA\\m\\Handling\\"+fname);
	 }
	 static void deleteFile() 
		{
			System.out.println(Arrays.toString(files));
			System.out.println("Enter Your FileName Only...[Without Extension] "
					+ "FileName You Want To Delete: ");
			while(res)
			{
				fileName(fname=sc1.next().toLowerCase()+".txt");
				if(f1.exists()) {
				f1.delete();
				System.out.println(fname+" File Is Deleted");
				res=false;
				
			}else
				System.out.println("Enter valid FileName.");
			}
			System.out.println("Want to continue Admin. (yes/no)");
			yesOrNo=sc1.next();
			if(yesOrNo.equals("yes"))
				adminChoice();
			else
				System.exit(100);
		}	
	 static void viewFile()

	 {		 try {
			System.out.println(Arrays.toString(files));
			System.out.println("Enter Your FileName Only...[Without Extension] ");	
			System.out.println("FileName You Want To View: ");
			while(res)	
			{
			fname=sc1.next().toLowerCase()+".txt";
			fileName(fname);
			if(f1.exists())
			{
				FileReader fr=new FileReader(f1);
				BufferedReader br=new BufferedReader(fr);
				String line="";
				while((line=br.readLine())!=null)
					System.out.println(line);
				
				br.close();
				res=false;
			}else
				System.out.println("enter valid file name");
			}
			System.out.println("Want to continue Admin.(yes/no)");
			yesOrNo=sc1.next();
			if(yesOrNo.equals("yes"))
				adminChoice();
			else
				System.exit(100);}
	 catch( IOException w)
	 {} 
	}
	
	 static void adminChoice(int choice) 	 {
		 if(choice==1) 
				viewFile();
			else 
				deleteFile();
	 }
	 static void adminChoice()
	 {
		 System.out.println("ViewFile(1) or DeleteFile(2) \n Choose:");
		 int choice = sc1.nextInt();
		 adminChoice(choice);
	 }
}
