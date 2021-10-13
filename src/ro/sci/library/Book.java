package ro.sci.library;

public class Book {
    private final String bookName;
    private final int pages;

    public Book(String bookName, int pages) {
        this.bookName = bookName;
        this.pages = pages;
    }
    Book() {
        this("undefined", 0);
    }

    String getBookName() {
        return bookName;
    }

    public int getPagesCount() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", pages=" + pages +
                '}';
    }
}

