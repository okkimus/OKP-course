public class State {
    private Shift shift;
    private char overWrite;

    public State(Shift shift, char overWrite) {
        this.shift = shift;
        this.overWrite = overWrite;
    }

    public State getState() {
        return this;
    }

    public char getOverWrite() {
        return overWrite;
    }

    public Shift getShift() {
        return shift;
    }

    public void printState() {
        System.out.println("Default state");
    }
}