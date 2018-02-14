public class Ainesosa {
    private String nimi;
    private String tyyppi;

    //-- Konstruktorit
    /** @.pre nimi != null tyyppi != null
     * @.post getNimi().equals(nimi) & getTyyppi().equals(tyyppi)
     */
    public Ainesosa(String nimi, String tyyppi) {
        this.nimi = nimi;
        this.tyyppi = tyyppi;
    }
    //-- Havainnointi
    /** @.pre true
     *  @.post result == nimi
     */
    public String getNimi() {
        return nimi;
    }

    /** @.pre true
     *  @.post result == tyyppi
     */
    public String getTyyppi() {
        return tyyppi;
    }

    //-- Asetus
    /** @.pre nimi != null
     *  @.post getNimi().equals(nimi)
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /** @.pre tyyppi!= null
     *  @.post getTyyppi().equals(tyypi)
     */
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }
}