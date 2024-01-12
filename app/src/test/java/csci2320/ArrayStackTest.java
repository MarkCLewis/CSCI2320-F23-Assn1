package csci2320;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {
  @Test void emptyOnCreate() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>();
    assertTrue(stack.isEmpty(), "Stack should be empty on creation");
  }

}
