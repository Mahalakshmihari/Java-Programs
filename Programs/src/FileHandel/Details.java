package FileHandel;
import java.io.*;
public class Details extends User {
	
	public static void main(String[] args) throws IOException {
		System.out.println("User-(1) or Admin-(2)");
		System.out.println("choose :");
		int ans=sc1.nextInt();
		if(ans==1) {
			System.out.println("Create your file.");
			fileCreate();
		}
		else{
			
			System.out.println("ViewFile(1) or DeleteFile(2) \n Choose:");
			choice=sc1.nextInt();
			adminChoice(choice);
				
		}
	}
	}