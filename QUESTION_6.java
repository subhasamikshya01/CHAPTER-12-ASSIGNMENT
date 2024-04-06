abstract class LibraryResource{
	private String title,author;
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public LibraryResource(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public abstract void displayDetails();	
}

class Book extends LibraryResource{
	private int pageCount;
	public int getPageCount() {
		return pageCount;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public Book(String title, String author,int pageCount) {
		super(title, author);
		this.pageCount=pageCount;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("BOOK TITLE:- "+getTitle()+"\nAUTHOR:- "+getAuthor()+"\nPAGE COUNT:- "+this.pageCount);
	}
	
}

class Magazine extends LibraryResource{
	public String getIssueDate() {
		return issueDate;
	}
	
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
	private String issueDate;
	public Magazine(String title, String author, String issueDate) {
		super(title, author);
		this.issueDate=issueDate;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("MAGAZINE TITLE:- "+getTitle()+"\nAUTHOR:- "+getAuthor()+"\nDATE OF ISSUE:- "+this.issueDate);
	}
	
}

class DVD extends LibraryResource{
	private int duration;
	public DVD(String title, String author,int duration) {
		super(title, author);
		this.duration=duration;
	}

	@Override
	public void displayDetails() {
		System.out.println("DVD TITLE:- "+getTitle()+"\nAUTHOR:- "+getAuthor()+"\nDURATION:- "+this.duration+" minutes");
	}
	
}

public class QUESTION_6 {

	public static void main(String[] args) {
		LibraryResource Book=new Book("TITLE1","AUTHOR1",10);
		LibraryResource Magazine=new Magazine("TITLE2","AUTHOR2","22.05.2022");
		LibraryResource DVD=new DVD("TITLE3","AUTHOR3",68);
		System.out.println("DETAILS:- ");
		System.out.println();
		Book.displayDetails();
		System.out.println();
		Magazine.displayDetails();
		System.out.println();
		DVD.displayDetails();
	}

}
