package com.pluralsight.finance;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;

    ArrayList<Valuable> assets = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }
    public void add(Valuable assets){
        this.assets.add(assets);
    }
    public double getValue(){
        double totalValue = 0;

        for(Valuable assets: assets){
            totalValue += assets.getValue();
        }
        return totalValue;
    }
    public Valuable getMostValuable()
    {
        Valuable mostValuable = null;

        for (Valuable asset : assets)
        {
            if (mostValuable == null || asset.getValue() > mostValuable.getValue())
            {
                mostValuable = asset;
            }
        }

        return mostValuable;

    }

    public Valuable getLeastValuable()
    {
        Valuable leastValuable = null;

        for (Valuable asset : assets)
        {
            if (leastValuable == null || asset.getValue() < leastValuable.getValue()) {
                leastValuable = asset;
            }
        }

        return leastValuable;
    }
}

