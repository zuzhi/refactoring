package com.zuzhi.refactoring.chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * TestCustomer
 *
 * @author zuzhi
 * @date 2018/5/3
 */
public class TestCustomer {

    @Test
    public void testJunit() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine", str);
    }

    @Test
    public void testStatement() {
        Customer chris = new Customer("Chris");

        Movie interstellar = new Movie("Interstellar", Movie.REGULAR);
        Movie avengers = new Movie("Avengers", Movie.NEW_RELEASE);

        Rental rentInterstellar = new Rental(interstellar, 3);
        Rental rentAvengers = new Rental(avengers, 5);

        chris.addRental(rentInterstellar);
        chris.addRental(rentAvengers);

        assertEquals("Rental record for Chris\n" +
                        "\tInterstellar\t3.5\n" +
                        "\tAvengers\t15.0\n" +
                        "Amount owed is 18.5\n" +
                        "You earned 3 frequent renter points",
                chris.statement());
    }

    @Test
    public void testHtmlStatement() {
        Customer chris = new Customer("Chris");

        Movie interstellar = new Movie("Interstellar", Movie.REGULAR);
        Movie avengers = new Movie("Avengers", Movie.NEW_RELEASE);

        Rental rentInterstellar = new Rental(interstellar, 3);
        Rental rentAvengers = new Rental(avengers, 5);

        chris.addRental(rentInterstellar);
        chris.addRental(rentAvengers);

        assertEquals("<h1>Rental record for <em>Chris</em></h1>" +
                        "<p>Interstellar: 3.5</p>" +
                        "<p>Avengers: 15.0</p>" +
                        "<p>Amount owed is <em>18.5</em></p>" +
                        "<p>You earned <em>3</em> frequent renter points</p>",
                chris.htmlStatement());
    }
}
