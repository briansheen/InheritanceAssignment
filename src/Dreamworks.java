/**
 * Created by bsheen on 3/29/17.
 */
public final class Dreamworks extends Animated{

    private boolean BangaloreContribution;
    private boolean inFortuneMagazine;

    public Dreamworks(String title, boolean cgi, boolean inFortuneMagazine) {
        super(title, cgi);
        this.inFortuneMagazine = inFortuneMagazine;
    }

    public boolean isBangaloreContribution() {
        return BangaloreContribution;
    }

    public void setBangaloreContribution(boolean bangaloreContribution) {
        this.BangaloreContribution = bangaloreContribution;
    }

    public boolean isInFortuneMagazine() {
        return inFortuneMagazine;
    }

    public void setInFortuneMagazine(boolean inFortuneMagazine) {
        this.inFortuneMagazine = inFortuneMagazine;
    }

    public String website() {
        return "www.dreamworksanimation.com";
    }

    @Override
    public String brief() {
        return "DreamWorks Animation SKG, Inc. (known professionally as DreamWorks Animation or simply DreamWorks) is an American animation studio that is a subsidiary of NBCUniversal, a division of Comcast.";
    }

    @Override
    public boolean is3d() {
        return true;
    }

    @Override
    public String toString() {
        return "Dreamworks{" +
                "BangaloreContritubtion=" + BangaloreContribution +
                ", inFortuneMagazine=" + inFortuneMagazine +
                '}' + super.toString();
    }
}
