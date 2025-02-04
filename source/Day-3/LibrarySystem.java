/*Question:
Create a class hierarchy for a Library System. Implement a base class Item with properties like title, author, and publicationYear. Derive two classes, Book and Magazine, from the Item class.
Each derived class should have additional properties such as genre for books and issueNumber for magazines. Write methods in each class to display their details.
Demonstrate the use of inheritance by creating objects of both classes and calling their respective methods.*/
import java.util.*;
class Util
{
	public static boolean checkIsValidString(String str)
	{
		if(str == null || str.isBlank())
			return false;
		return true;
	}
}

class Item
{
	private String title = "Atomic habits";
	private String author = "James Clear";
	private String publicationYear = "2018";

	public void setTitle(String title)
	{
		if(!Util.checkIsValidString(title))
			throw new IllegalArgumentException("Title cannot be null or empty");
		this.title = title;
	}

	public String getTitle()
	{
		return this.title;
	}

	public void setAuthor(String author)
	{
		if(!Util.checkIsValidString(author))
			throw new IllegalArgumentException("Author cannot be null or empty");
		this.author = author;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setPublicationYear(String publicationYear)
	{
		this.publicationYear = publicationYear;
	}

	public String getPublicationYear()
	{
		return publicationYear;
	}

	public Item()
	{

	}

	public Item(String title, String author, String publicationYear)
	{
		setTitle(title);
		setAuthor(author);
		setPublicationYear(publicationYear);
	}

	public void showDetails()
	{
		System.out.println("Item Details = > title : " + title + ", author : " + author + ", publication year : " + publicationYear);
	}
}

class Book extends Item
{
	private String genre;

	public void setGenre(String genre)
	{
		if(!Util.checkIsValidString(genre))
			throw new IllegalArgumentException("Genre cannot be null or empty");
		this.genre = genre;
	}

	public String getGenre()
	{
		return genre;
	}

	public Book()
	{

	}

	public Book(String genre)
	{
		setGenre(genre);
	}

	public void showDetails()
	{
		System.out.println("Book Details = > title : " + super.getTitle() + ", author : " + super.getAuthor() + ", publication year : " + super.getPublicationYear() + ", genre : " + genre);
	}
}

class Magazine extends Item
{
	String issueNumber;

	public void setIssueNumber(String issueNumber)
	{
		if(!Util.checkIsValidString(issueNumber))
			throw new IllegalArgumentException("issueNumber cannot be null or empty");
		this.issueNumber = issueNumber;
	}

	public String getIssueNumber()
	{
		return issueNumber;
	}

	public Magazine()
	{

	}

	public Magazine(String issueNumber)
	{
			setIssueNumber(issueNumber);
	}

	public void showDetails()
	{
		System.out.println("Book Details = > title : " + super.getTitle() + ", author : " + super.getAuthor() + ", publication year : " + super.getPublicationYear() + ", issue Number : " + issueNumber);
	}
}

public class LibrarySystem
{
	public static void main(String[] args)
	{
		Item i1 = new Item();
		Book b1 = new Book("Self help");
		Magazine m1 = new Magazine("10752");
		b1.showDetails();
		m1.showDetails();
	}
}