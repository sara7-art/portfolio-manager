package com.pluralsight.finance;

public class Metal extends FixedAsset {
    private double weight;

    public Metal(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue(){
        return super.getValue();
    }
}
