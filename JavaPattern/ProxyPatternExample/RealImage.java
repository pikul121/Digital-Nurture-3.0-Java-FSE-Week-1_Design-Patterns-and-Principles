package ProxyPatternExample;

// File: RealImage.java
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromRemoteServer(fileName);
    }

    private void loadFromRemoteServer(String fileName) {
        System.out.println("Loading " + fileName + " from remote server...");
        // Simulate loading time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
