package main.java.ro.sci.week9.IO;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        Board board = new Board();

        board.readAthletes();
        board.printResults();


    }

}
