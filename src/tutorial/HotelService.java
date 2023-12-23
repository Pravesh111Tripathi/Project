package tutorial;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> hotels = new ArrayList<>();

    public HotelService() {
        hotels.add(new Hotel(2000, 2, HotelType.THREE_STAR));
        hotels.add(new Hotel(1000, 1, HotelType.THREE_STAR));
        hotels.add(new Hotel(4000, 3, HotelType.FOUR_STAR));
        hotels.add(new Hotel(6000, 5, HotelType.FIVE_STAR_STAR));
        hotels.add(new Hotel(4000, 4, HotelType.FOUR_STAR));
    }

    /*
        private boolean isHotelLessThan(int price, Hotel hotel) {
            return hotel.getPricePerNight() <= price;
        }
        public List<Hotel> filterHotelsLessThan(int price) {
            List<Hotel> filteredHotels = new ArrayList<>();
            for (Hotel hotel: hotels){
                if (isHotelLessThan(price, hotel)){
                    filteredHotels.add(hotel);
                }
            }

            return filteredHotels;
        }

        private boolean isHotel5Star(Hotel hotel) {
            return hotel.getHotelType()==HotelType.FIVE_STAR;
        }
        public List<Hotel> filterHotelsBy5Star() {
            List<Hotel> filteredHotels = new ArrayList<>();
            for (Hotel hotel: hotels){
                if (isHotel5Star(hotel)){
                    filteredHotels.add(hotel);
                }
            }

            return filteredHotels;
        }
    */
    public List<Hotel> filterHotels(FilteringConditions filteringConditions) {
        List<Hotel> filterHotels = new ArrayList<>();

        for (Hotel hotel : hotels) {
            if (filteringConditions.test(hotel)) {
                filterHotels.add(hotel);
            }
        }
        return filterHotels;
    }
}
