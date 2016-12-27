package com.example.sandro.notenrechneriwoth;

/**
 * Created by Sandro on 27.12.2016.
 */

public class Module {

    private String name;
    private int credit;
    private double grade;
    private double gewichtung;
    private double berechnet;

    public Module(String name, int credit, double gewichtung) {
        this.name = name;
        this.credit = credit;
        this.gewichtung = gewichtung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGewichtung() {
        return gewichtung;
    }

    public void setGewichtung(double gewichtung) {
        this.gewichtung = gewichtung;
    }

    public double getBerechnet() {
        return berechnet;
    }

    public void setBerechnet(double berechnet) {
        this.berechnet = berechnet;
    }
}
