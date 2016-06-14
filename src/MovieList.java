import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		ArrayList<Movie> movies = new ArrayList<Movie>();
		int userChoice = 0;
		
		//Filling ArrayList
		Movie userMovie;
		movies.add(userMovie = new Movie("Titanic","drama"));
		movies.add(userMovie = new Movie("Aliens","horror"));
		movies.add(userMovie = new Movie("Up","animated"));
		movies.add(userMovie = new Movie("Frozen","animated"));
		movies.add(userMovie = new Movie("Gamer","scifi"));
		movies.add(userMovie = new Movie("Tron","scifi"));
		movies.add(userMovie = new Movie("The Notebook","drama"));
		movies.add(userMovie = new Movie("The Time Traveler's Wife","drama"));
		movies.add(userMovie = new Movie("American Beauty","drama"));
		movies.add(userMovie = new Movie("Friday the 13th","horror"));
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("\nThere are "+movies.size()+" in this list.");
		
		boolean cont = true;
		while(cont){
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
			
			
			for(int i=0; i<movies.size(); i++){
				if(movies.get(i).getCategoryNum() == userChoice)
					System.out.println(movies.get(i).getTitle());
			}
			
			cont = InputCheck.cont(sc, "\nContinue? (y/n): ");
		}
		
		sc.close();
	}

}
