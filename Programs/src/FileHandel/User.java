package FileHandel;

import java.io.FileWriter;
import java.io.IOException;

public class User extends Admin {
	static void fileCreate() throws IOException
	{
		System.out.println("Enter Your FileName Only[Without Extension] "
				+ "Enter Your FileName:");
		fileName(fname=sc1.next()+".txt");
		if(f1.exists()){
			System.out.println("FileName Already Exists..Enter New FileName.");
			fileCreate();
		}
		else{
			f1.createNewFile();
			FileWriter fw=new FileWriter(f1);
			System.out.println("Enter Name :");
			fw.write("Name:"+sc1.next()+"\n");
			System.out.println("Enter D.O.B :(FORMAT: 1stjan2024)");
			fw.write("Date Of Birth: "+sc1.next()+"\n");
			System.out.println("Enter qualification:");
			fw.write("Qualification: "+sc1.next()+"\n");
			fw.flush();
			fw.close();
			System.out.println("saved");
			System.out.println("Continue User..? (yes/no)");
			yesOrNo=sc1.next();
			if(yesOrNo.equals("yes"))
				fileCreate();
			else
				System.exit(100);
		}
	}
}
