package behavior.observer;

import com.shako.root.logger.ExceptionConsoleLoggerImpl;
import com.shako.root.logger.Logger;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private Logger logger = new ExceptionConsoleLoggerImpl();

    private List<Observer> observers;
    private State state;

    ConcreteSubject() {
        observers = new ArrayList<>();
    }
    ConcreteSubject(Integer amountOfObservers) {
        observers = new ArrayList<>(amountOfObservers);
    }

    @Override
    public void attachObserver(Observer observer) {

        try {
            observers.add(observer);
        } catch (Exception e) {
            logger.log(e);
        }
    }

    @Override
    public void detachObserverByName(String name) {

    }

    @Override
    public void getObserverByName(String name) {

    }

    @Override
    public void setObserver(Observer observer) {

    }

    public List<Observer> getObservers() {
        return observers;
    }
    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
}

enum State {
    OK(),
    FAIL(),
    BUSY(),
    FREE(),
    PROCESSING(),
    WAITING()


}
