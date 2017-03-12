package booking.bus.trains.hotel.flight.deals.travel.smarttraveller.PojoClasses;

import org.json.JSONArray;

/**
 * Created by socket on 27/2/17.
 */

public class Deal {
    public String DESCRIPTION = "description";
    public String COUPON_CODE = "coupon_code";
    public String COMPANY_NAME = "company_name";
    public String LINK = "link";
    public String DATE= "date";

    public Deal(String description, String coupon_code, String company_name, String link, String date) {
        this.DESCRIPTION = description;
        this.COUPON_CODE = coupon_code;
        this.COMPANY_NAME = company_name;
        this.LINK = link;
        this.DATE = date;
    }

    public String getCOMPANY_NAME() {
        return COMPANY_NAME;
    }

    public String getCOUPON_CODE() {
        return COUPON_CODE;
    }

    public String getDATE() {
        return DATE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public String getLINK() {
        return LINK;
    }
}
