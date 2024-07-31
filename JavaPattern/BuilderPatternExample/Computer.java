package BuilderPatternExample;

public class Computer {
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final boolean graphicsCard;
    private final boolean wifi;

    // Private constructor to be used by the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifi = builder.wifi;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + 
               ", GraphicsCard=" + graphicsCard + ", WiFi=" + wifi + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private final String CPU;
        private final String RAM;
        private String storage = "256GB SSD"; // Default value
        private boolean graphicsCard = false; // Default value
        private boolean wifi = false; // Default value

        // Required parameters
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Optional parameters
        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder wifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        // Build method to create Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}
