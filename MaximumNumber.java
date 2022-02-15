package com.brigdelab.daygenerics;

import java.util.*;

public class MaximumNumber {
	static Integer x, y, z;
	public void getInput() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of x: ");
		x = sc.nextInt();

		System.out.print("Enter Value of y: ");
		y = sc.nextInt();

		System.out.print("Enter Value of z: ");
		z = sc.nextInt();
		sc.close();
	}
	public Integer testMaximum(Integer a, Integer b, Integer c) {
		Integer max = a;
		if(b.compareTo(max)>0) {
			max = b;
		}
		if(c.compareTo(max)>0)
		{
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		MaximumNumber maxi = new MaximumNumber();
		Integer max ;
		maxi.getInput();
		max = maxi.testMaximum(x, y, z);
		System.out.println("Maxmum value is : " + max);

	}
}
