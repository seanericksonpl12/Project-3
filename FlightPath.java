//--== CS400 File Header Information ==--
//Name: Erhan Wang
//Email: ewang43@wisc.edu
//Team: blue
//Role: data wrangler
//TA: hang
//Lecturer: florian
//Notes to Grader: <optional extra notes>
/**
 * This is the class that create a path which coontain start, end, time and price.
 * 
 * @author Erhan Wang
 * @version 1.0
 *
 */
public class FlightPath implements FlightPathInterface{
  private int flightTime;
  private int flightPrice;
  private String start;
  private String end;
  /**
   * Constructor of this class which gives all the variable a value and initiate a path
   * 
   * @param start the start of the path 
   * @param end  the end of the path 
   * @param time  how many minutes this path will take
   * @param price  how many dollars this path will take
   */
  public FlightPath(String start, String end, int time, int price) {
    this.flightTime = time;
    this.flightPrice = price;
    this.start = start;
    this.end = end;
  }
  /**
   * get the time of this path
   * 
   */
  @Override
  public int getFlightTime() {
    return flightTime;
  }
  /**
   * get the cost of this path
   * 
   */
  @Override
  public int getFlightPrice() {
    return flightPrice;
  }
  /**
   * get the start airport of this path
   * 
   */
  @Override
  public String getStart() {
    return start;
  }
  /**
   * get the end airport of this path
   * 
   */
  @Override
  public String getEnd() {
    return end;
  }

}
