package csci2320;

public class MazeSearch {
  public record MazeLocation(int row, int col) {
    public MazeLocation moveUp() {
      return new MazeLocation(row - 1, col);
    }

    public MazeLocation moveDown() {
      return new MazeLocation(row + 1, col);
    }

    public MazeLocation moveLeft() {
      return new MazeLocation(row, col - 1);
    }

    public MazeLocation moveRight() {
      return new MazeLocation(row, col + 1);
    }
  }

  /**
   * This method takes an adjacency list and two vertices, start and end, and returns the length of the shortest path from start to end.
   * @param adj adjacency list representation of a graph
   * @param start index of the vertex to start at
   * @param end index of the vertex to end at
   * @return the length of the shortest path from start to end
   */
  public static int dfsShortestPath(int[][] maze, MazeLocation start, MazeLocation end) {
    // You will use a stack in here.
    return 0;
  }

  /**
   * This method takes an adjacency list and two vertices, start and end, and returns the length of the shortest path from start to end.
   * @param adj adjacency list representation of a graph
   * @param start index of the vertex to start at
   * @param end index of the vertex to end at
   * @return the length of the shortest path from start to end
   */
  public static int bfsShortestPath(int[][] maze, MazeLocation start, MazeLocation end) {
    // You will use a queue in here.
    return 0;
  }

  /**
   * This method takes an adjacency list and two vertices, start and end, and returns the length of the longest path from start to end.
   * @param adj adjacency list representation of a graph
   * @param start index of the vertex to start at
   * @param end index of the vertex to end at
   * @return the length of the longest path from start to end
   */
  public static int dfsLongestPath(int[][] maze, MazeLocation start, MazeLocation end) {
    // You will use a stack in here.
    return 0;
  }
}
