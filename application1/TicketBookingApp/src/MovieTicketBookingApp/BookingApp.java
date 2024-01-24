package MovieTicketBookingApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Movies
{
	private String movie;
	public Movies(String movie)
	{
	this.setMovie(movie);
	}
	public void setMovie(String movie)
	{
		this.movie=movie;
	}

	
}
//class admin 
//{
//	void 
//}
public class BookingApp {
	static void showTimings()
	{
		System.out.println("Enter show timing : ");
		//double timing =s1.nextDouble();
	}
	
	public static void main(String[] args) {
		System.out.println("\n**********WELCOME TO MR CINEMA**********\n");
		System.out.println("ON GOING MOVIES \n"
				+ "-------------------------------------------------------\n"
				+ "\b AQUAMAN2(U/A)\b \n"
				+ "aquaman movie per ticket cost = Rs.500.0\n\n"
				+ "SHOW TIMINGS:  13:00 PM       18:00 PM\n"
				+ "-------------------------------------------------------\n"
				+ "\b LE0 ACTION \b\n"
				+ "Leo movie per ticket cost = Rs.300.0\n\n"
				+ "SHOW TIMINGS:  10:15 AM       14:30 PM\n"
				+ "-------------------------------------------------------\n");
		Scanner s1=new Scanner (System.in);
		
		Movies m1=new Movies("leo");
		Movies m2=new Movies("aquaman");
		//array list of movies
	    List<Movies> movieList = new ArrayList<Movies>();
	    //adding movies
	    movieList.add(m1);
	    movieList.add(m2);

		System.out.println("Enter movie name : ");
		String movieName=s1.next();
		if (movieList.contains(movieName))
		{
		System.out.println("hi");	
		}
		
		
	}

}
