package booking.bus.trains.hotel.flight.deals.travel.smarttraveller.PojoClasses;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by socket on 27/2/17.
 */

public class PojoDeal {
private String description,date,company,coupon_code;
    public PojoDeal(JSONObject jsonObject){
        try {
            description = jsonObject.getString("coupon_description");
            date = jsonObject.getString("added");
            company = jsonObject.getString("offer_name");
            coupon_code = jsonObject.getString("coupon_code");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getCompany() {
        return company;
    }

    public String getCoupon_code() {
        return coupon_code;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
