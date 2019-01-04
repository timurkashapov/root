import data_structures.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testStack() {
        Stack stack = new Stack(5);
        assertEquals(5, stack.getCapacity());
        stack.push('i');
        assertEquals(1, stack.getLength());
        stack.push('1');
        assertEquals(2, stack.getLength());
        stack.push('a');
        assertEquals(3, stack.getLength());
        stack.push('r');
        assertEquals(4, stack.getLength());
        stack.push('A');
        assertEquals(5, stack.getLength());
        System.out.println(stack.toString());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.toString());
    }
}
