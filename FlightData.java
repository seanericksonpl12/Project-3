import java.util.ArrayList;
//--== CS400 File Header Information ==--
//Name: Erhan Wang
//Email: ewang43@wisc.edu
//Team: blue
//Role: data wrangler
//TA: hang
//Lecturer: florian
//Notes to Grader: <optional extra notes>
/**
 * This is the class that create a path which contain start, end, time and price.
 * And put all the value into a path and put paths into a list
 * 
 * @author Erhan Wang
 * @version 1.0
 *
 */
public class FlightData {
  //the arraylist that contains all the paths
  private ArrayList<FlightPath> flightList;
  /**
   * Constructor of the class which give every variable a value
   */
  public FlightData() {
    FlightPath ord1 = new FlightPath("ORD", "SEA", 90, 900);
    FlightPath ord2 = new FlightPath("ORD", "LAX", 30, 500);
    FlightPath ord3 = new FlightPath("ORD", "DEN", 45, 550);
    FlightPath ord4 = new FlightPath("ORD", "ATL", 200, 1200);
    FlightPath ord5 = new FlightPath("ORD", "DCA", 130, 1000);
    FlightPath ord6 = new FlightPath("ORD", "JFK", 60, 900);
 
    FlightPath atl1 = new FlightPath("ATL", "DEN", 45, 800);
    FlightPath atl2 = new FlightPath("ATL", "DFW", 240, 2000);
    FlightPath atl3 = new FlightPath("ATL", "MCO", 100, 1500);
    FlightPath atl4 = new FlightPath("ATL", "DCA", 120, 1500);
    FlightPath atl5 = new FlightPath("ATL", "JFK", 75, 1000);

    FlightPath mco1 = new FlightPath("MCO", "DFW", 35, 200);
    FlightPath mco2 = new FlightPath("MCO", "DCA", 63, 500);
    FlightPath mco3 = new FlightPath("MCO", "JFK", 100, 1000);
  
    FlightPath dca1 = new FlightPath("DCA", "JFK", 88, 888);
  
    FlightPath jfk1 = new FlightPath("JFK", "SEA", 150, 1888);
  
    FlightPath dfw1 = new FlightPath("DFW", "HNL", 99, 999);
    FlightPath dfw2 = new FlightPath("DFW", "LAX", 40, 488);
    FlightPath dfw3 = new FlightPath("DFW", "DEN", 75, 799);
  
    FlightPath den1 = new FlightPath("DEN", "LAX", 160, 1799);
    FlightPath den2 = new FlightPath("DEN", "SEA", 175, 1999);
  
    FlightPath lax1 = new FlightPath("LAX", "HNL", 70, 798);
    FlightPath lax2 = new FlightPath("LAX", "SEA", 55, 399);
  
    FlightPath sea1 = new FlightPath("SEA", "HNL", 275, 2666);
  
    flightList.add(ord1);
    flightList.add(ord2);
    flightList.add(ord3);
    flightList.add(ord4);
    flightList.add(ord5);
    flightList.add(ord6);
    flightList.add(atl1);
    flightList.add(atl2);
    flightList.add(atl3);
    flightList.add(atl4);
    flightList.add(atl5);
    flightList.add(mco1);
    flightList.add(mco2);
    flightList.add(mco3);
    flightList.add(dca1);
    flightList.add(jfk1);
    flightList.add(dfw1);
    flightList.add(dfw2);
    flightList.add(dfw3);
    flightList.add(den1);
    flightList.add(den2);
    flightList.add(lax1);
    flightList.add(lax2);
    flightList.add(sea1);
  
  }
}
