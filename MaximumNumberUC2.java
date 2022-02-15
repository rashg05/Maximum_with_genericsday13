package com.brigdelab.daygenerics;

import java.util.*;

public class MaximumNumberUC2 {
	static Float a, b, c;
	public void getInput() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of a: ");
		a = sc.nextFloat();

		System.out.print("Enter Value of b: ");
		b = sc.nextFloat();

		System.out.print("Enter Value of c: ");
		c = sc.nextFloat();
		sc.close();
	}
	public Float testMaximum(Float x, Float y, Float z) {
		Float max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		else if(z.compareTo(max)>0)
		{
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		MaximumNumberUC2 maxi = new MaximumNumberUC2();
		Float max ;
		maxi.getInput();
		max = maxi.testMaximum(a, b, c);
		System.out.println("Maxmum value is : " + max);

	}
}
