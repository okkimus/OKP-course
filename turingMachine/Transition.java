public class Transition {
    private State curState;
    private char input;
    private State nextState;

    public Transition() {
        throw new RuntimeException("No transition...");
    }

    public Transition(State curState, char input, State nextState) {
        this.curState = curState;
        this.input = input;
        this.nextState = nextState;
    }

    public State getCurState() {
        return curState;
    }

    public char getInput() {
        return input;
    }

    public State getNextState() {
        return nextState;
    }

    public boolean isTransition(State state, char data) {
        return curState == state && input == data;
    }
}