package Day01Assignment;

interface Searchable {
    void search(String keyword);
}

abstract class Resource {
    private String title;
    private boolean checkedOut;

    public Resource(String title) {
        this.title = title;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println(getTitle() + " checked out .");
        } else {
            System.out.println(getTitle() + " is already checked out.");
        }
    }

    public void returnResource() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println(getTitle() + " returned.");
        } else {
            System.out.println(getTitle() + " is already available.");
        }
    }
}

class Book extends Resource implements Searchable {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void search(String keyword) {
        if (getTitle().contains(keyword) || getAuthor().contains(keyword)) {
            System.out.println(getTitle() + " by " + getAuthor() + " found.");
        } else {
            System.out.println("No match found for " + keyword + ".");
        }
    }
}

class Journal extends Resource implements Searchable {
    private int issueNumber;

    public Journal(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void search(String keyword) {
        if (getTitle().contains(keyword)) {
            System.out.println(getTitle() + " (Issue " + getIssueNumber() + ") found.");
        } else {
            System.out.println("No match found for " + keyword + ".");
        }
    }
}

class Multimedia extends Resource implements Searchable {
    private String format;

    public Multimedia(String title, String format) {
        super(title);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void search(String keyword) {
        if (getTitle().contains(keyword)) {
            System.out.println(getTitle() + " (" + getFormat() + ") found.");
        } else {
            System.out.println("No match found for " + keyword + ".");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "Alok");
        Journal journal = new Journal("Account Journal", 5);
        Multimedia multimedia = new Multimedia("Avtar", "DVD");

        book.checkOut();
        journal.checkOut();
        multimedia.checkOut();

        book.returnResource();
        journal.returnResource();
        multimedia.returnResource();

        book.search("Java");
        journal.search("Science");
        multimedia.search("Movie");
    }
}
