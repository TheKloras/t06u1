package com.paveldejimas.bazine;

public class ZmogusImpl implements Zmogus {

    private Boolean lytis;
    private String ak;
    private String vardas;
    private String pavarde;
    private int amzius;
    private double svoris;
    private double ugis;
    private String plaukuSpalva;

    public ZmogusImpl(Boolean lytis, String ak, String vardas, String pavarde, int amzius, double svoris, double ugis, String plaukuSpalva){
        this.lytis = lytis;
        this.ak = ak;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.svoris = svoris;
        this.ugis = ugis;
        this.plaukuSpalva = plaukuSpalva;
    }

    @Override
    public boolean isVyras() {
        return isVyras();
    }

    @Override
    public void setLytis(boolean lytis) {
        this.lytis = lytis;
    }

    @Override
    public String getAsmensKodas() {
        return this.ak;
    }

    @Override
    public String getVardas() {
        return this.vardas;
    }

    @Override
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public String getPavarde() {
        return pavarde;
    }

    @Override
    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    @Override
    public int getAmzius() {return this.amzius;}

    @Override
    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    @Override
    public double getSvoris() {
        return this.svoris;
    }

    @Override
    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }

    @Override
    public double getUgis() {
        return this.ugis;
    }

    @Override
    public void setUgis(double ugis) {
        this.ugis = ugis;
    }

    @Override
    public String getPlaukuSpalva() {
        return this.plaukuSpalva;
    }

    @Override
    public void setPlaukuSpalva(String plaukuSpalva) {
        this.plaukuSpalva = plaukuSpalva;
    }
    @Override
    public String toString(){
        System.out.println(this.lytis+" "+this.ak+" "+this.vardas+" "+this.pavarde+" "+this.amzius+" ");

        return null;
    }
}
