import java.time.LocalDate;

/**
 * Created by bsheen on 3/29/17.
 */
public abstract class Animated extends Movie{
    private boolean anime;
    private boolean cgi;

    public Animated(String title, boolean cgi) {
        super(title);
        this.cgi = cgi;
    }

    public boolean isAnime() {
        return anime;
    }

    public void setAnime(boolean anime) {
        this.anime = anime;
    }

    public boolean isCgi() {
        return cgi;
    }

    public void setCgi(boolean cgi) {
        this.cgi = cgi;
    }

    @Override
    public String toString() {
        return "Animated{" +
                "anime=" + anime +
                ", cgi=" + cgi +
                '}' + super.toString();
    }
}
