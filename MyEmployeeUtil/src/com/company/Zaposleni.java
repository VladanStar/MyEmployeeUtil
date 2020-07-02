package com.company;

public class Zaposleni {

    private String ime;
    private int plata;

    public Zaposleni() {
    }

    public Zaposleni(String ime, int plata) {
        this.ime = ime;
        this.plata = plata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }
}
