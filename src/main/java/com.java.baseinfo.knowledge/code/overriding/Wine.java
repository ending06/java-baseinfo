package com.java.baseinfo.knowledge.code.overriding;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/16<p>
// -------------------------------------------------------

class Wine {
    public String name() {
        return "Wine";
    }

    /**
     * Wine;SparkingWine;Champagne;
     * */
    public static void main(String[] args) {
        Wine[] wines = { new Wine(), new SparkingWine(), new ChampagneWine() };
        for (Wine wine : wines) {
            System.out.printf(wine.name() + ";");
        }
    }
}

class SparkingWine extends Wine {
    @Override
    public String name() {
        return "SparkingWine";
    }
}

class ChampagneWine extends SparkingWine {
    @Override
    public String name() {
        return "Champagne";
    }
}