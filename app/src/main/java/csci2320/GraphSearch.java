package csci2320;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphSearch {
  // Use this type in your queue.
  static record VertexDistancePair(int vertex, int distance) {}
  // Use this type in your stack.
  static record VertexVisitedPair(int vertex, Set<Integer> visited) {}

  /**
   * This method takes an adjacency list and two vertices, start and end, and returns the length of the shortest path from start to end.
   * @param adj adjacency list representation of a graph
   * @param start index of the vertex to start at
   * @param end index of the vertex to end at
   * @return the length of the shortest path from start to end
   */
  public static int dfsShortestPath(List<List<Integer>> adj, int start, int end) {
    // You will use a stack in here.
    int minDist = 1000000000;
    // Put your code here.
    return minDist;
  }

  /**
   * This method takes an adjacency list and two vertices, start and end, and returns the length of the shortest path from start to end.
   * @param adj adjacency list representation of a graph
   * @param start index of the vertex to start at
   * @param end index of the vertex to end at
   * @return the length of the shortest path from start to end
   */
  public static int bfsShortestPath(List<List<Integer>> adj, int start, int end) {
    // You will use a queue in here.
    // Put your code here.
    return 3;  // This makes my one test pass. Change this according to your code.
  }

  /**
   * This method takes an adjacency list and two vertices, start and end, and returns the length of the longest path from start to end.
   * @param adj adjacency list representation of a graph
   * @param start index of the vertex to start at
   * @param end index of the vertex to end at
   * @return the length of the longest path from start to end
   */
  public static int dfsLongestPath(List<List<Integer>> adj, int start, int end) {
    // You will use a stack in here.
    int maxDist = -1000000000;
    // Put your code here.
    return maxDist;
  }

  // ******************** Don't edit stuff below here ********************************
  public static record MazeLocation(int row, int col) {}
  public static record GraphAndLocMap(List<List<Integer>> graph, Map<MazeLocation, Integer> locMap) {}

  /**
   * This method takes a maze as a grid if ints and produces an adjacency list representation of the maze.
   * @param maze grid of values, 0 is a path and anything else is a wall
   * @return the adjacency list representation of the maze
   */
  public static GraphAndLocMap mazeToAdjacencyList(int[][] maze) {
    int[][] nodeNumbers = new int[maze.length][maze[0].length];
    Map<MazeLocation, Integer> locMap = new HashMap<>();
    int nodeCnt = 0;
    for (int i = 0; i < nodeNumbers.length; i++) {
      for (int j = 0; j < nodeNumbers[i].length; j++) {
        if (maze[i][j] == 0) {
          nodeNumbers[i][j] = nodeCnt;
          locMap.put(new MazeLocation(i, j), nodeCnt);
          nodeCnt++;
        } else {
          nodeNumbers[i][j] = -1;
        }
      }
    }
    List<List<Integer>> adj = new ArrayList<List<Integer>>();
    for (int i = 0; i < nodeNumbers.length; i++) {
      for (int j = 0; j < nodeNumbers[i].length; j++) {
        if (nodeNumbers[i][j] != -1) {
          List<Integer> neighbors = new ArrayList<Integer>();
          if (i > 0 && nodeNumbers[i - 1][j] != -1) {
            neighbors.add(nodeNumbers[i - 1][j]);
          }
          if (i < nodeNumbers.length - 1 && nodeNumbers[i + 1][j] != -1) {
            neighbors.add(nodeNumbers[i + 1][j]);
          }
          if (j > 0 && nodeNumbers[i][j - 1] != -1) {
            neighbors.add(nodeNumbers[i][j - 1]);
          }
          if (j < nodeNumbers[i].length - 1 && nodeNumbers[i][j + 1] != -1) {
            neighbors.add(nodeNumbers[i][j + 1]);
          }
          adj.add(neighbors);
        }
      }
    }
    return new GraphAndLocMap(adj, locMap);
  }
}
