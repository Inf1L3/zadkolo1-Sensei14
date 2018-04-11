/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1.Zadanie2;

/**
 *
 * @author student
 */
public class Zadanie2 {
    
    public int fib(int n)
    {
        if(n==1) return 1;
        if(n==2) return 1;
        
        return fib(n-2)+fib(n-1);
    }
    
}
