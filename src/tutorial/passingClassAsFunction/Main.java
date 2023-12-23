package tutorial.passingClassAsFunction;

import tutorial.Hotel;
import tutorial.HotelService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();

        List<Hotel> hotels = hotelService.filterHotels(new FilterHotelsLessThan2000());
        System.out.println("List of hotels price less than 2000 = " + hotels);

        List<Hotel> fiveStars = hotelService.filterHotels(new Filter5star());
        System.out.println(fiveStars);

        /**
         * Passing function in java
         *
         * 1. create an interface
         * 2. make a class that implement the interface
         * 3.implement the method of the interface, where the method body = function body which you wanted to pass as parameter
         * pass an object of the concrete implementation of the interface
         *
         */

    }
}
