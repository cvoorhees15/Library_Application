// Title:		Library App
// Author:		Caleb Voorhees
// Date:		Oct 5, 2020
// Version:		1.0

import java.util.*;
public class Library extends Book{

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	// Open keyboard
	Scanner keyboard = new Scanner(System.in);
	int menuChoice = 0;
	int pageNumber = 0;
	int chapterNumber = 0;
	int bookCopies = 0;
	double bookRating = 0;
	String bookGenre;
	String bookTitle;
	String borrowRequest;
	String returnTitle;
	
	// Declare new linked list 
	LinkedList<Book> fiction = new LinkedList<Book>();
	LinkedList<Book> nonfiction = new LinkedList<Book>();

	// Create new Book objects 
	
	// Fiction
	Book book1 = new Book();
	Book book2 = new Book();
	Book book3 = new Book();
	Book book4 = new Book();
	Book book5 = new Book();
	Book book6 = new Book();
	Book book7 = new Book();
	Book book8 = new Book();
	Book book9 = new Book();
	Book book10 = new Book();
	
	// Nonfiction
	Book book11 = new Book();
	Book book12 = new Book();
	Book book13 = new Book();
	Book book14 = new Book();
	Book book15 = new Book();
	Book book16 = new Book();
	Book book17 = new Book();
	Book book18 = new Book();
	Book book19 = new Book();
	Book book20 = new Book();
	
	// User added books
	Book newFiction = new Book();
	Book newNonfiction = new Book();
	
	// Fill values into fiction books
	
	// Harry Potter
	book1.setPages(373);
	book1.setChapters(23);
	book1.rating(8.7);
	book1.copies(3);
	book1.setGenre("Fantasy");
	book1.setTitle("Harry Potter and the Chamber of Secrets");
	
	// The Hunger Games 
	book2.setPages(265);
	book2.setChapters(32);
	book2.rating(7.6);
	book2.copies(4);
	book2.setGenre("Adventure");
	book2.setTitle("The Hunger Games");
	
	// Twilight
	book3.setPages(453);
	book3.setChapters(41);
	book3.rating(7.1);
	book3.copies(1);
	book3.setGenre("Romance");
	book3.setTitle("Twilight");
	
	// The Great Gatsby 
	book4.setPages(206);
	book4.setChapters(19);
	book4.rating(7.7);
	book4.copies(7);
	book4.setGenre("Tragedy");
	book4.setTitle("The Great Gatsby");
	
	// Lord of The Flies
	book5.setPages(276);
	book5.setChapters(22);
	book5.rating(9.4);
	book5.copies(5);
	book5.setGenre("Allegory");
	book5.setTitle("Lord of The Flies");
	
	// The Hobbit
	book6.setPages(379);
	book6.setChapters(32);
	book6.rating(9.1);
	book6.copies(10);
	book6.setGenre("Fantasy");
	book6.setTitle("The Hobbit");
	
	// Lord of the Rings
	book7.setPages(503);
	book7.setChapters(45);
	book7.rating(7.4);
	book7.copies(3);
	book7.setGenre("Fantasy");
	book7.setTitle("Fellowship of the Ring");
	
	// The Giver
	book8.setPages(189);
	book8.setChapters(18);
	book8.rating(6.8);
	book8.copies(6);
	book8.setGenre("Science Fiction");
	book8.setTitle("The Giver");
	
	// Life of Pi
	book9.setPages(315);
	book9.setChapters(25);
	book9.rating(7.2);
	book9.copies(2);
	book9.setGenre("Adventure");
	book9.setTitle("Life of Pi");
	
	// Of Mice and Men
	book10.setPages(143);
	book10.setChapters(18);
	book10.rating(6.5);
	book10.copies(1);
	book10.setGenre("Historical Fiction");
	book10.setTitle("Of Mice and Men");
	
	
	// Add books to linked list fiction
	fiction.add(book1);
	fiction.add(book2);
	fiction.add(book3);
	fiction.add(book4);
	fiction.add(book5);
	fiction.add(book6);
	fiction.add(book7);
	fiction.add(book8);
	fiction.add(book9);
	fiction.add(book10);
	
	
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
	
	// APP
	while(menuChoice != 15)
	{
		
	// Print menu 
	System.out.println("\n\nLibrary Menu");
	System.out.println("====================================");
	System.out.println("  Fiction:");
	System.out.println("  1.) Add fiction book");
	System.out.println("  2.) Return fiction book");
	System.out.println("  3.) Borrow fiction book");
	System.out.println("  4.) Show all fiction books");
	System.out.println("  5.) Sort fiction by best rated");
	System.out.println("  6.) Sort fiction by length in pages");
	System.out.println("  7.) Sort fiction alphabetically");
	System.out.println("  \nNonfiction:");
	System.out.println("  8.) Add nonfiction book");
	System.out.println("  9.) Return nonfiction book");
	System.out.println("  10.) Borrow nonfiction book");
	System.out.println("  11.) Show all nonfiction books");
	System.out.println("  12.) Sort nonfiction by best rated");
	System.out.println("  13.) Sort nonfiction by length in pages");
	System.out.println("  14.) Sort nonfiction alphabetically");
	System.out.println("  15.) Exit");
	System.out.println("  \n//:");
	
	
	// Menu Functionality 
	menuChoice = keyboard.nextInt();
	switch (menuChoice)
	{
	case 1:
		
		// Create new book and fill it with info
		System.out.println("\nHow many pages in this new book?");
		pageNumber = keyboard.nextInt();
		newFiction.setPages(pageNumber);
		
		System.out.println("\nHow many chapters in this new book?");
		chapterNumber = keyboard.nextInt();
		newFiction.setChapters(chapterNumber);
		
		System.out.println("\nWhat is your rating out of 10 for this new book?");
		bookRating = keyboard.nextDouble();
		newFiction.rating(bookRating);
		
		System.out.println("\nWhat is the genre of this new book?");
		bookGenre = keyboard.next();
		keyboard.nextLine();
		newFiction.setGenre(bookGenre);
		
		System.out.println("\nWhat is the title of this new book?");
		bookTitle = keyboard.nextLine();
		newFiction.setTitle(bookTitle);
		
		System.out.println("/nHow many copies are you adding to the library?");
		bookCopies = keyboard.nextInt();
		newFiction.copies(bookCopies);
		
		fiction.add(newFiction);
		System.out.println("\nThe new book has been added to the fiction section.");
		System.out.println("\nFiction Books: \n" + fiction);
		break;
		
	case 2:
		System.out.println("\nWhat is the title of the book you'd like to return?");
		keyboard.nextLine();
		returnTitle = keyboard.nextLine();
		
		if (returnTitle.equals(book1.title))
		{
			book1.returnBook();
		}
		
		if (returnTitle.equals(book2.title))
		{
			book2.returnBook();
		}
		
		if (returnTitle.equals(book3.title))
		{
			book3.returnBook();
		}
		
		if (returnTitle.equals(book4.title))
		{
			book4.returnBook();
		}
		
		if (returnTitle.equals(book5.title))
		{
			book5.returnBook();
		}
		
		if (returnTitle.equals(book6.title))
		{
			book6.returnBook();
		}
		
		if (returnTitle.equals(book7.title))
		{
			book7.returnBook();
		}
		
		if (returnTitle.equals(book8.title))
		{
			book8.returnBook();
		}
		
		if (returnTitle.equals(book9.title))
		{
			book9.returnBook();
		}
		
		if (returnTitle.equals(book10.title))
		{
			book10.returnBook();
		}
		
		break;
		
	case 3:
		System.out.println("\nWhat book would you like to borrow?");
		keyboard.nextLine();
		borrowRequest = keyboard.nextLine();
		if (borrowRequest.equals(book1.title))
		{
			book1.borrow();
		}
		
		if (borrowRequest.equals(book2.title))
		{
			book2.borrow();
		}
		
		if (borrowRequest.equals(book3.title))
		{
			book3.borrow();
		}
		
		if (borrowRequest.equals(book4.title))
		{
			book4.borrow();
		}
		
		if (borrowRequest.equals(book5.title))
		{
			book5.borrow();
		}
		
		if (borrowRequest.equals(book6.title))
		{
			book6.borrow();
		}
		
		if (borrowRequest.equals(book7.title))
		{
			book7.borrow();
		}
		
		if (borrowRequest.equals(book8.title))
		{
			book8.borrow();
		}
		
		if (borrowRequest.equals(book9.title))
		{
			book9.borrow();
		}
		
		if (borrowRequest.equals(book10.title))
		{
			book10.borrow();
		}
		break;
		
	case 4:
		// Display Library and its specific contents
		System.out.println("\nHarry Potter" );
		System.out.println("Pages: " + book1.pageCount);
		System.out.println("Chapters: " + book1.chapterCount);
		System.out.println("Rating: " + book1.reviewScore);
		System.out.println("Title: " + book1.title);
		System.out.println("Genre: " + book1.genre);
		System.out.println("Copies: " + book1.copies);
		
		System.out.println("\nHunger Games" );
		System.out.println("Pages: " + book2.pageCount);
		System.out.println("Chapters: " + book2.chapterCount);
		System.out.println("Rating: " + book2.reviewScore);
		System.out.println("Title: " + book2.title);
		System.out.println("Genre: " + book2.genre);
		System.out.println("Copies: " + book2.copies);
		
		System.out.println("\nTwilight" );
		System.out.println("Pages: " + book3.pageCount);
		System.out.println("Chapters: " + book3.chapterCount);
		System.out.println("Rating: " + book3.reviewScore);
		System.out.println("Title: " + book3.title);
		System.out.println("Genre: " + book3.genre);
		System.out.println("Copies: " + book3.copies);
		
		System.out.println("\nThe Great Gatsby" );
		System.out.println("Pages: " + book4.pageCount);
		System.out.println("Chapters: " + book4.chapterCount);
		System.out.println("Rating: " + book4.reviewScore);
		System.out.println("Title: " + book4.title);
		System.out.println("Genre: " + book4.genre);
		System.out.println("Copies: " + book4.copies);
		
		System.out.println("\nLord of The Flies" );
		System.out.println("Pages: " + book5.pageCount);
		System.out.println("Chapters: " + book5.chapterCount);
		System.out.println("Rating: " + book5.reviewScore);
		System.out.println("Title: " + book5.title);
		System.out.println("Genre: " + book5.genre);
		System.out.println("Copies: " + book5.copies);
		
		System.out.println("\nThe Hobbit" );
		System.out.println("Pages: " + book6.pageCount);
		System.out.println("Chapters: " + book6.chapterCount);
		System.out.println("Rating: " + book6.reviewScore);
		System.out.println("Title: " + book6.title);
		System.out.println("Genre: " + book6.genre);
		System.out.println("Copies: " + book6.copies);
		
		System.out.println("\nLord of The Rings" );
		System.out.println("Pages: " + book7.pageCount);
		System.out.println("Chapters: " + book7.chapterCount);
		System.out.println("Rating: " + book7.reviewScore);
		System.out.println("Title: " + book7.title);
		System.out.println("Genre: " + book7.genre);
		System.out.println("Copies: " + book7.copies);
		
		System.out.println("\nThe Giver" );
		System.out.println("Pages: " + book8.pageCount);
		System.out.println("Chapters: " + book8.chapterCount);
		System.out.println("Rating: " + book8.reviewScore);
		System.out.println("Title: " + book8.title);
		System.out.println("Genre: " + book8.genre);
		System.out.println("Copies: " + book8.copies);
		
		System.out.println("\nLife of Pi" );
		System.out.println("Pages: " + book9.pageCount);
		System.out.println("Chapters: " + book9.chapterCount);
		System.out.println("Rating: " + book9.reviewScore);
		System.out.println("Title: " + book9.title);
		System.out.println("Genre: " + book9.genre);
		System.out.println("Copies: " + book9.copies);
		
		System.out.println("\nOf Mice and Men" );
		System.out.println("Pages: " + book10.pageCount);
		System.out.println("Chapters: " + book10.chapterCount);
		System.out.println("Rating: " + book10.reviewScore);
		System.out.println("Title: " + book10.title);
		System.out.println("Genre: " + book10.genre);
		System.out.println("Copies: " + book10.copies);
		
		System.out.println("\n" + newFiction.title );
		System.out.println("Pages: " + newFiction.pageCount);
		System.out.println("Chapters: " + newFiction.chapterCount);
		System.out.println("Rating: " + newFiction.reviewScore);
		System.out.println("Title: " + newFiction.title);
		System.out.println("Genre: " + newFiction.genre);
		System.out.println("Copies: " + newFiction.copies);
		break;
		
	case 5:
		
		Collections.sort(fiction, compareByRating);
		System.out.println("\nFiction section sorted by rating (lowest to highest): ");
		System.out.println(fiction);
		
		break;
		
	case 6:
		
		Collections.sort(fiction, compareByPages);
		System.out.println("\nFiction section sorted by page count (lowest to highest): ");
		System.out.println(fiction);
		
		break;
		
	case 7:
		
		Collections.sort(fiction, compareByTitle);
		System.out.println("\nFiction section sorted alphabetically (a-z): ");
		System.out.println(fiction);
		
		break;
		
	case 8:
		
		// Create new book and fill it with info
		System.out.println("\nHow many pages in this new book?");
		pageNumber = keyboard.nextInt();
		newNonfiction.setPages(pageNumber);
		
		System.out.println("\nHow many chapters in this new book?");
		chapterNumber = keyboard.nextInt();
		newNonfiction.setChapters(chapterNumber);
				
		System.out.println("\nWhat is your rating out of 10 for this new book?");
		bookRating = keyboard.nextDouble();
		newNonfiction.rating(bookRating);
				
		System.out.println("\nWhat is the genre of this new book?");
		bookGenre = keyboard.next();
		keyboard.nextLine();
		newNonfiction.setGenre(bookGenre);
				
		System.out.println("\nWhat is the title of this new book?");
		bookTitle = keyboard.nextLine();
		newNonfiction.setTitle(bookTitle);
		
		System.out.println("/nHow many copies are you adding to the library?");
		bookCopies = keyboard.nextInt();
		newNonfiction.copies(bookCopies);
				
		nonfiction.add(newNonfiction);
		System.out.println("\nThe new book has been added to the nonfiction section.");
		System.out.println("\nNonfiction Books: \n" + nonfiction);

		break;
		
	case 9:
		
		// Return book if its been borrowed
		System.out.println("\nWhat is the title of the book you'd like to return?");
		keyboard.nextLine();
		returnTitle = keyboard.nextLine();
		
		if (returnTitle.equals(book11.title))
		{
			book11.returnBook();
		}
		
		if (returnTitle.equals(book12.title))
		{
			book12.returnBook();
		}
		
		if (returnTitle.equals(book13.title))
		{
			book13.returnBook();
		}
		
		if (returnTitle.equals(book14.title))
		{
			book14.returnBook();
		}
		
		if (returnTitle.equals(book15.title))
		{
			book15.returnBook();
		}
		
		if (returnTitle.equals(book16.title))
		{
			book16.returnBook();
		}
		
		if (returnTitle.equals(book17.title))
		{
			book17.returnBook();
		}
		
		if (returnTitle.equals(book18.title))
		{
			book18.returnBook();
		}
		
		if (returnTitle.equals(book19.title))
		{
			book19.returnBook();
		}
		
		if (returnTitle.equals(book20.title))
		{
			book20.returnBook();
		}
		
		break;
		
	case 10:
		
		// Search for a book to borrow
		System.out.println("\nWhat book would you like to borrow?");
		keyboard.nextLine();
		borrowRequest = keyboard.nextLine();
		
		if (borrowRequest.equals(book11.title))
		{
			book11.borrow();
		}
		
		if (borrowRequest.equals(book12.title))
		{
			book12.borrow();
		}
		
		if (borrowRequest.equals(book13.title))
		{
			book13.borrow();
		}
		
		if (borrowRequest.equals(book14.title))
		{
			book14.borrow();
		}
		
		if (borrowRequest.equals(book15.title))
		{
			book15.borrow();
		}
		
		if (borrowRequest.equals(book16.title))
		{
			book16.borrow();
		}
		
		if (borrowRequest.equals(book17.title))
		{
			book17.borrow();
		}
		
		if (borrowRequest.equals(book18.title))
		{
			book18.borrow();
		}
		
		if (borrowRequest.equals(book19.title))
		{
			book19.borrow();
		}
		
		if (borrowRequest.equals(book20.title))
		{
			book20.borrow();
		}
		
		break;
		
	case 11:
		
		System.out.println("\nNight" );
		System.out.println("Pages: " + book11.pageCount);
		System.out.println("Chapters: " + book11.chapterCount);
		System.out.println("Rating: " + book11.reviewScore);
		System.out.println("Title: " + book11.title);
		System.out.println("Genre: " + book11.genre);
		System.out.println("Copies: " + book11.copies);
		
		System.out.println("\nFriday Night Lights" );
		System.out.println("Pages: " + book12.pageCount);
		System.out.println("Chapters: " + book12.chapterCount);
		System.out.println("Rating: " + book12.reviewScore);
		System.out.println("Title: " + book12.title);
		System.out.println("Genre: " + book12.genre);
		System.out.println("Copies: " + book12.copies);
		
		System.out.println("\nInto Thin Air" );
		System.out.println("Pages: " + book13.pageCount);
		System.out.println("Chapters: " + book13.chapterCount);
		System.out.println("Rating: " + book13.reviewScore);
		System.out.println("Title: " + book13.title);
		System.out.println("Genre: " + book13.genre);
		System.out.println("Copies: " + book13.copies);
		
		System.out.println("\nLife on the Mississippi" );
		System.out.println("Pages: " + book14.pageCount);
		System.out.println("Chapters: " + book14.chapterCount);
		System.out.println("Rating: " + book14.reviewScore);
		System.out.println("Title: " + book14.title);
		System.out.println("Genre: " + book14.genre);
		System.out.println("Copies: " + book14.copies);
		
		System.out.println("\nSilent Spring" );
		System.out.println("Pages: " + book15.pageCount);
		System.out.println("Chapters: " + book15.chapterCount);
		System.out.println("Rating: " + book15.reviewScore);
		System.out.println("Title: " + book15.title);
		System.out.println("Genre: " + book15.genre);
		System.out.println("Copies: " + book15.copies);
		
		System.out.println("\nThe Omnivore's Dilemma" );
		System.out.println("Pages: " + book16.pageCount);
		System.out.println("Chapters: " + book16.chapterCount);
		System.out.println("Rating: " + book16.reviewScore);
		System.out.println("Title: " + book16.title);
		System.out.println("Genre: " + book16.genre);
		System.out.println("Copies: " + book16.copies);
		
		System.out.println("\nGoodbye to All That" );
		System.out.println("Pages: " + book17.pageCount);
		System.out.println("Chapters: " + book17.chapterCount);
		System.out.println("Rating: " + book17.reviewScore);
		System.out.println("Title: " + book17.title);
		System.out.println("Genre: " + book17.genre);
		System.out.println("Copies: " + book17.copies);
		
		System.out.println("\nNo Logo" );
		System.out.println("Pages: " + book18.pageCount);
		System.out.println("Chapters: " + book18.chapterCount);
		System.out.println("Rating: " + book18.reviewScore);
		System.out.println("Title: " + book18.title);
		System.out.println("Genre: " + book18.genre);
		System.out.println("Copies: " + book18.copies);
		
		System.out.println("\nFever Pitch" );
		System.out.println("Pages: " + book19.pageCount);
		System.out.println("Chapters: " + book19.chapterCount);
		System.out.println("Rating: " + book19.reviewScore);
		System.out.println("Title: " + book19.title);
		System.out.println("Genre: " + book19.genre);
		System.out.println("Copies: " + book19.copies);
		
		System.out.println("\nDiary of Anne Frank" );
		System.out.println("Pages: " + book20.pageCount);
		System.out.println("Chapters: " + book20.chapterCount);
		System.out.println("Rating: " + book20.reviewScore);
		System.out.println("Title: " + book20.title);
		System.out.println("Genre: " + book20.genre);
		System.out.println("Copies: " + book20.copies);
		
		System.out.println("\n" + newNonfiction.title);
		System.out.println("Pages: " + newNonfiction.pageCount);
		System.out.println("Chapters: " + newNonfiction.chapterCount);
		System.out.println("Rating: " + newNonfiction.reviewScore);
		System.out.println("Title: " + newNonfiction.title);
		System.out.println("Genre: " + newNonfiction.genre);
		System.out.println("Copies: " + newNonfiction.copies);
		
		break;
		
	case 12:
		
		Collections.sort(nonfiction, compareByRating);
		System.out.println("\nNonfiction section sorted by rating (lowest to highest): ");
		System.out.println(nonfiction);
		
		break;
		
	case 13:
		
		Collections.sort(nonfiction, compareByPages);
		System.out.println("\nNonfiction section sorted by page count (lowest to highest): ");
		System.out.println(nonfiction);
		
		break;
		
	case 14:
		
		Collections.sort(nonfiction, compareByTitle);
		System.out.println("\nNonfiction section sorted alphabetically (a-z): ");
		System.out.println(nonfiction);
		
		break;
		
	case 15:
		System.out.println("Exit Library");
		break;
	}
	
	}
	
	
}

}