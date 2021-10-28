package main.java.ro.sci.exceptions;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

class Main {

    private static final Logger littleSnitch = Logger.getLogger("littleSnitch");

    public static void main(String[] args) {


        littleSnitch.info("Started app");

        Student student1 = new Student("a", "b", LocalDate.parse("1290-04-05"), "f", 123455334);

        if (!student1.validateNames()) {
            littleSnitch.log(Level.SEVERE, "Invalid name or lastname");
            throw new IllegalArgumentException("Name and lastname can't be empty");
        }

        try {
            if (!student1.validateBirthDate()) {
                throw new Exception("Birth date is not valid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            littleSnitch.log(Level.SEVERE, "Invalid birth date ", e);
        }


        System.out.println(student1);

        littleSnitch.info("Finished application");

    }
}