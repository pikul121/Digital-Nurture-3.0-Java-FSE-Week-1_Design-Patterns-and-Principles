public class Logger {
    // Step 1: Create a private static instance of Logger
    private static Logger instance;

    // Step 2: Ensure the constructor is private
    private Logger() {
        // Private constructor to prevent instantiation
    }

    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            // Create the instance if it doesn't exist
            instance = new Logger();
        }
        return instance;
    }

    // Example method to demonstrate logging
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
