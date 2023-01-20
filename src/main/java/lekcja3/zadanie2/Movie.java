package lekcja3.zadanie2;

public class Movie {
    private final String title;
    private final String directorName;
    private final String directorSurname;
    private final int durationInMinutes;
    private final int yearOfProduction;

    public Movie(String title, String directorName, String directorSurname, int durationInMinutes, int yearOfProduction) {
        this.title = title;
        this.directorName = directorName;
        this.directorSurname = directorSurname;
        this.durationInMinutes = durationInMinutes;
        this.yearOfProduction = yearOfProduction;
    }
}
