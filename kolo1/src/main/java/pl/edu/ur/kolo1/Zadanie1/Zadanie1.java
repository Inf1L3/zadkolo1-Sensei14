/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1.Zadanie1;

/**
 *
 * @author student
 */
public class Zadanie1 {
    
    public void show()
    {
        for (int i=10; i>=0; i--)
            if(i==8 || i==6 || i==3 || i==1) continue; 
         else
                
            System.out.println(i);
    }
    
}
