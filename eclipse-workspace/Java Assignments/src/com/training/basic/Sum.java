package com.training.basic;

public class Sum {

	public static void main(String[] args) {
		int m[]= new int[] {1,2,3,4,5};
		int sum=0;
		int avg=0;
		for(int i=0;i<m.length;i++ ) {
			sum=sum+i;
		}
		avg=sum/m.length;
	System.out.println(sum);
	System.out.println(avg);
	}

}
