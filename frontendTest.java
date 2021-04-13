// --== CS400 File Header Information ==--
// Name: Shupeng Tang
// Email: stang72@wisc.edu
// Team: HG
// Role: frontend Developer
// TA: Hang
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.StringReader;

/**
 * This class tests the functionality of frontend.java
 * 
 * @author shupengtang
 *
 */
public class frontendTest {
  /**
   * This tests if entering exit will successfully exit the program
   */
  @Test
  public void testExit() {
    // input and output streams that will be used to run the app
    PrintStream standardOut = System.out;
    InputStream standardIn = System.in;
    try {
      // the key that will be inputed
      String input = "exit";
      // setting the input stream to x
      InputStream inputStreamSimulator = new ByteArrayInputStream(input.getBytes());
      System.setIn(inputStreamSimulator);
      ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
      System.setOut(new PrintStream(outputStreamCaptor));// to get the output
      // frontend and backend that will be tested on
      Frontend f = new Frontend();
      Backend b;
      b = new Backend();
      f.backend(b);
      // runs the program.
      f.run();
      // settting in and out
      System.setOut(standardOut);
      System.setIn(standardIn);
      // boolean to see if the frontend exists or not.
      Boolean tester;
      // if it exists return true or false if its null
      if (f == null) {
        tester = false;
      } else {
        tester = true;
      }

      // if the front end is not null that means the app closed and test passes.
      assertEquals(tester, true);
    } catch (Exception e) {
      Boolean fail = false;
      assertEquals(fail, false);
    }
  }



  // /**
  // * This test tests if the returned shortest path is correct
  // */
  @Test
  public void testShortestPath() {
    try {
      Frontend f = new Frontend();
      Backend back;

      // input and output streams that will be used to run the app
      PrintStream standardOut = System.out;
      InputStream standardIn = System.in;
      String data = "S" + System.lineSeparator() + "sea" + System.lineSeparator() + "ord";
      InputStream inputStreamSimulator = new ByteArrayInputStream(data.getBytes());
      System.setIn(inputStreamSimulator);

      ByteArrayOutputStream output = new ByteArrayOutputStream();
      System.setOut(new PrintStream(output));// to get the output
      // frontend and backend that will be tested on

      back = new Backend();
      f.backend(back);
      // runs the program.
      f.run();
      // sets in and out
      System.setOut(standardOut);
      System.setIn(standardIn);
      boolean test = false;
      if (output.toString().contains("[ORD, LAX, SEA]")) {
        test = true;
      } else {
        test = false;
      }
      assertEquals(test, true);
    } catch (Exception e) {
      Boolean fail = false;
      assertEquals(fail, false);
    }

  }

  
  
  /**
  * This test tests if the returned cheapest path is correct
  */
  @Test
  public void testCheapestPath() {
    try {
      Frontend f = new Frontend();
      Backend back;

      // input and output streams that will be used to run the app
      PrintStream standardOut = System.out;
      InputStream standardIn = System.in;
      String data = "C" + System.lineSeparator() + "ord" + System.lineSeparator() + "lax";
      InputStream inputStreamSimulator = new ByteArrayInputStream(data.getBytes());
      System.setIn(inputStreamSimulator);

      ByteArrayOutputStream output = new ByteArrayOutputStream();
      System.setOut(new PrintStream(output));// to get the output
      // frontend and backend that will be tested on

      back = new Backend();
      f.backend(back);
      // runs the program.
      f.run();
      // sets in and out
      System.setOut(standardOut);
      System.setIn(standardIn);
      boolean test;
      if (output.toString().contains("[ORD, LAX]")) {
        test = true;
      } else {
        test = false;
      }
      assertEquals(test, true);
    } catch (Exception e) {
      Boolean fail = false;
      assertEquals(fail, false);
    }
  }

  //
  // /**
  // * This test tests if the returned distance path is correct
  // */
  @Test
  public void testDistance() {
    try {
      Frontend f = new Frontend();
      Backend back;

      // input and output streams that will be used to run the app
      PrintStream standardOut = System.out;
      InputStream standardIn = System.in;
      String data = "D" + System.lineSeparator() + "sea" + System.lineSeparator() + "ord";
      InputStream inputStreamSimulator = new ByteArrayInputStream(data.getBytes());
      System.setIn(inputStreamSimulator);

      ByteArrayOutputStream output = new ByteArrayOutputStream();
      System.setOut(new PrintStream(output));// to get the output
      // frontend and backend that will be tested on

      back = new Backend();
      f.backend(back);
      // runs the program.
      f.run();
      // sets in and out
      System.setOut(standardOut);
      System.setIn(standardIn);
      boolean test;
      if (output.toString().contains("42500")) {
        test = true;
      } else {
        test = false;
      }
      assertEquals(test, true);
    } catch (Exception e) {
      Boolean fail = false;
      assertEquals(fail, false);
    }
  }
  
  /**
   * This test tests if another distance is correct
   */
  @Test
  public void testDistance2() {
    try {
      Frontend f = new Frontend();
      Backend back;

      // input and output streams that will be used to run the app
      PrintStream standardOut = System.out;
      InputStream standardIn = System.in;
      String data = "D" + System.lineSeparator() + "ord" + System.lineSeparator() + "den";
      InputStream inputStreamSimulator = new ByteArrayInputStream(data.getBytes());
      System.setIn(inputStreamSimulator);

      ByteArrayOutputStream output = new ByteArrayOutputStream();
      System.setOut(new PrintStream(output));// to get the output
      // frontend and backend that will be tested on

      back = new Backend();
      f.backend(back);
      // runs the program.
      f.run();
      // sets in and out
      System.setOut(standardOut);
      System.setIn(standardIn);
      boolean test;
      if (output.toString().contains("42500")) {
        test = true;
      } else {
        test = false;
      }
      assertEquals(test, true);
    } catch (Exception e) {
      Boolean fail = false;
      assertEquals(fail, false);
    }
  }

}


