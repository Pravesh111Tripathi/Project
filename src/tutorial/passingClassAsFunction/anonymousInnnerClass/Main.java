package tutorial.passingClassAsFunction.anonymousInnnerClass;

import tutorial.FilteringConditions;
import tutorial.Hotel;
import tutorial.HotelService;
import tutorial.HotelType;
import tutorial.passingClassAsFunction.Filter5star;
import tutorial.passingClassAsFunction.FilterHotelsLessThan2000;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();

        List<Hotel> hotels = hotelService.filterHotels(new FilteringConditions() {
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getPricePerNight() <= 2000;
            }
        });
        System.out.println("List of hotels price less than 2000 = " + hotels);

        List<Hotel> fiveStars = hotelService.filterHotels(new FilteringConditions() {
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getHotelType() == HotelType.FIVE_STAR;
            }
        });
        System.out.println(fiveStars);


    }
}
