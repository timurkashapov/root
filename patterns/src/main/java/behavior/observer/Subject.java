package behavior.observer;

public interface Subject {

    void attachObserver(Observer observer);
    void detachObserverByName(String name);
    void getObserverByName(String name);
    void setObserver(Observer observer);
}
