package com.java;

import javax.naming.Name;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * All Java Classes that have natural ordering implements Comprable<T> Interface example String, Wrapper Classes, Big Integer
 * Comparator interface : Compares values of two objects. This is implemented as part of the Comparator<T> interface
 */
public class ComparatorVsComparable {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(8.2, "Batman", 1999));
        movies.add(new Movie(8.7, "Star Wars", 1977));
        movies.add(new Movie(8.8, "Return of Jedi", 1980));
        movies.add(new Movie(8.4, "Empire Strike Back", 1983));

        Collections.sort(movies);
        System.out.println("Movies after sorting");
        for (Movie m : movies) {
            System.out.println(m);
        }

        NameCompare nc =  new NameCompare();
        Collections.sort(movies,nc);
        System.out.println("Sorted by name");
        for(Movie m:movies){
            System.out.println(m);
        }

        RatingCompare rc = new RatingCompare();
        Collections.sort(movies,rc);
        System.out.println("Sorted by rating");
        for(Movie m:movies){
            System.out.println(m);
        }

    }
}

class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    public String toString() {
        return this.name + "-" + this.rating + "-" + this.year;
    }
}

class RatingCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2){
        if(m1.getRating()>m2.getRating()) return 1;
        if(m1.getRating()<m2.getRating()) return -1;
        else return 0;
    }
}

class NameCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2){
        return m1.getName().compareTo(m2.getName());
    }
}


