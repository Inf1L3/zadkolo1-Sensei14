/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1.Zadanie4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Osoba {
    Scanner odczyt = new Scanner(System.in);
    
    private String imie;
    private String nazwisko;
    private int wiek;
    private int wzrost;
    private int waga;
    
    
    public void setDane(String imie, String nazwisko, int wiek, int wzrost, int waga)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }
    
    public void getDane()
    {
        System.out.println("Imię:"+this.imie);
        System.out.println("Nazwisko:"+this.nazwisko);
        System.out.println("Wiek:"+this.wiek);
        System.out.println("Wzrost:"+this.wzrost);
        System.out.println("Waga:"+this.waga);
    }
    
    public String getImie()
    {
        return this.imie;
    }
    
    public String getNazwisko()
    {
        return this.nazwisko;
    }
    
    public int getWiek()
    {
        return this.wiek;
    }
    
    public int getWaga()
    {
        return this.waga;
    }
    public int getWzrost()
    {
        return this.wzrost;
    }
    
    
    public Osoba(String imie, String nazwisko, int wiek, int wzrost, int waga)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }
    
    public Osoba()
    {
        this.imie = "";
        this.nazwisko = "";
        this.wiek = 0;
        this.wzrost = 0;
        this.waga = 0;
    }
    
     public void showDane()
    {
        System.out.println("Imię:"+this.imie);
        System.out.println("Nazwisko:"+this.nazwisko);
        System.out.println("Wiek:"+this.wiek);
        System.out.println("Wzrost:"+this.wzrost);
        System.out.println("Waga:"+this.waga);
    }
    
}
