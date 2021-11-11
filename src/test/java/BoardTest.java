package test.java;

import main.java.ro.sci.week9.IO.Board;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BoardTest {

       Board testLeaderboard = new Board();

        @Before
        public void setUp(){
            testLeaderboard.readAthletes();
        }


        @Test
        public void readAthletesTest() {

            assertEquals(testLeaderboard.getAthletes().size(), 3);

        }


    }
