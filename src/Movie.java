import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by bsheen on 3/29/17.
 */
public abstract class Movie {
    private String title;
    private String rated;
    private int rtscore;
    private LocalDate release;

    public Movie(String title) {
        this.title = title;
    }

    public int getRtscore() {
        return rtscore;
    }

    public void setRtscore(int rtscore) {
        this.rtscore = rtscore;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }


    public abstract String website();

    public abstract String brief();

    public boolean is3d() {
        return false;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rated='" + rated + '\'' +
                ", rtscore='" + rtscore + "%" + '\'' +
                ", release=" + release +
                '}';
    }
}
