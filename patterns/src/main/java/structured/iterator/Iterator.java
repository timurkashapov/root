package structured.iterator;

public interface Iterator<E> {

    E first();
    E next();
    Boolean isDone();
    E currentItem();
}
