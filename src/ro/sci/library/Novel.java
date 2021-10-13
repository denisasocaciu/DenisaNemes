package ro.sci.library;

public class Novel extends Book {
    private final String novelType;

   Novel(String bookName, int pages, String novelType) {
        super(bookName, pages);
        this.novelType = novelType;

    }
    @Override
    public String toString() {
        return super.toString() + "Novel{" +
                "novelType='" + novelType + '\'' +
                '}';
    }
}