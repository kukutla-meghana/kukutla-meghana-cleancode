package com.clean.cleancode;
import java.util.Scanner;
import java.io.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter principal is : ");
    	double pr=sc.nextDouble();
    	System.out.println("Enter rate is : ");
    	double rate=sc.nextDouble();
    	System.out.println("Enter time is : ");
    	double t=sc.nextDouble();
    	System.out.println("select how many square feets of the house is :");
    	int feets=sc.nextInt();
    	System.out.println("select option1 :1200INR if we use standard materials");
    	System.out.println("select option2 :1500INR if we use above standard materials");
    	System.out.println("select option3 :2200INR if we use high  standard materials");
    	System.out.println("select option4: 2500INR if we use standard materials and fully automated home");
    	int n=sc.nextInt();
    	int d=0;
    	switch(n) {
    	case 1:d=1200;
    	       break;
    	case 2:d=1500;
    	       break;
    	case 3:d=1800;
    	       break;
    	case 4:d=2500;
    	       break;
    	}
    	double m=0;
    	m=feets*d;
    	System.out.println("Total cost  of the house is "+m);
        Simpleinterest si=new Simpleinterest(pr,rate,t);
        System.out.println("The Simple interest is "+si.total1());
        Compound ci=new Compound(pr,rate,t);
        System.out.println("The Compound interest is "+ci.total());
        
    }
}
