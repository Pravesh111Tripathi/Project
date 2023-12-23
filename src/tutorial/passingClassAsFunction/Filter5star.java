package tutorial.passingClassAsFunction;

import tutorial.FilteringConditions;
import tutorial.Hotel;
import tutorial.HotelType;

public class Filter5star implements FilteringConditions {
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getHotelType() == HotelType.FIVE_STAR_STAR;
    }
}
