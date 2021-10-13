package ro.sci.library;

public class ArtAlbum extends Book{

    private int paperQuality;
    ArtAlbum(String bookName, int pages, String paperQuality) {

        super(bookName, pages);
        this.paperQuality = Integer.parseInt(paperQuality);

    }

    public int getPaperQuality() {
        return paperQuality;
    }

    @Override
    public String toString() {
        return super.toString() + "ArtAlbum{" +
                "paperQuality=" + paperQuality +
                '}';
    }
}