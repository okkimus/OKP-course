import java.util.Set;

public class TuringMachine {
    private State cur;
    private Tape tape;
    private Set<Transition> transitions;

    public TuringMachine(State cur, Tape tape, Set<Transition> transitions) {
        this.cur = cur;
        this.tape = tape;
        this.transitions = transitions;
    }

    public void run() {
        cur.printState();

        char input = tape.readData();
        Transition transition = findTransition(cur, input);
        cur = transition.getNextState();
        tape.writeData(cur.getOverWrite());
        Shift s = cur.getShift();
        shiftTape(s);
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        run();
    }

    private void shiftTape(Shift s) {
        switch(s) {
            case L:
                //System.out.println("Shifting left");
                tape.decrementIndex();
                break;
            case R:
                //System.out.println("Shifting right");
                    tape.incrementIndex();
                    break;
            case H:
                //System.out.print("Halting");
                break;
            case Y:
                //System.out.println("Yes");
                break;
            case N:
                //System.out.println("No");
        }
    }

    private Transition findTransition(State state, char input) {
        for (Transition t : transitions) {
            if (t.isTransition(state, input))
                return t;
        }
        return new Transition();
    }
}