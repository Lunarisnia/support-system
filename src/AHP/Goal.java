package AHP;

import java.util.Map;
import java.util.HashMap;

public class Goal {
    Map<String, Float> weight;

    public Goal() {
        this.weight = new HashMap<>();
        this.weight.put("price", 0.0f);
        this.weight.put("quality", 0.0f);
        this.weight.put("service", 0.0f);
        this.weight.put("delivery_time", 0.0f);
    }

    public void setPrice(Float price) {
        this.weight.put("price", price);
    }

    public void setQuality(Float quality) {
        this.weight.put("quality", quality);
    }

    public void setService(Float service) {
        this.weight.put("service", service);
    }

    public void setDeliveryTime(Float deliveryTime) {
        this.weight.put("delivery_time", deliveryTime);
    }

    public Float getPrice() {
        return this.weight.getOrDefault("price", 0.0f);
    }

    public Float getQuality() {
        return this.weight.getOrDefault("quality", 0.0f);
    }

    public Float getService() {
        return this.weight.getOrDefault("service", 0.0f);
    }

    public Float getDeliveryTime() {
        return this.weight.getOrDefault("delivery_time", 0.0f);
    }
}
