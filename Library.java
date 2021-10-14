public class Library {
	
public static void main (String[] args)
{
	
Book b1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");

Book b2 = new Book("Jeff Kinley" , "Diary of a Wimpy Kid");

Book b3 = new Book("William Golding" , "Lord of the Flies");

Book b4 = new Book("Dr. Suess" , "The Cat in the Hat");


Client client1 = new Client ("Avinash");

client1.borrowBook(b1);

client1.borrowBook(b2);

client1.borrowBook(b3);

client1.borrowBook(b4);


client1.returnBook(b2);


System.out.println(client1.toString());


client1.hasBook(b1);

client1.hasBook(b4);

client1.returnBook(b4);

client1.borrowBook(b4);


client1.canBorrow();

		}
	}
