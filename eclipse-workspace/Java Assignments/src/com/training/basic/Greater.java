package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		int []m = new int[]{10,5,15,20,30,35};
		int max = m[0];
		for(int i=1;i<m.length-1;i++) {
			if(m[i]>max)
				max=m[i];
		}
		System.out.println("the greatest number is "+max);
	}

}
