package com.training.basic;

import java.util.Arrays;

public class LargeSecond {

	public static void main(String[] args) {
		int m[]=new int[] {5,10,15,7,9};
		Arrays.sort(m);
		System.out.println(m[m.length-2]);
	}

}
