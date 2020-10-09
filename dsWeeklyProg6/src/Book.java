import java.util.*;
public class Book {

	// Declare variables 
	public int pageCount;
	public int chapterCount;
	public int copies;
	public double reviewScore;
	public String title;
	public String genre;
	public int borrowedCount = 0;

	
	public int setPages (int amount) {
		
		pageCount = amount;
		
		return pageCount;
	}
	
	public Integer getPages () {
		
		return pageCount;
	}
	
	public int setChapters (int amount) {
		
		chapterCount = amount;
		
		return chapterCount;
	}
	
	public int copies (int amount ) {
		
		copies = amount;
		
		return copies;
	}
	
	public double rating (double score) {
		
		reviewScore = score;
		
		return reviewScore;
	}
	
	public Double getRating () {
		
		return reviewScore;
	}
	
	public String setTitle (String newTitle) {
		
		title = newTitle;
		
		return title;
	}
	
	public String getTitle () {
		
		return title;
	}
	
	public String setGenre (String newGenre) {

		
		genre = newGenre;
		
		return genre;
		
	}
	
	public void borrow () {
		
		if (this.copies > 0)
		{
			this.copies--;
			System.out.println("You have now borrowed " + title + ", " + copies + " copies remain.");	
			this.borrowedCount ++;
		}
		else
		{
			System.out.println("We have no copies left of " + title);
		}
		
	}
	
	public void returnBook () {
		
		if (this.borrowedCount > 0)
		{
		System.out.println("Thank you for returning " + this.title);
		this.copies++;
		this.borrowedCount--;
		}
		else
		{
			System.out.println(this.title + " has not been borrowed.");
		}
	}
	
	public String toString() {
		return title;
	}
	
	static Comparator<Book> compareByRating = (Book o1, Book o2) -> o1.getRating().compareTo(o2.getRating());
	
	static Comparator<Book> compareByTitle = (Book o1, Book o2) -> o1.getTitle().compareTo(o2.getTitle());
	
	static Comparator<Book> compareByPages = (Book o1, Book o2) -> o1.getPages().compareTo(o2.getPages());
}
