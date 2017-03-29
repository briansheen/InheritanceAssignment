
/**
 * Created by bsheen on 3/29/17.
 */
public final class Ghibli extends Animated  {

private boolean in1980s;
private boolean preDisneyDistribution;

    public Ghibli(String title, boolean cgi, boolean in1980s) {
        super(title, cgi);
        this.in1980s = in1980s;
    }

    public boolean isIn1980s() {
        return in1980s;
    }

    public void setIn1980s(boolean in1980s) {
        this.in1980s = in1980s;
    }

    public boolean isPreDisneyDistribution() {
        return preDisneyDistribution;
    }

    public void setPreDisneyDistribution(boolean preDisneyDistribution) {
        this.preDisneyDistribution = preDisneyDistribution;
    }

    @Override
    public String brief() {
        return "PStudio Ghibli, Inc. (Japanese: 株式会社スタジオジブリ) is a Japanese animation film studio based in Koganei, Tokyo, Japan.";
    }

    public String website() {
        return "www.ghibli.jp";
    }

    @Override
    public boolean is3d() {
        return false;
    }

    @Override
    public String toString() {
        return "Ghibli{" +
                "in1980s=" + in1980s +
                ", preDisneyDistribution=" + preDisneyDistribution +
                '}' + super.toString();
    }
}
