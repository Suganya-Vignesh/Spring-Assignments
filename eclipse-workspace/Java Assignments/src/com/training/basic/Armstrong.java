package com.training.basic;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
		int orignum = num;
		int result= 0;
		int remainder;
		
		while (orignum!=0) {
			remainder = orignum%10;
			result = result + remainder*remainder*remainder;
			orignum = orignum/10;
		}
		if(result==num)
		System.out.println("yes");
		else
		System.out.println("no");
	}

}
