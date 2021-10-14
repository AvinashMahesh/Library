public class Book {
	private String title;
	private String author;
	
	
	public Book (String t, String a)
	{
		title = t;
		author = a;
	}
	public String getTitle()
	{
		return author;
	}
	public String getAuthor()
	{
		return title;
	}
	public String toString()
	{
		return "Title: " + title + "/nAuthor: " + author; 
	}
}
