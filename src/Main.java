import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Pixar pixar = new Pixar("Toy Story",true,"Emeryville, California");
        pixar.setPredisneymerger(true);
        pixar.setRelease(LocalDate.parse("1995-11-22"));
        pixar.setRated("G");
        pixar.setRtscore(100);
        System.out.println(pixar);
        System.out.println("website: " + pixar.website());
        System.out.println(pixar.brief());
        System.out.println("is this movie 3d?: " + pixar.is3d());

        Ghibli ghibli = new Ghibli("Grave of the Fireflies",false,true);
        ghibli.setPreDisneyDistribution(true);
        ghibli.setAnime(true);
        ghibli.setRelease(LocalDate.parse("1986-08-02"));
        ghibli.setRated("NR");
        ghibli.setRtscore(97);
        System.out.println(ghibli);
        System.out.println("website: " + ghibli.website());
        System.out.println(ghibli.brief());
        System.out.println("is this movie 3d?: " + ghibli.is3d());

        Dreamworks dreamworks = new Dreamworks("Puss in Boots",true,true);
        dreamworks.setBangaloreContribution(true);
        dreamworks.setRelease(LocalDate.parse("2011-10-28"));
        dreamworks.setRated("PG");
        dreamworks.setRtscore(84);
        System.out.println(dreamworks);
        System.out.println("website: " + dreamworks.website());
        System.out.println(dreamworks.brief());
        System.out.println("is this movie 3d?: " + dreamworks.is3d());

    }


}
