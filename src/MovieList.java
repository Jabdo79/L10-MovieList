/*Jonathan Abdo
 * Create an app that creates a list of movie objects, sorts
 * them alphabetically, and prints a list of movies by category
 * 
 * (uses InputCheck.java https://github.com/Jabdo79/InputCheck)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieList {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		ArrayList<Movie> movies = new ArrayList<Movie>();
		int userChoice = 0;
		
		//adds movies from MovieIO to my arraylist
		for(int i = 1; i < 101; i++)
			movies.add(MovieIO.getMovie(i));
		
		//sorts my arraylist of movies alphabetically thanks to an overridden compareTo in Movie!!!
		Collections.sort(movies);
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("\nThere are "+movies.size()+" in this list.");
		
		boolean cont = true;
		while(cont){
			//ask user to pick a category
			String menu = Movie.getCategoryMenu();
			userChoice = InputCheck.getInt(sc, menu+"What category are you interested in? ", 1, 4);
			switch(userChoice){
			case 1:
				System.out.println("\nAnimated\n");
				break;
			case 2:
				System.out.println("\nDrama\n");
				break;
			case 3:
				System.out.println("\nHorror\n");
				break;
			case 4:
				System.out.println("\nSci-fi\n");
				break;
			}
			
			//check each movie in the arraylist, every movie's category that matches the user's selection will be printed
			for(int i=0; i<movies.size(); i++){
				if(movies.get(i).getCategoryNum() == userChoice)
					System.out.println(movies.get(i).getTitle());
			}
			
			cont = InputCheck.cont(sc, "\nContinue? (y/n): ");
		}
		
		sc.close();
	}
}
