import org.junit.Test;
import static org.junit.Assert.*;
//--== CS400 File Header Information ==--
//Name: Erhan Wang
//Email: ewang43@wisc.edu
//Team: blue
//Role: data wrangler
//TA: hang
//Lecturer: florian
//Notes to Grader: <optional extra notes>
/**
* This is a test class which test the four methods in flightPath.java
* 
* @author Erhan Wang
* @version 1.0
*
*/
public class FlightDataTest {
  FlightData test = new FlightData();
  /**
   * This tests if getFlightTime method works
   */
  @Test
  public  void TestgetFlightTime() {
    int time = test.getList().get(0).getFlightTime();
    assertEquals(90, time);
  }
  /**
   * This tests if getFlightPrice method works
   */
  @Test
  public  void TestgetFlightPrice() {
    int price = test.getList().get(0).getFlightPrice();
    assertEquals(900, price);
  }
  /**
   * This tests if getStart method works
   */
  @Test
  public  void TestgetStart() {
    String start = test.getList().get(0).getStart();
    assertEquals("ORD", start);
  }
  /**
   * This tests if getEnd method works
   */
  @Test
  public  void TestgetEnd() {
    String end = test.getList().get(0).getEnd();
    assertEquals("SEA", end);
  }
  
}
