package Obj;

public class Currency {
    double jpn = 4.5644;
    double usd = 0.0335;
    double cad = 0.0433;
    private int amount;
    public Currency(int amount){
        this.amount = amount;
    }

    public double getJpn(){
        return  this.amount * jpn;
    }

    public double getUsd(){
        return  this.amount * usd;
    }

    public double getCad(){
        return  this.amount * cad;
    }

}
