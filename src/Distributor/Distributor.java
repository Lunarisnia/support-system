package Distributor;

import java.util.HashMap;
import java.util.Map;

public class Distributor {
    String distributorName;
    float totalScore = 0.0f;
    Map<String, Float> criteria;

    public Distributor(String distributorName) {
        this.distributorName = distributorName;
        this.criteria = new HashMap<String, Float>();
        this.criteria.put("price", 0.0f);
        this.criteria.put("quality", 0.0f);
        this.criteria.put("service", 0.0f);
        this.criteria.put("delivery_time", 0.0f);
    }

    public Distributor setPrice(Float price) {
        this.criteria.put("price", price);
        return this;
    }

    public Distributor setQuality(Float quality) {
        this.criteria.put("quality", quality);
        return this;
    }

    public Distributor setService(Float service) {
        this.criteria.put("service", service);
        return this;
    }

    public Distributor setDeliveryTime(Float deliveryTime) {
        this.criteria.put("delivery_time", deliveryTime);
        return this;
    }

    public Distributor setTotalScore(Float score) {
        this.totalScore = score;
        return this;
    }
}
