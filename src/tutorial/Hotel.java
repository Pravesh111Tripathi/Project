package tutorial;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
    private int pricePerNight;
    private int rating;
    private HotelType hotelType;

    @Override
    public String toString() {
        return "Hotel pricePerNight=" + pricePerNight + ", rating=" + rating + ", hotelType=" + hotelType;
    }

}
