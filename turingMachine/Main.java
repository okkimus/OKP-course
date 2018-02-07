import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        TrafficLightState sR = new TrafficLightState(true, false, false, Shift.R, 'x');
        TrafficLightState sRY = new TrafficLightState(true, true, false, Shift.R, 'x');
        TrafficLightState sG = new TrafficLightState(false, false, true, Shift.L, 'x');
        TrafficLightState sY = new TrafficLightState(false, true, false, Shift.L, 'x');

        HashSet<Transition> transitions = new HashSet<>();

        transitions.add(new Transition(sR, 'x', sRY));
        transitions.add(new Transition(sRY, 'x', sG));
        transitions.add(new Transition(sG, 'x', sY));
        transitions.add(new Transition(sY, 'x', sR));


        char[] tapeData = {'x', 'x', 'x', 'x', 'x', 'x'};

        Tape tape = new Tape(tapeData, 2);

        TuringMachine turing = new TuringMachine(sR, tape, transitions);

        turing.run();
    }
}