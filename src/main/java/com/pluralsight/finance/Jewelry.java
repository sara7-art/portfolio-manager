package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(String name, double marketValue) {
        super(name, marketValue);
    }

    @Override
    public void getValue(){
        return karat;
    }
}
