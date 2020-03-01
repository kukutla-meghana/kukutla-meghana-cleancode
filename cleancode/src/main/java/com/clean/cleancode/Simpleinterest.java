package com.clean.cleancode;

public class Simpleinterest {
	double  pr, rate, t, sim;
	Simpleinterest(double pr,double rate,double t){
		this.pr=pr;
		this.rate=rate;
		this.t=t;
	}
	public double total1() {
		sim= (pr *t *rate)/100;
		return sim;
	}

}
