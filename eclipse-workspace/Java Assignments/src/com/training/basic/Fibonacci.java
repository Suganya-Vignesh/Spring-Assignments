package com.training.basic;

public class Fibonacci {

	public static void main(String[] args) {
		int a= 0;
		int b= 1;
		int c =0;
		System.out.println("0"+"\n"+"1");
		while(true) {
		c= a+b;
		if(c>=100) {
			break;
		}
		System.out.println(c);
		a=b;
		b=c;
		
		}
		
	}

}
