public class TrafficLightState extends State {
    private boolean red;
    private boolean yellow;
    private boolean green;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public TrafficLightState(boolean red, boolean yellow, boolean green, Shift shift, char overWrite) {
        super(shift, overWrite);
        
        this.red = red;
        this.yellow = yellow;
        this.green = green;
    }

    public void printState() {
        System.out.println("R: " + (red ? ANSI_RED + "*" + ANSI_RESET : ""));
        System.out.println("Y: " + (yellow ? ANSI_YELLOW + "*" + ANSI_RESET : ""));
        System.out.println("G: " + (green ? ANSI_GREEN + "*" + ANSI_RESET : "") + "\n");
    }
}