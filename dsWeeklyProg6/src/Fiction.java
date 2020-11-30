public class Fiction extends Book{
	
	public void fillVlalues () {
		
		
		// Fill values into fiction books
		
		// Harry Potter
		book1.setPages("373");
		book1.setChapters("23");
		book1.rating(8.7);
		book1.copies(3);
		book1.setGenre("Fantasy");
		book1.setTitle("Harry Potter and the Chamber of Secrets");
		
		// The Hunger Games 
		book2.setPages("265");
		book2.setChapters("32");
		book2.rating(7.6);
		book2.copies(4);
		book2.setGenre("Adventure");
		book2.setTitle("The Hunger Games");
		
		// Twilight
		book3.setPages("453");
		book3.setChapters("41");
		book3.rating(7.1);
		book3.copies(1);
		book3.setGenre("Romance");
		book3.setTitle("Twilight");
		
		// The Great Gatsby 
		book4.setPages("206");
		book4.setChapters("19");
		book4.rating(7.7);
		book4.copies(7);
		book4.setGenre("Tragedy");
		book4.setTitle("The Great Gatsby");
		
		// Lord of The Flies
		book5.setPages("276");
		book5.setChapters("22");
		book5.rating(9.4);
		book5.copies(5);
		book5.setGenre("Allegory");
		book5.setTitle("Lord of The Flies");
		
		// The Hobbit
		book6.setPages("379");
		book6.setChapters("32");
		book6.rating(9.1);
		book6.copies(10);
		book6.setGenre("Fantasy");
		book6.setTitle("The Hobbit");
		
		// Lord of the Rings
		book7.setPages("503");
		book7.setChapters("45");
		book7.rating(7.4);
		book7.copies(3);
		book7.setGenre("Fantasy");
		book7.setTitle("Fellowship of the Ring");
		
		// The Giver
		book8.setPages("189");
		book8.setChapters("18");
		book8.rating(6.8);
		book8.copies(6);
		book8.setGenre("Science Fiction");
		book8.setTitle("The Giver");
		
		// Life of Pi
		book9.setPages("315");
		book9.setChapters("25");
		book9.rating(7.2);
		book9.copies(2);
		book9.setGenre("Adventure");
		book9.setTitle("Life of Pi");
		
		// Of Mice and Men
		book10.setPages("143");
		book10.setChapters("18");
		book10.rating(6.5);
		book10.copies(1);
		book10.setGenre("Historical Fiction");
		book10.setTitle("Of Mice and Men");
		
		// Fill Dictionary 
		fictionBooks.put("HPCS", "Harry Potter and the Chamber of Secrets");
		fictionBooks.put("THG", "The Hunger Games");
		fictionBooks.put("Twlt", "Twilight");
		fictionBooks.put("TGG", "The Great Gatsby");
		fictionBooks.put("LOTF", "Lord of The Flies");
		fictionBooks.put("TH", "The Hobbit");
		fictionBooks.put("FOTR", "Fellowship of The Ring");
		fictionBooks.put("TG", "The Giver");
		fictionBooks.put("LOP", "Life of Pi");
		fictionBooks.put("OMAM", "Of Mice and Men");
		
	}
	
	public void addFictionBooks () {
		
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
	}
}
