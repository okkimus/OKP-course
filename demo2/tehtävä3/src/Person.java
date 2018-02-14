/**
 * Created by okkimus on 14.2.2018.
 */
public class Person implements Eyesight {
    boolean hasSight = true;

    public void seeThings() throws NotAllowedException {
        if (!hasSight) {
            throw new NotAllowedException("Person has no eye sight");
        }
        System.out.println("WOW I SEE THINGS NOW");
    }

    public void setSight(boolean b) {
        hasSight = b;
    }

}
