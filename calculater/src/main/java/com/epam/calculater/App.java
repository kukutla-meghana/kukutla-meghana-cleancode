package com.epam.calculater;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator c=new Calculator(2,0);
        c.add();
        c.subtract();
        c.multiply();
        c.divide();
        System.out.println();
        Calculator c2=new Calculator(8,4);
        c2.add();
        c2.subtract();
        c2.multiply();
        c2.divide();
        
        
    }
}
