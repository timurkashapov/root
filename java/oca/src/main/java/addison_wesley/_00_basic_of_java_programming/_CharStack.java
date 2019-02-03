package addison_wesley._00_basic_of_java_programming;

/**
 * Модель стека, работающего с символами.
 *
 *        capacity = N
 *
 *        +---------+
 *        |   ...   | [N]
 *        +---------+
 *        |         | [3]
 *        +---------+
 *        |         | [2]
 *        +---------+
 *        |         | [1]
 *        +---------+
 *        |         | [0]
 *        +---------+
 *            top     -1
 *        -----------
 *
 *
 *
 *  --> push        pop -->
 *
 *        +---------+
 *        |   ...   | [N]
 *        +---------+
 *        |   top   | [3]
 *        +---------+
 *        |  item2  | [2]
 *        +---------+
 *        |  item1  | [1]
 *        +---------+
 *        |  item0  | [0]
 *        +---------+
 */
public class _CharStack {

    private int top;
    private char[] characters;
    private int length;

    private _CharStack(int capacity) {
        characters = new char[capacity];
        top = -1;
        length = characters.length-1;
    }

    public void push(char c) {
        characters[++top] = c;
    }
    public char pop(char c) {
        // элемент возвращается, но не удаляется же ...
        return characters[top--];
    }
    public char peek() { return characters[top]; }
    public boolean isEmpty() { return top == -1; }
    public boolean isFull() { return top == length; }
}
