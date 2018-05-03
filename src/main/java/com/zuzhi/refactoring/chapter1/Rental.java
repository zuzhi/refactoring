package com.zuzhi.refactoring.chapter1;

/**
 * Rental
 *
 * @author zuzhi
 * @date 2018/5/3
 */
public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
