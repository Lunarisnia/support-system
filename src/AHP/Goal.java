package AHP;

import java.util.Map;
import java.util.HashMap;

public class Goal {
    Map<String, Float> criteria;

    public Goal() {
        this.criteria = new HashMap<String, Float>();
        this.criteria.put("price", 0.0f);
        this.criteria.put("quality", 0.0f);
        this.criteria.put("service", 0.0f);
        this.criteria.put("delivery_time", 0.0f);
    }

    public Goal setPrice(Float price) {
        this.criteria.put("price", price);
        return this;
    }

    public Goal setQuality(Float quality) {
        this.criteria.put("quality", quality);
        return this;
    }

    public Goal setService(Float service) {
        this.criteria.put("service", service);
        return this;
    }

    public Goal setDeliveryTime(Float deliveryTime) {
        this.criteria.put("delivery_time", deliveryTime);
        return this;
    }

    public Float getPrice() {
        return this.criteria.getOrDefault("price", 0.0f);
    }

    public Float getQuality() {
        return this.criteria.getOrDefault("quality", 0.0f);
    }

    public Float getService() {
        return this.criteria.getOrDefault("service", 0.0f);
    }

    public Float getDeliveryTime() {
        return this.criteria.getOrDefault("delivery_time", 0.0f);
    }
}
