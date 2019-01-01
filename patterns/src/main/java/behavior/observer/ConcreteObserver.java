package behavior.observer;

public class ConcreteObserver implements Observer {

    private Subject subject;
    private State state;

    ConcreteObserver() {}

    @Override
    public void update() {
        state = subject.getState();
    }
}
