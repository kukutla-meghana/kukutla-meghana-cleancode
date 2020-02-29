package com.epam.calculater;

public class Calculator {
	int a;
	int b;
	Calculator(int a,int b){
		this.a=a;
		this.b=b;
	}
	void add() {
		int c=a+b;
		System.out.println("Addition of two number is "+c);
	}
	void subtract() {
		int d=a-b;
		System.out.println("Subtraction of two numbers is "+d);
	}
	void multiply() {
		int r=a*b;
		System.out.println("Multiplication of two numbers is "+r);
	}
	void divide() {
		if(b==0) {
			System.out.println("Arithmetic exception is thrown");
		}
		else {
			int y=a/b;
			System.out.println(" Division of two numbers is "+y);
		}
	}
}
