package ro.sci.library;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> catalog = new ArrayList<>();

    void addBook(String type, String bookName, int pages, String info) {
        if (type.equalsIgnoreCase("Novel")) {
            catalog.add(new Novel(bookName, pages, info));
        } else if (type.equalsIgnoreCase("artAlbum")) {
            catalog.add(new ArtAlbum(bookName, pages, info));
        } else {
            System.err.println("Unknown book type");

        }
    }

    void listBooks() {
        for (Book c : catalog) {
            System.out.println(c.toString());
        }

    }

    void deleteBook(String bookName) {

        for (Book c : catalog
        ) {
            if (c.getBookName().equalsIgnoreCase(bookName)) {
                System.out.println("Removing book number " + catalog.indexOf(c) + " book name " + c.getBookName());
                catalog.remove(c);
            }

        }


    }


}

