package test.java;

import main.java.ro.sci.week9.IO.Athlete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AthleteTest {

         @Test
        public void getTotalTime() {
            Athlete adi = new Athlete(10, "Adi", "RO", "1:10", "xxxxo", "xxxxo", "xxxxo");
            assertEquals(adi.getTotalTime(), 100);

        }
}
