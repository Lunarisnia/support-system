package AHP;

import java.util.HashMap;
import java.util.Map;

public class Subject {
    String subjectName;
    float totalScore = 0.0f;
    Map<String, Float> criteria;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
        this.criteria = new HashMap<String, Float>();
        this.criteria.put("price", 0.0f);
        this.criteria.put("quality", 0.0f);
        this.criteria.put("service", 0.0f);
        this.criteria.put("delivery_time", 0.0f);
    }

    public Subject setPrice(Float price) {
        this.criteria.put("price", price);
        return this;
    }

    public Subject setQuality(Float quality) {
        this.criteria.put("quality", quality);
        return this;
    }

    public Subject setService(Float service) {
        this.criteria.put("service", service);
        return this;
    }

    public Subject setDeliveryTime(Float deliveryTime) {
        this.criteria.put("delivery_time", deliveryTime);
        return this;
    }

    public Subject setTotalScore(Float score) {
        this.totalScore = score;
        return this;
    }

    public Float getPrice() {
        return this.criteria.get("price");
    }

    public Float getQuality() {
        return this.criteria.get("quality");
    }

    public Float getService() {
        return this.criteria.get("service");
    }

    public Float getDeliveryTime() {
        return this.criteria.get("delivery_time");
    }

    public Float getTotalScore() {
        return this.totalScore;
    }

    public String getSubjectName() {
        return this.subjectName;
    }
}
