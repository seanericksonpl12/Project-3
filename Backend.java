// --== CS400 File Header Information ==--
// Name: Sam Bingenheimer
// Email: sbingenheime@wisc.edu
// Team: HG
// Role: Backend Developer
// TA: Hang
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
import java.util.ArrayList;
import java.util.List;

/**
 * This class implements the data wranglers data. It uses the data to find the shortest flight path
 * based on time and also the cheapest flight path. It then uses this data to get the total time,
 * cost, and distance. Lastly it lists the available airports for the user.
 * 
 * @author sambingenheimer
 *
 */
public class Backend implements BackendInterface {
  private CS400Graph<String> time;
  private CS400Graph<String> cost;
  private ArrayList<FlightPath> airportList;

  /**
   * The backend constructor inserts all the vertices and edges into the two graphs based on time
   * and cost.
   */
  public Backend() {
    // new FlightData to use
    FlightData list = new FlightData();
    // sets the list equal to the airportsList to be utilized in this class.
    this.airportList = list.getList();
    this.time = new CS400Graph<>();
    this.cost = new CS400Graph<>();
    // goes through the list and if the airport has not already been added as a vertex, it is added
    // goes through both start and end since some airports are only a start or end
    for (int i = 0; i < this.airportList.size(); i++) {
      if (!time.containsVertex(this.airportList.get(i).getStart())
          && !cost.containsVertex(this.airportList.get(i).getStart())
          && !time.containsVertex(this.airportList.get(i).getEnd())
          && !cost.containsVertex(this.airportList.get(i).getEnd())) {
        time.insertVertex(this.airportList.get(i).getStart());
        time.insertVertex(this.airportList.get(i).getEnd());
        cost.insertVertex(this.airportList.get(i).getStart());
        cost.insertVertex(this.airportList.get(i).getEnd());
      }
    }
    // adds the edges for the time graph
    for (int j = 0; j < this.airportList.size(); j++) {
      if (!time.containsEdge(this.airportList.get(j).getStart(),
          this.airportList.get(j).getEnd())) {
        time.insertEdge(this.airportList.get(j).getStart(), this.airportList.get(j).getEnd(),
            this.airportList.get(j).getFlightTime());
      }
    }
    // adds the edges for the cost graph
    for (int k = 0; k < this.airportList.size(); k++) {
      if (!cost.containsEdge(this.airportList.get(k).getStart(),
          this.airportList.get(k).getEnd())) {
        cost.insertEdge(this.airportList.get(k).getStart(), this.airportList.get(k).getEnd(),
            this.airportList.get(k).getFlightPrice());
      }
    }


  }


  /**
   * This gets the shortest path between two airports based on time.
   * 
   * @return timeToReturn - returns the shortest path based on time.
   */
  @Override
  public List<String> getShortestPath(String start, String end) {
    List<String> timeToReturn = new ArrayList<String>();
    timeToReturn = time.shortestPath(start, end);
    return timeToReturn;
  }


  /**
   * This returns the shortest path between two airports based on cost.
   * 
   * @return costToReturn - the shortest path based on cost.
   */
  @Override
  public List<String> getCheapestPath(String start, String end) {
    List<String> costToReturn = new ArrayList<String>();
    costToReturn = cost.shortestPath(start, end);
    return costToReturn;
  }

  /**
   * Uses the total time for the shortest path between to airports to calculate the distance.\
   */
  @Override
  public int getDistance(String start, String end) {
    int totalTime = cost.getPathCost(start, end);
    int distance = totalTime * 500;// multiplies by 500 since the average speed of a commercial
                                   // airplane is 500 mph
    return distance;
  }


  /**
   * Lists the airports available to the user to travel to and from.
   * 
   * @return airports - the list of airports.
   */
  @Override
  public String listAirports() {
    String airports = "";
    // if the airport has not already been added to the string it is added
    for (int i = 0; i < this.airportList.size(); i++) {
      if (!airports.contains(this.airportList.get(i).getStart())
          && !airports.contains(this.airportList.get(i).getEnd())) {
        airports += this.airportList.get(i).getStart() + "\n";
        airports += this.airportList.get(i).getEnd() + "\n";
      }
    }
    return airports;
  }


  /**
   * gets the total time for the shortest path.
   * 
   * @return pathTotalTime - the total time.
   */
  @Override
  public int getTotalTime(String start, String end) {
    int pathTotalTime = time.getPathCost(start, end);
    return pathTotalTime;
  }


  /**
   * gets the total cost for the shortest path.
   * 
   * @return pathTotalCost - the total cost.
   */
  @Override
  public int getTotalCost(String start, String end) {
    int pathTotalCost = cost.getPathCost(start, end);
    return pathTotalCost;
  }


}
