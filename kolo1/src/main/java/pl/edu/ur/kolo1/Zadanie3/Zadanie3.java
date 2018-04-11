/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1.Zadanie3;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Zadanie3 {
    
    private int[] tab = new int[10];
    Scanner odczyt = new Scanner(System.in);
    public void add()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Podaj liczbę"+(i+1));
            this.tab[i] = odczyt.nextInt();
        }
        
    }
    
    public void show()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("T["+i+"]= "+this.tab[i]);
        }
    }
    
    public double srednia()
    {
        int s=0;
        double srednia;
        for(int i=0; i<10; i++)
        {
            s+=this.tab[i];
        }
        srednia = s/10;
        return srednia;
    }
    
    
}
