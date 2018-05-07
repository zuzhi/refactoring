package com.zuzhi.refactoring.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * Customer
 *
 * @author zuzhi
 * @date 2018/5/3
 */
public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        String result = "Rental record for " + getName() + "\n";
        for (Rental each : rentals) {
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        }

        // add footer lines
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<h1>Rental record for <em>" + getName() + "</em></h1>";
        for (Rental each :
                rentals) {
            // show figures for this rental
            result += "<p>" + each.getMovie().getTitle() + ": " + each.getCharge() + "</p>";
        }

        // add footer lines
        result += "<p>Amount owed is <em>" + getTotalCharge() + "</em></p>";
        result += "<p>You earned <em>" + getTotalFrequentRenterPoints() + "</em> frequent renter points</p>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental each : rentals) {
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        for (Rental each : rentals) {
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

}
