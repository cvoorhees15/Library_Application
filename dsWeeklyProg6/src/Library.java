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
	
	
	// Menu functionality variables
	int menuChoice = 0;
	String pageNumber;
	String chapterNumber;
	int bookCopies = 0;
	double bookRating = 0;
	String bookGenre;
	String bookTitle;
	String borrowRequest;
	String returnTitle;
	
	
	// User added books
	Book newFiction = new Book();
	Book newNonfiction = new Book();
	
	
	// Create fiction section
	Fiction ficSection = new Fiction ();
	ficSection.fillVlalues();
	ficSection.addFictionBooks();
	
	
	// Create nonfiction section
	Nonfiction nonficSection = new Nonfiction();
	nonficSection.fillValues();
	nonficSection.addNonfictionBooks();
	
	
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
	System.out.println("  8.) Clear fiction section");
	System.out.println("  \nNonfiction:");
	System.out.println("  9.) Clear nonfiction Section");
	System.out.println("  10.) Add nonfiction book");
	System.out.println("  11.) Return nonfiction book");
	System.out.println("  12.) Borrow nonfiction book");
	System.out.println("  13.) Show all nonfiction books");
	System.out.println("  14.) Sort nonfiction by best rated");
	System.out.println("  15.) Sort nonfiction by length in pages");
	System.out.println("  16.) Sort nonfiction alphabetically");
	System.out.println("  17.) Exit");
	System.out.println("  \n//: ");
	
	
	// Menu Functionality 
	menuChoice = keyboard.nextInt();
	switch (menuChoice)
	{
	case 1:
		
		// Create new book and fill it with info
		System.out.println("\nHow many pages in this new book?");
		pageNumber = keyboard.next();
		keyboard.nextLine();
		newFiction.setPages(pageNumber);
		
		System.out.println("\nHow many chapters in this new book?");
		chapterNumber = keyboard.next();
		keyboard.nextLine();
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
		fiction.clear();
		
		break;
		
	case 9:
		nonfiction.clear();
		
		break;
		
	case 10:
		
		// Create new book and fill it with info
		System.out.println("\nHow many pages in this new book?");
		pageNumber = keyboard.next();
		keyboard.nextLine();
		newNonfiction.setPages(pageNumber);
		
		System.out.println("\nHow many chapters in this new book?");
		chapterNumber = keyboard.next();
		keyboard.nextLine();
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
		
		System.out.println("\nHow many copies are you adding to the library?");
		bookCopies = keyboard.nextInt();
		newNonfiction.copies(bookCopies);
				
		nonfiction.add(newNonfiction);
		System.out.println("\nThe new book has been added to the nonfiction section.");
		System.out.println("\nNonfiction Books: \n" + nonfiction);

		break;
		
	case 11:
		
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
		
	case 12:
		
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
		
	case 13:
		
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
		
	case 14:
		
		Collections.sort(nonfiction, compareByRating);
		System.out.println("\nNonfiction section sorted by rating (lowest to highest): ");
		System.out.println(nonfiction);
		
		break;
		
	case 15:
		
		Collections.sort(nonfiction, compareByPages);
		System.out.println("\nNonfiction section sorted by page count (lowest to highest): ");
		System.out.println(nonfiction);
		
		break;
		
	case 16:
		
		Collections.sort(nonfiction, compareByTitle);
		System.out.println("\nNonfiction section sorted alphabetically (a-z): ");
		System.out.println(nonfiction);
		
		break;
		
	case 17:
		System.out.println("Exit Library");
		break;
	}
	
	}
	
	
}

}