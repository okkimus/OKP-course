

public class Main {

    public static void main(String[] args) {
        Person pekka = new Person();

        try {
            pekka.seeThings();
        } catch (NotAllowedException e) {
            System.out.println(e.getMessage());
        }

        pekka.setSight(false);

        try {
            pekka.seeThings();
        } catch (NotAllowedException e) {
            System.out.println(e.getMessage());
        }
    }
}
