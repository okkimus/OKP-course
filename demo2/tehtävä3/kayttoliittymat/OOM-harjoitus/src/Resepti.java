import java.util.ArrayList;
import java.util.HashMap;

public class Resepti {
    private ArrayList<Ainesosa> ainesosat;
    private HashMap<Ainesosa, Double> määrät;
    private String nimi;
    private int annosKoko;


    //-- Konstruktorit
    /** @.pre nimi != null & annosKoko != null & määrät != null
     * @.post getMäärät().equals(määrät) & getnimi().equals(nimi) & getAnnoskoko().equals(annoskoko)
     */
    public Resepti(String nimi,int annosKoko, HashMap<Ainesosa, Double> määrät) {
        this.määrät = määrät;
        this.nimi = nimi;
        this.annosKoko = annosKoko;
        this.ainesosat = new ArrayList<Ainesosa>(määrät.keySet());
    }

    //-- Havainnointi
    /**
     * Tulostaa reseptiin tarvittavien ainesosien määrät tietylle annosmäärälle
     * @.pre annokset > 0
     * @.post true
     */
    public void tulostaResepti(int annokset) {
        System.out.println("Reseptiin tarvitset:");
        double kerroin = annokset / this.annosKoko;
        String ainesosa;
        double määrä;

        for (Ainesosa a : ainesosat) {
            ainesosa = a.getNimi();
            määrä = määrät.get(a);
            System.out.println(ainesosa + " - " + (kerroin * määrä) + " kerroin: " + kerroin + " annoskoko: " + annosKoko);
        }
    }

    /**
     * Palauttaa true jos resepti sisältää kysellyn ainesosan
     * @.pre ainesosa != null
     * @.post RESULT == (aines osa on reseptissä)
     */
    public boolean sisältääAinesosan(String ainesosa) {
        for (Ainesosa a : ainesosat) {
            if (a.getNimi() == ainesosa) {
                return true;
            }
        }
        return false;
    }

    public HashMap<Ainesosa, Double> getMäärät() {
        return määrät;
    }

    public String getNimi() {
        return nimi;
    }

    public int getAnnosKoko() {
        return annosKoko;
    }

    public ArrayList<Ainesosa> getAinesosat() {
        return ainesosat;
    }

    //-- Asetus
    /**
     * Lisää ainesosan reseptiin
     * @.pre ainesosa != null & määrä != null
     * @.post sisältääAinesosan(ainesosa.toString()) == true
     */
    public boolean lisääAinesosa(Ainesosa ainesosa, double määrä) {
        try {
            this.ainesosat.add(ainesosa);
            this.määrät.put(ainesosa, määrä);
            return true;
        } catch (Error e) {
            System.err.println(e);
            return false;
        }
    }

    /**
     * Poistaa ainesosan reseptistä
     * @.pre sisältääAinesosan(ainesosa) == true
     * @.post sisältääAinesosan(ainesosa) == false
     */
    public boolean poistaAinesosa(String ainesosa) {
        Ainesosa poistettava;
        for (int i = 0; i < ainesosat.size(); i++) {
            if (ainesosat.get(i).getNimi() == ainesosa) {
                poistettava = ainesosat.get(i);
                määrät.remove(poistettava);
                ainesosat.remove(i);
            }
        }
        return true;
    }

    public void setMäärät(HashMap<Ainesosa, Double> määrät) {
        this.määrät = määrät;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setAnnosKoko(int annosKoko) {
        this.annosKoko = annosKoko;
    }
}