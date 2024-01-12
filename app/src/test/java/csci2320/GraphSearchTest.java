package csci2320;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GraphSearchTest {
  @Test void testSmallGraphBFS1() {
    List<List<Integer>> graph = List.of(
      List.of(0, 1, 2),
      List.of(2, 3),
      List.of(3),
      List.of(1, 4),
      List.of()
    );
    int shortest = GraphSearch.bfsShortestPath(graph, 0, 4);
    assertEquals(3, shortest);
  }
  
  @Test void testMazeConvertOpen() {
    int[][] maze = {
      {0,0,0},
      {0,0,0},
      {0,0,0}
    };
    var gl = MazeToGraph.mazeToAdjacencyList(maze);
    var graph = gl.graph();
    assertEquals(List.of(3,1), graph.get(0), "Wrong connections from 0.");
    assertEquals(List.of(1,7,3,5), graph.get(4), "Wrong connections from 4.");
    assertEquals(List.of(5,7), graph.get(8), "Wrong connections from 8.");
    var locs = gl.locMap();
    assertEquals(0, locs.get(new MazeToGraph.MazeLocation(0,0)), "Wrong index for 0,0");
    assertEquals(4, locs.get(new MazeToGraph.MazeLocation(1,1)), "Wrong index for 1,1");
    assertEquals(8, locs.get(new MazeToGraph.MazeLocation(2,2)), "Wrong index for 2,2");
  }

  @Test void testMazeConvertLoop() {
    int[][] maze = {
      {0,0,0},
      {0,1,0},
      {0,0,0}
    };
    var gl = MazeToGraph.mazeToAdjacencyList(maze);
    var graph = gl.graph();
    assertEquals(List.of(3,1), graph.get(0), "Wrong connections from 0.");
    assertEquals(List.of(0,5), graph.get(3), "Wrong connections from 3.");
    assertEquals(List.of(4,6), graph.get(7), "Wrong connections from 7.");
  }

  @Test void testMazeConvertU() {
    int[][] maze = {
      {0,1,0},
      {0,1,0},
      {0,0,0}
    };
    var gl = MazeToGraph.mazeToAdjacencyList(maze);
    var graph = gl.graph();
    assertEquals(List.of(2), graph.get(0), "Wrong connections from 0.");
    assertEquals(List.of(0,4), graph.get(2), "Wrong connections from 2.");
    assertEquals(List.of(3,5), graph.get(6), "Wrong connections from 6.");
  }
}
