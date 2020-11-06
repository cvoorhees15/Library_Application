
public class Nonfiction extends Book {

	public void fillValues () {
		
		// Fill values into nonfiction books
		
		// Night
		book11.setPages(231);
		book11.setChapters(14);
		book11.rating(7.8);
		book11.copies(4);
		book11.setGenre("Autobioraphy");
		book11.setTitle("Night");
		
		// Friday Night Lights
		book12.setPages(286);
		book12.setChapters(27);
		book12.rating(6.8);
		book12.copies(7);
		book12.setGenre("Bioraphy");
		book12.setTitle("Friday Night Lights");
		
		// Into Thin Air
		book13.setPages(342);
		book13.setChapters(31);
		book13.rating(5.9);
		book13.copies(2);
		book13.setGenre("Nonfiction");
		book13.setTitle("Into Thin Air");
		
		// Life on the Mississippi
		book14.setPages(402);
		book14.setChapters(21);
		book14.rating(6.3);
		book14.copies(9);
		book14.setGenre("Autobioraphy");
		book14.setTitle("Life on the Mississippi");
		
		// Silent Spring
		book15.setPages(308);
		book15.setChapters(15);
		book15.rating(6.0);
		book15.copies(5);
		book15.setGenre("Nonfiction");
		book15.setTitle("Silent Spring");
		
		// The Omnivore's Dilemma
		book16.setPages(578);
		book16.setChapters(33);
		book16.rating(6.7);
		book16.copies(3);
		book16.setGenre("Diet Book");
		book16.setTitle("The Omnivore's Dilemma");
		
		// Goodbye to All That 
		book17.setPages(328);
		book17.setChapters(2);
		book17.rating(7.3);
		book17.copies(1);
		book17.setGenre("Autobioraphy");
		book17.setTitle("Goodbye to All That");
		
		// No Logo
		book18.setPages(442);
		book18.setChapters(21);
		book18.rating(8.3);
		book18.copies(10);
		book18.setGenre("Nonfiction");
		book18.setTitle("No Logo");
		
		// Fever Pitch
		book19.setPages(234);
		book19.setChapters(31);
		book19.rating(9.3);
		book19.copies(1);
		book19.setGenre("Sports Nonfiction");
		book19.setTitle("Fever Pitch");
		
		// Diary of Anne Frank
		book20.setPages(167);
		book20.setChapters(20);
		book20.rating(8.9);
		book20.copies(2);
		book20.setGenre("Bioraphy");
		book20.setTitle("Diary of Anne Frank");
	}
	
	public void addBooks () {
		
		// Add books to linked list nonfiction
		nonfiction.add(book11);
		nonfiction.add(book12);
		nonfiction.add(book13);
		nonfiction.add(book14);
		nonfiction.add(book15);
		nonfiction.add(book16);
		nonfiction.add(book17);
		nonfiction.add(book18);
		nonfiction.add(book19);
		nonfiction.add(book20);
	}
}
