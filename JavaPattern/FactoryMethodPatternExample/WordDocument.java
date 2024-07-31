package FactoryMethodPatternExample; 
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document.");
    }

    @Override
    public void save() {
        System.out.println("Saving Word Document.");
    }

    @Override
    public void close() {
        System.out.println("Closing Word Document.");
    }
}
