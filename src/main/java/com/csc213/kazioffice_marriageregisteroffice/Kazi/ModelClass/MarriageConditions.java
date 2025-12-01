package com.csc213.kazioffice_marriageregisteroffice.Kazi.ModelClass;

public class MarriageConditions {
    private float dowryAmount;
    private String specialRequest;
    private String healthCondition;

    public MarriageConditions(float dowryAmount, String specialRequest, String healthCondition) {
        this.dowryAmount = dowryAmount;
        this.specialRequest = specialRequest;
        this.healthCondition = healthCondition;
    }

    public float getDowryAmount() {
        return dowryAmount;
    }

    public void setDowryAmount(float dowryAmount) {
        this.dowryAmount = dowryAmount;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    @Override
    public String toString() {
        return "MarriageConditions{" +
                "dowryAmount=" + dowryAmount +
                ", specialRequest='" + specialRequest + '\'' +
                ", healthCondition='" + healthCondition + '\'' +
                '}';
    }
}
