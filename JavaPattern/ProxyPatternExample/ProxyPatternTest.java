package ProxyPatternExample;

// File: ProxyPatternTest.java
public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded from remote server and displayed
        image1.display();

        // Image will not be loaded from remote server but directly displayed
        image1.display();

        // Image will be loaded from remote server and displayed
        image2.display();

        // Image will not be loaded from remote server but directly displayed
        image2.display();
    }
}
