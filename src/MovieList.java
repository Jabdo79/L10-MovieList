import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		ArrayList<Movie> movies = new ArrayList<Movie>();
		int userChoice = 0;
		
		//Filling ArrayList alphabetically
		boolean added = false;
		for(int m = 1; m < 101; m++){
			for(int i=0; i < movies.size(); i++){
				//look for alphabetical location
				if(movies.get(i).getTitle().compareTo(MovieIO.getMovie(m).getTitle()) >= 0){
					//add movie
					movies.add(i, MovieIO.getMovie(m));
					added = true;
					break;
				}
			}
			if(!added)
				movies.add(MovieIO.getMovie(m));
			added = false;
		}
		
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
