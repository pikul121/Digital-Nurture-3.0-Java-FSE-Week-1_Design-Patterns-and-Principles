package ObserverPatternExample;

// File: WebApp.java
public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(name + " received stock price update: " + stockPrice);
    }
}
