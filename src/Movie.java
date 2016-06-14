
public class Movie {
	private String title = "", category = "";
	private int categoryNum = 0;
	
	public Movie(String title, String category){
		this.title = title;
		this.category = category;
		
		switch(category){
		case "animated":
			categoryNum = 1;
			break;
		case "drama":
			categoryNum = 2;
			break;
		case "horror":
			categoryNum = 3;
			break;
		case "scifi":
			categoryNum = 4;
			break;
		}
		
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getCategory(){
		return category;
	}
	
	public int getCategoryNum(){
		return categoryNum;
	}
	
	public static String getCategoryMenu(){
		return "\nCategories\n1. Animated\n2. Drama\n3. Horror\n4. Sci-Fi\n";
	}
	
}
