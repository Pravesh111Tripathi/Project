package tutorial.passingClassAsFunction;

import tutorial.FilteringConditions;
import tutorial.Hotel;

public class FilterHotelsLessThan2000 implements FilteringConditions {

    @Override
    public boolean test(Hotel hotel) {
        return hotel.getPricePerNight() <= 2000;
    }
}
