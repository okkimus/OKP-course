public class Tape {
    private char[] data;
    private int index;

    public Tape(char[] data, int start) {
        this.data = data;
        this.index = start;
    }

    public char readData() {
        return data[index];
    }

    public void writeData(char c) {
        data[index] = c;
    }

    public void incrementIndex() {
        index++;
    }

    public void decrementIndex() {
        index--;
    }
}