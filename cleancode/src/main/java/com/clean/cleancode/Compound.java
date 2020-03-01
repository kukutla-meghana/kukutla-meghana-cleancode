package com.clean.cleancode;

public class Compound {
	double pr, rate, t,com;
	Compound(double pr,double rate,double t){
		this.pr=pr;
		this.rate=rate;
		this.t=t;
	}
	public double  total() {
		com=pr*(Math.pow((1 +rate / 100), t));
		return com;
	}

}
