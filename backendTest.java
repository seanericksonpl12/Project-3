// --== CS400 File Header Information ==--
// Name: Sam Bingenheimer
// Email: sbingenheime@wisc.edu
// Team: HG
// Role: Backend Developer
// TA: Hang
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class backendTest {

  /**
   * Tests to make sure the shortest path based on time is returned.
   */
  @Test
  public void timeShortestPath() {
    Backend test = new Backend();
    List<String> testList = new ArrayList<String>();
    testList.add("DCA");
    testList.add("JFK");
    testList.add("SEA");

    assertTrue(test.getShortestPath("DCA", "SEA").equals(testList));

    List<String> testList2 = new ArrayList<String>();
    testList2.add("MCO");
    testList2.add("DFW");
    testList2.add("LAX");

    assertTrue(test.getShortestPath("MCO", "LAX").equals(testList2));
  }

  /**
   * Tests to make sure the shortest path based on cost is returned.
   */
  @Test
  public void costShortestPath() {
    Backend test = new Backend();
    List<String> testList = new ArrayList<String>();
    testList.add("ATL");
    testList.add("MCO");
    testList.add("DFW");
    testList.add("LAX");

    assertTrue(test.getCheapestPath("ATL", "LAX").equals(testList));

    List<String> testList2 = new ArrayList<String>();
    testList2.add("DEN");
    testList2.add("LAX");
    testList2.add("HNL");

    assertTrue(test.getCheapestPath("DEN", "HNL").equals(testList2));
  }

  /**
   * Tests to make sure the total cost, time and distance is returned.
   */
  @Test
  public void testTotalCostAndTime() {
    Backend test = new Backend();

    // test get total cost
    assertTrue(test.getTotalCost("DEN", "HNL") == 2597);

    assertTrue(test.getTotalCost("ATL", "LAX") == 2188);

    // test get total time
    assertTrue(test.getTotalTime("DCA", "SEA") == 238);

    assertTrue(test.getTotalTime("MCO", "LAX") == 75);

    // test get distance
    assertTrue(test.getDistance("DCA", "SEA") == 119000);

    assertTrue(test.getDistance("MCO", "LAX") == 37500);
  }

}
