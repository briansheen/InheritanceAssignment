/**
 * Created by bsheen on 3/29/17.
 */
public final class Pixar extends Animated {

    private String officelocation;
    private boolean predisneymerger;

    public Pixar(String title, boolean cgi, String officelocation) {
        super(title, cgi);
        this.officelocation = officelocation;
    }

    public String getOfficelocation() {
        return officelocation;
    }

    public void setOfficelocation(String officelocation) {
        this.officelocation = officelocation;
    }

    public boolean isPredisneymerger() {
        return predisneymerger;
    }

    public void setPredisneymerger(boolean predisneymerger) {
        this.predisneymerger = predisneymerger;
    }

    @Override
    public String website() {
        return "www.pixar.com";
    }

    @Override
    public String brief() {
        return "Pixar, also referred to as Pixar Animation Studios, is an American computer animation film studio that is a subsidiary of The Walt Disney Company.";
    }

    @Override
    public boolean is3d(){
        return false;
    }

    @Override
    public String toString() {
        return "Pixar{" +
                "officelocation='" + officelocation + '\'' +
                ", predisneymerger=" + predisneymerger +
                '}' + super.toString();
    }
}

