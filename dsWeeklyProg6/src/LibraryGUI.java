import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibraryGUI extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private JButton btnEnter;
	private JTextPane txtpnMenuFictionNonfiction;
	
	// Fiction
	static LinkedList<Book> fiction = new LinkedList<Book>();
	static Hashtable<String, String> fictionBooks = new Hashtable<String, String>();
	static Book book1 = new Book();
	static Book book2 = new Book();
	static Book book3 = new Book();
	static Book book4 = new Book();
	static Book book5 = new Book();
	static Book book6 = new Book();
	static Book book7 = new Book();
	static Book book8 = new Book();
	static Book book9 = new Book();
	static Book book10 = new Book();
	static Book newFiction = new Book();
	
	// Nonfiction
	static LinkedList<Book> nonfiction = new LinkedList<Book>();
	static Hashtable<String, String> nonfictionBooks = new Hashtable<String, String>();
	static Book book11 = new Book();
	static Book book12 = new Book();
	static Book book13 = new Book();
	static Book book14 = new Book();
	static Book book15 = new Book();
	static Book book16 = new Book();
	static Book book17 = new Book();
	static Book book18 = new Book();
	static Book book19 = new Book();
	static Book book20 = new Book();
	
	static Comparator<Book> compareByRating = (Book o1, Book o2) -> o1.getRating().compareTo(o2.getRating());
	
	static Comparator<Book> compareByTitle = (Book o1, Book o2) -> o1.getTitle().compareTo(o2.getTitle());
	
	static Comparator<Book> compareByPages = (Book o1, Book o2) -> o1.getPages().compareTo(o2.getPages());
	private JLabel lblMenu;
	private JButton btnReturnToMenu;
	private JButton btnBorrow;
	private JButton btnReturn;
	private JTextField textField2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryGUI frame = new LibraryGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 */
	public LibraryGUI() {
		
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
		book11.setPages("231");
		book11.setChapters("14");
		book11.rating(7.8);
		book11.copies(4);
		book11.setGenre("Autobioraphy");
		book11.setTitle("Night");
		
		// Friday Night Lights
		book12.setPages("286");
		book12.setChapters("27");
		book12.rating(6.8);
		book12.copies(7);
		book12.setGenre("Bioraphy");
		book12.setTitle("Friday Night Lights");
		
		// Into Thin Air
		book13.setPages("342");
		book13.setChapters("31");
		book13.rating(5.9);
		book13.copies(2);
		book13.setGenre("Nonfiction");
		book13.setTitle("Into Thin Air");
		
		// Life on the Mississippi
		book14.setPages("402");
		book14.setChapters("21");
		book14.rating(6.3);
		book14.copies(9);
		book14.setGenre("Autobioraphy");
		book14.setTitle("Life on the Mississippi");
		
		// Silent Spring
		book15.setPages("308");
		book15.setChapters("15");
		book15.rating(6.0);
		book15.copies(5);
		book15.setGenre("Nonfiction");
		book15.setTitle("Silent Spring");
		
		// The Omnivore's Dilemma
		book16.setPages("578");
		book16.setChapters("33");
		book16.rating(6.7);
		book16.copies(3);
		book16.setGenre("Diet Book");
		book16.setTitle("The Omnivore's Dilemma");
		
		// Goodbye to All That 
		book17.setPages("328");
		book17.setChapters("24");
		book17.rating(7.3);
		book17.copies(1);
		book17.setGenre("Autobioraphy");
		book17.setTitle("Goodbye to All That");
		
		// No Logo
		book18.setPages("442");
		book18.setChapters("21");
		book18.rating(8.3);
		book18.copies(10);
		book18.setGenre("Nonfiction");
		book18.setTitle("No Logo");
		
		// Fever Pitch
		book19.setPages("234");
		book19.setChapters("31");
		book19.rating(9.3);
		book19.copies(1);
		book19.setGenre("Sports Nonfiction");
		book19.setTitle("Fever Pitch");
		
		// Diary of Anne Frank
		book20.setPages("167");
		book20.setChapters("20");
		book20.rating(8.9);
		book20.copies(2);
		book20.setGenre("Bioraphy");
		book20.setTitle("Diary of Anne Frank");
		
		// Fill Nonfiction Dictionary
		nonfictionBooks.put("N", "Night");
		nonfictionBooks.put("FNL", "Friday Night Lights");
		nonfictionBooks.put("ITA", "Into Thin Air");
		nonfictionBooks.put("LOTM", "Life on The Mississippi");
		nonfictionBooks.put("SS", "Silent Spring");
		nonfictionBooks.put("TOD", "The Omnivores Dilemma");
		nonfictionBooks.put("GTAT", "Goodbye To All That");
		nonfictionBooks.put("NL", "No Logo");
		nonfictionBooks.put("FP", "Fever Pitch");
		nonfictionBooks.put("DOAF", "Diary of Anne Frank");
		
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
		
		// Interface structure
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{440, 0};
		gbl_contentPane.rowHeights = new int[]{63, 0, 179, 0, 0, 0, 0, 0, 0, 0, 0, 26, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblLibrary = new JLabel("Library");
		lblLibrary.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrary.setForeground(new Color(0, 0, 0));
		lblLibrary.setFont(new Font("Gujarati MT", Font.BOLD, 40));
		GridBagConstraints gbc_lblLibrary = new GridBagConstraints();
		gbc_lblLibrary.anchor = GridBagConstraints.NORTH;
		gbc_lblLibrary.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLibrary.insets = new Insets(0, 0, 5, 0);
		gbc_lblLibrary.gridx = 0;
		gbc_lblLibrary.gridy = 0;
		contentPane.add(lblLibrary, gbc_lblLibrary);
		
		// Menu Label
		lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Apple Symbols", Font.BOLD, 20));
		GridBagConstraints gbc_lblMenu = new GridBagConstraints();
		gbc_lblMenu.insets = new Insets(0, 0, 5, 0);
		gbc_lblMenu.gridx = 0;
		gbc_lblMenu.gridy = 1;
		contentPane.add(lblMenu, gbc_lblMenu);
		
		// Menu Display
		txtpnMenuFictionNonfiction = new JTextPane();
		txtpnMenuFictionNonfiction.setEditable(false);
		txtpnMenuFictionNonfiction.setText("\t\n\tFiction\t\t\t\tNonfiction\n\n\t1.) Borrow fiction book\t\t7.) Borrow nonfiction book\n\t2.) Return fiction book\t\t\t8.) Return nonfiction book\n\t3.) Show all fiction books\t\t9.) Show all nonfiction books\n\t4.) Sort fiction by best rated\t\t10.) Sort nonfiction by best rated\n\t5.) Sort fiction by length in pages \t\t11.) Sort nonfiction by length in pages\n\t6.) Sort fiction alphabetically \t\t12.) Sort nonfiction alphabetically");
		GridBagConstraints gbc_txtpnMenuFictionNonfiction = new GridBagConstraints();
		gbc_txtpnMenuFictionNonfiction.gridheight = 3;
		gbc_txtpnMenuFictionNonfiction.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnMenuFictionNonfiction.fill = GridBagConstraints.BOTH;
		gbc_txtpnMenuFictionNonfiction.gridx = 0;
		gbc_txtpnMenuFictionNonfiction.gridy = 2;
		contentPane.add(txtpnMenuFictionNonfiction, gbc_txtpnMenuFictionNonfiction);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 6;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField2 = new JTextField();
		GridBagConstraints gbc_textField2 = new GridBagConstraints();
		gbc_textField2.insets = new Insets(0, 0, 5, 0);
		gbc_textField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField2.gridx = 0;
		gbc_textField2.gridy = 8;
		contentPane.add(textField2, gbc_textField2);
		textField2.setColumns(10);
		textField2.setVisible(false);
		
		// Enter button functionality 
		btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent menuChoice) {
				
			
				if (textField.getText().contentEquals("1"))
				{
					txtpnMenuFictionNonfiction.setText("What fiction book would you like to borrow\n\n" + fiction.toString());
					lblMenu.setVisible(false);
					btnEnter.setVisible(false);
					btnReturn.setVisible(true);
					btnBorrow.setVisible(true);
					textField2.setVisible(true);
					textField.setText("<enter book to borrow>");
					textField2.setText("<enter book to return>");
				}
		
				if (textField.getText().contentEquals("2"))
				{
					txtpnMenuFictionNonfiction.setText("What fiction book would you like to return?\n\n" + fiction.toString());
					lblMenu.setVisible(false);
					btnEnter.setVisible(false);
					btnReturn.setVisible(true);
					btnBorrow.setVisible(true);
					textField2.setVisible(true);
					textField.setText("<enter book to borrow>");
					textField2.setText("<enter book to return>");
				}
			
				if(textField.getText().contentEquals("3"))
					textField.setText("");
					txtpnMenuFictionNonfiction.setText("\t" + book1.title + "\t\t" + book2.title + "\n\t" + book3.title + "\t\t\t\t\t" + book4.title + "\n\t" + book5.title + "\t\t\t\t" + book6.title + "\n\t" + book7.title + "\t\t\t\t" + book8.title + "\n\t" + book9.title + "\t\t\t\t\t" + book10.title);
				
				if (textField.getText().contentEquals("4"))
				{
					textField.setText("");
					Collections.sort(fiction, compareByRating);
					txtpnMenuFictionNonfiction.setText("Fiction section sorted by best rating:\n\n" + fiction.toString());
				}
				
				if (textField.getText().contentEquals("5"))
				{
					textField.setText("");
					Collections.sort(fiction, compareByPages);
					txtpnMenuFictionNonfiction.setText("Fiction section sorted by best length in pages:\n\n" + fiction.toString());
				}
				
				if (textField.getText().contentEquals("6"))
				{
					textField.setText("");
					Collections.sort(fiction, compareByTitle);
					txtpnMenuFictionNonfiction.setText("Fiction section sorted alphabetically:\n\n" + fiction.toString());
				}
				
				if (textField.getText().contentEquals("7"))
				{

					txtpnMenuFictionNonfiction.setText("What nonfiction book would you like to borrow\n\n" + nonfiction.toString());
					lblMenu.setVisible(false);
					btnEnter.setVisible(false);
					btnReturn.setVisible(true);
					btnBorrow.setVisible(true);
					textField2.setVisible(true);
					textField.setText("<enter book to borrow>");
					textField2.setText("<enter book to return>");
				}
				
				if (textField.getText().contentEquals("8"))
				{
					txtpnMenuFictionNonfiction.setText("What nonfiction book would you like to return?\n\n" + nonfiction.toString());
					lblMenu.setVisible(false);
					btnEnter.setVisible(false);
					btnReturn.setVisible(true);
					btnBorrow.setVisible(true);
					textField2.setVisible(true);
					textField.setText("<enter book to borrow>");
					textField2.setText("<enter book to return>");
				}
				
				if(textField.getText().contentEquals("9"))
				{
					textField.setText("");
					txtpnMenuFictionNonfiction.setText("\t" + book11.title + "\t\t\t\t\t" + book12.title + "\n\t" + book13.title + "\t\t\t\t" + book14.title + "\n\t" + book15.title + "\t\t\t\t" + book16.title + "\n\t" + book17.title + "\t\t\t\t" + book18.title + "\n\t" + book19.title + "\t\t\t\t\t" + book20.title);
				}
				
				if (textField.getText().contentEquals("10"))
				{
					textField.setText("");
					Collections.sort(nonfiction, compareByRating);
					txtpnMenuFictionNonfiction.setText("Nonfiction section sorted by best rating:\n\n" + nonfiction.toString());
				}
				
				if (textField.getText().contentEquals("11"))
				{
					textField.setText("");
					Collections.sort(nonfiction, compareByPages);
					txtpnMenuFictionNonfiction.setText("Nonfiction section sorted by length in pages:\n\n" + nonfiction.toString());
				}
				
				if (textField.getText().contentEquals("12"))
				{
					textField.setText("");
					Collections.sort(nonfiction, compareByTitle);
					txtpnMenuFictionNonfiction.setText("Nonfiction section sorted alphabetically:\n\n" + nonfiction.toString());
				}			
			}
		});
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 5, 0);
		gbc_btnEnter.gridx = 0;
		gbc_btnEnter.gridy = 10;
		contentPane.add(btnEnter, gbc_btnEnter);
		
		
		// Borrow button functionality
		btnBorrow = new JButton("Borrow");
		btnBorrow.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent borrow) {
				String borrowRequest;
								
				borrowRequest = textField.getText();
				if (borrowRequest.equals(book1.title) && book1.copies > 0)
				{
					book1.copies --;
					book1.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book1.title + ".");
				}
						
				if (borrowRequest.equals(book2.title) && book2.copies > 0)
				{
					book2.copies --;
					book2.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book2.title + ".");
				}
						
				if (borrowRequest.equals(book3.title) && book3.copies > 0)
				{
					book3.copies --;
					book3.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book3.title + ".");
				}
						
				if (borrowRequest.equals(book4.title) && book4.copies > 0)
				{
					book4.copies --;
					book4.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book4.title + ".");
				}
						
				if (borrowRequest.equals(book5.title) && book5.copies > 0)
				{
					book5.copies --;
					book5.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book5.title + ".");
				}
						
				if (borrowRequest.equals(book6.title) && book6.copies > 0)
				{
					book6.copies --;
					book6.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book6.title + ".");
				}
						
				if (borrowRequest.equals(book7.title) && book7.copies > 0)
				{
					book7.copies --;
					book7.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book7.title + ".");
				}
				
				if (borrowRequest.equals(book8.title) && book8.copies > 0)
				{
					book8.copies --;
					book8.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book8.title + ".");
				}
						
				if (borrowRequest.equals(book9.title) && book9.copies > 0)
				{
					book9.copies --;
					book9.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book9.title + ".");
				}
						
				if (borrowRequest.equals(book10.title) && book10.copies > 0)
				{
					book10.copies --;
					book10.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book10.title + ".");
				}
				
				if (borrowRequest.equals(book11.title) && book11.copies > 0)
				{
					book11.copies --;
					book11.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book11.title + ".");
				}
				
				if (borrowRequest.equals(book12.title) && book12.copies > 0)
				{
					book12.copies --;
					book12.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book12.title + ".");
				}
				
				if (borrowRequest.equals(book13.title) && book13.copies > 0)
				{
					book13.copies --;
					book13.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book13.title + ".");
				}
				
				if (borrowRequest.equals(book14.title) && book14.copies > 0)
				{
					book14.copies --;
					book14.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book14.title + ".");
				}
				
				if (borrowRequest.equals(book15.title) && book15.copies > 0)
				{
					book15.copies --;
					book15.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book15.title + ".");
				}
				
				if (borrowRequest.equals(book16.title) && book16.copies > 0)
				{
					book16.copies --;
					book16.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book16.title + ".");
				}
				
				if (borrowRequest.equals(book17.title) && book17.copies > 0)
				{
					book17.copies --;
					book17.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book17.title + ".");
				}
				
				if (borrowRequest.equals(book18.title) && book18.copies > 0)
				{
					book18.copies --;
					book18.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book18.title + ".");
				}
				
				if (borrowRequest.equals(book19.title) && book19.copies > 0)
				{
					book19.copies --;
					book19.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book19.title + ".");
				}
				
				if (borrowRequest.equals(book20.title) && book20.copies > 0)
				{
					book20.copies --;
					book20.borrowed = true;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("You have borrowed " + book20.title + ".");
				}
						
			}			
		
		});
				GridBagConstraints gbc_btnBorrow = new GridBagConstraints();
				gbc_btnBorrow.insets = new Insets(0, 0, 5, 0);
				gbc_btnBorrow.gridx = 0;
				gbc_btnBorrow.gridy = 7;
				contentPane.add(btnBorrow, gbc_btnBorrow);
				btnBorrow.setVisible(false);
		
				// Return button functionality
				btnReturn = new JButton("Return");	
				btnReturn.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent rtrn) {
					String returnedBook;
				
				returnedBook = textField2.getText();						
				if (returnedBook.equals(book1.title) && book1.borrowed == true)
				{
					book1.copies ++;
					book1.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book1.title + ".");
				}
				
				if (returnedBook.equals(book2.title) && book2.borrowed == true)
				{
					book2.copies ++; 
					book2.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book2.title + ".");
				}
				
				if (returnedBook.equals(book3.title) && book3.borrowed == true)
				{
					book3.copies ++;
					book3.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book3.title + ".");
				}
				
				if (returnedBook.equals(book4.title) && book4.borrowed == true)
				{
					book4.copies ++;
					book4.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book4.title + ".");
				}
				
				if (returnedBook.equals(book5.title) && book5.borrowed == true)
				{
					book5.copies ++;
					book5.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book5.title + ".");
				}
				
				if (returnedBook.equals(book6.title) && book6.borrowed == true)
				{
					book6.copies ++;
					book6.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book6.title + ".");
				}
				
				if (returnedBook.equals(book7.title) && book7.borrowed == true)
				{
					book7.copies ++;
					book7.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book7.title + ".");
				}
				
				if (returnedBook.equals(book8.title) && book8.borrowed == true)
				{
					book8.copies ++;
					book8.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book8.title + ".");
				}
				
				if (returnedBook.equals(book9.title) && book9.borrowed == true)
				{
					book9.copies ++;
					book9.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book9.title + ".");
				}
				
				if (returnedBook.equals(book10.title) && book1.borrowed == true)
				{
					book10.copies ++;
					book10.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book10.title + ".");
				}	
				
				if (returnedBook.equals(book11.title) && book11.borrowed == true)
				{
					book11.copies ++;
					book11.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book11.title + ".");
				}
				
				if (returnedBook.equals(book12.title) && book12.borrowed == true)
				{
					book12.copies ++;
					book12.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book12.title + ".");
				}
				
				if (returnedBook.equals(book13.title) && book13.borrowed == true)
				{
					book13.copies ++;
					book13.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book13.title + ".");
				}
				
				if (returnedBook.equals(book14.title) && book14.borrowed == true)
				{
					book14.copies ++;
					book14.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book14.title + ".");
				}
				
				if (returnedBook.equals(book15.title) && book15.borrowed == true)
				{
					book15.copies ++;
					book15.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book15.title + ".");
				}
				
				if (returnedBook.equals(book16.title) && book16.borrowed == true)
				{
					book16.copies ++;
					book16.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book16.title + ".");
				}
				
				if (returnedBook.equals(book17.title) && book17.borrowed == true)
				{
					book17.copies ++;
					book17.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book17.title + ".");
				}
				
				if (returnedBook.equals(book18.title) && book18.borrowed == true)
				{
					book18.copies ++;
					book18.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book8.title + ".");
				}
				
				if (returnedBook.equals(book19.title) && book19.borrowed == true)
				{
					book19.copies ++;
					book19.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book19.title + ".");
				}
				
				if (returnedBook.equals(book20.title) && book20.borrowed == true)
				{
					book20.copies ++;
					book20.borrowed = false;
					textField.setText("");
					textField2.setText("");
					txtpnMenuFictionNonfiction.setText("Thank you for returning " + book20.title + ".");
				}						
			}			
		});
		GridBagConstraints gbc_btnReturn = new GridBagConstraints();
		gbc_btnReturn.insets = new Insets(0, 0, 5, 0);
		gbc_btnReturn.gridx = 0;
		gbc_btnReturn.gridy = 9;
		contentPane.add(btnReturn, gbc_btnReturn);
		btnReturn.setVisible(false);
		
		// Menu button functionality
		btnReturnToMenu = new JButton("Menu");
		btnReturnToMenu.addActionListener(new ActionListener() {
			
			// Go back to menu if button is pressed
			public void actionPerformed(ActionEvent back) 
			{				
				txtpnMenuFictionNonfiction.setText("\t\n\tFiction\t\t\t\tNonfiction\n\n\t1.) Borrow fiction book\t\t7.) Borrow nonfiction book\n\t2.) Return fiction book\t\t\t8.) Return nonfiction book\n\t3.) Show all fiction books\t\t9.) Show all nonfiction books\n\t4.) Sort fiction by best rated\t\t10.) Sort nonfiction by best rated\n\t5.) Sort fiction by length in pages \t\t11.) Sort nonfiction by length in pages\n\t6.) Sort fiction alphabetically \t\t12.) Sort nonfiction alphabetically");
				textField2.setVisible(false);
				btnBorrow.setVisible(false);
				btnReturn.setVisible(false);
				btnEnter.setVisible(true);
				lblMenu.setVisible(true);
				textField.setText("");
			}			
		});
		GridBagConstraints gbc_btnReturnToMenu = new GridBagConstraints();
		gbc_btnReturnToMenu.gridx = 0;
		gbc_btnReturnToMenu.gridy = 11;
		contentPane.add(btnReturnToMenu, gbc_btnReturnToMenu);
	
	
			
	}
}



	

