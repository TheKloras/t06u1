package com.paveldejimas.isvestine;

import com.paveldejimas.bazine.ZmogusImpl;

public class StatybininkasImpl extends ZmogusImpl implements Statybininkas{
    private double stazas;
    private String issilavinimas;
    private String specializacija;
    private double atlyginimas;

    public StatybininkasImpl(
            //Kuriant vaiko konstruktorių pirmiausiai perduodame tėvo parametrus
            Boolean lytis, String ak, String vardas, String pavarde, int amzius, double svoris, double ugis, String plaukuSpalva,
            //o paskuj perduodame vaiko parametrus
            double stazas, String issilavinimas, String specializacija, double atlyginimas){
        super(lytis,ak,vardas,pavarde,amzius,svoris,ugis,plaukuSpalva);
        this.stazas = stazas;
        this.issilavinimas = issilavinimas;
        this.specializacija = specializacija;
        this.atlyginimas = atlyginimas;
    }

    @Override
    public double getStazas() {
        return this.stazas;
    }

    @Override
    public void setStazas(int stazas) {
        this.stazas = stazas;
    }

    @Override
    public String getIssilavinimas() {
        return this.issilavinimas;
    }

    @Override
    public void setIssilavinimas(String issilavinimas) {
        this.issilavinimas = issilavinimas;
    }

    @Override
    public String getSpecializacija() {
        return this.specializacija;
    }

    @Override
    public void setSpecializacija(String specializacija) {
        this.specializacija = specializacija;
    }

    @Override
    public double getAtlyginimas() {
        return this.atlyginimas;
    }

    @Override
    public void setAtlyginimas(double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    @Override
    public String toString() {
        return "StatybininkasImpl{" +
                "stazas=" + stazas +
                ", issilavinimas='" + issilavinimas + '\'' +
                ", specializacija='" + specializacija + '\'' +
                ", atlyginimas=" + atlyginimas +
                '}';
    }
}
