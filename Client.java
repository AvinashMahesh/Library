public class Client 

{
          //instance variables
	private String name;
	private Book book1;
	private Book book2;
	private Book book3;

	
    public Client (String n) {
    	name = n;
    }

    public Client (String n, Book b) {
    	name = n;
    	book1 = b;
    }
/*
    public Client (String n, Book b1, Book b2) {
    	name = n;
    	book1 = b1;
    	book2 = b2;
    }

    public Client (String n, Book b1, Book b2, Book b3) {
    	name = n;
    	book1 = b1;
    	book2 = b2;
    	book3 = b3;
    }

    public boolean canBorrow() {

    	if(book1 == null || book2 == null || book3 == null) {
    		return true;
    	}
    	else
    	System.out.println ("Error");
    	return false;

    }

    public boolean returnBook(Book b) {

    	if(b == book1) {
    		book1 = b;
    		System.out.println("You have borrowed " + book1.getTitle()  + " by " +  book1.getAuthor());
    		return true;
    	}

    	if(b == book2) {
    		book2 = b;
    		System.out.println("You have borrowed " + book2.getTitle()  + " by " +  book2.getAuthor());
    		return true;
    	}

    	if(b == book3) {
    		book3 = b;
    		System.out.println("You have borrowed " + book3.getTitle()  + " by " +  book3.getAuthor());
    		return true;
    	}
    	System.out.println ("Error");
    	return false;

    }



    public boolean borrowBook (Book b) {

    	if(book1 == null) {

    		book1 = b;

    		System.out.println("You have borrowed " + book1.getTitle()  + " by " +  book1.getAuthor() + ".");

    		return true;

    	}

    	if(book2 == null) {

    		book2 = b;

    		System.out.println("You have borrowed " + book2.getTitle()  + " by " +  book2.getAuthor()+ ".");

    		return true;

    	}

    	if(book3 == null) {

    		book3 = b;

    		System.out.println("You have borrowed " + book3.getTitle()  + " by " +  book3.getAuthor()+ ".");

    		return true;

    	}
    	System.out.println ("Error");
    	return false;

    }


    public boolean hasBook(Book b) {

    	if(b == book1) {

    		System.out.println(name + " has " + book1.getTitle()  + " by " +  book1.getAuthor());
    		return true;

    	}

    	if(b == book2) {

    		System.out.println(name + " has " + book2.getTitle()  + " by " +  book2.getAuthor());
    		return true;

    	}

    	if(b == book3) {

    		System.out.println(name + " has " + book3.getTitle()  + " by " +  book3.getAuthor());
    		return true;

    	}
    	System.out.println ("Error");
    	return false;
    }


    public String toString() {

    	return("Clent Name: " + name + "\nBook 1: " + book1.getTitle()  + " by " +  book1.getAuthor() + "\nBook 2: " + book2.getTitle() + " by " + book2.getAuthor() + "\nBook 3: " + book3.getTitle()  + " by " +  book3.getAuthor());

    }
}
