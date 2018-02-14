import java.util.HashMap;

/**
 * Created by okkimus on 26.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Ainesosa tomaatti = new Ainesosa("Tomaatti", "kpl");
        Ainesosa peruna = new Ainesosa("Peruna", "paino");
        Ainesosa kerma = new Ainesosa("Kerma", "tilavuus");
        Ainesosa salaatti = new Ainesosa("Salaatti", "paino");
        Ainesosa kana = new Ainesosa("Kana", "paino");
        Ainesosa suola = new Ainesosa("Suola", "paino");

        HashMap<Ainesosa, Double> määrät = new HashMap<Ainesosa, Double>();
        määrät.put(tomaatti, 2.0);
        määrät.put(peruna, 500.0);
        määrät.put(kerma, 0.2);
        määrät.put(salaatti, 300.0);
        määrät.put(kana, 400.0);
        määrät.put(suola, 1.0);

        Resepti resepti = new Resepti("Soppa", 4, määrät);

        resepti.tulostaResepti(1);
        System.out.println("Ja poiston jälkeen:\n");
        resepti.poistaAinesosa("Salaatti");
        resepti.tulostaResepti(1);
        System.out.println("Onko reseptissä tommaattia: " + resepti.sisältääAinesosan("Tomaatti"));
        System.out.println("Onko reseptissä lohta: " + resepti.sisältääAinesosan("Lohi"));
    }
}
