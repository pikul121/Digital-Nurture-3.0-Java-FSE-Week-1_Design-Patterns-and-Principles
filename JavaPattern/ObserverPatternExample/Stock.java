package ObserverPatternExample;

// File: Stock.java
public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}

