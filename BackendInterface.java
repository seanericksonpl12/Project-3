// --== CS400 File Header Information ==--
// Name: Sam Bingenheimer
// Email: sbingenheime@wisc.edu
// Team: HG
// Role: Backend Developer
// TA: Hang
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
import java.util.List;

public interface BackendInterface {

  public List<String> getShortestPath(String start, String end);

  public List<String> getCheapestPath(String start, String end);

  public int getDistance(String start, String end);

  public int getTotalTime(String start, String end);

  public int getTotalCost(String start, String end);

  public String listAirports();



}
