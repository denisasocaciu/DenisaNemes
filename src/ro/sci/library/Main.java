package ro.sci.library;

public class Main {
    public static void main(String[] args) {
        Library BLUE = new Library();

        BLUE.addBook("Novel","Baltagul",280,"mister");
        BLUE.addBook("Novel","Enigma Otiliei",215,"mister");
        BLUE.addBook("artalbum","desene",5,"50");
        BLUE.addBook("artalbum","desenePartea2",50,"60");

        BLUE.listBooks();

        BLUE.deleteBook("desene");


    }
}

