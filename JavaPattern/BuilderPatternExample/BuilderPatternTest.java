package BuilderPatternExample;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a Computer with default settings
        Computer computer1 = new Computer.Builder("Intel i5", "8GB")
                .build();
        System.out.println(computer1);

        // Create a Computer with custom settings
        Computer computer2 = new Computer.Builder("AMD Ryzen 7", "16GB")
                .storage("1TB HDD")
                .graphicsCard(true)
                .wifi(true)
                .build();
        System.out.println(computer2);

        // Create a Computer with some other custom settings
        Computer computer3 = new Computer.Builder("Intel i7", "32GB")
                .storage("512GB SSD")
                .build();
        System.out.println(computer3);
    }
}
