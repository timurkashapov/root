package data_structures;

/**
 * Простая реализация структуры данных - стек.
 * Simple implementation of the stack data structure.
 *
 *
 *
 *
 */
public class Stack {

    private int top;
    private char[] array;
    private int capacity;
    private int length;

    public Stack(int capacity) {
        this.array = new char[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLength() {
        return length;
    }

    public char pop() {
        if (!isEmpty()) {
            length--;
            return array[top--];
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public void push(char ch) {
        if (!isFull()) {
            length++;
            array[++top] = ch;
        }
        else {
            throw new RuntimeException("Stack is full");
        }
    }

    public boolean isFull() {
        return length==capacity;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public String toString() {

        // length = N+1;
        // N ["s"] <-- top [N]
        // 2 ["d"]
        // 1 ["g"]
        // 0 ["r"]
        StringBuilder sb = new StringBuilder();
        if (!isEmpty()) {
            if (isFull()) {
                sb.append("Stack is full" + "\n");
            }
            sb.append("capacity = " + this.capacity + "\n");
            sb.append("length = " + (top + 1) + "\n\n");
            sb.append("[ " + array[top] + " ]" + " <--top " + "[" + top + "]" + "\n");
            for (int i = length - 2; i >= 0; --i) {
                sb.append("[ " + array[i] + " ]" + "\n");
            }
            sb.append("-----" + "\n");
        } else {
            sb.append("Stack is empty" + "\n");
            sb.append("capacity = " + this.capacity + "\n");
            sb.append("length = " + (top+1) + "\n\n");
            sb.append("-----" + "\n");
            sb.append("\t" + " <--top " + "[" + top + "]" + "\n");
        }
        return sb.toString();
    }
}
