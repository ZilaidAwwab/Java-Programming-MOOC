package SortingByMultipleCriteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Film {
    private String name;
    private int releaseYear;

    public Film(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return this.name;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public String toString() {
        return this.name + "(" + this.releaseYear + ")";
    }

    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));

        for(Film e: films) {
            System.out.println(e);
        }
        
        /*
         * This is permanent sort
         */
        Comparator<Film> comparator = Comparator
        .comparing(Film::getReleaseYear)
        .thenComparing(Film::getName);
        
        Collections.sort(films, comparator);

        for(Film e: films) {
            System.out.println(e);
        }
    }
}
