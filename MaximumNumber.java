package com.brigdelab.daygenerics;

public class MaximumNumber {
	public int findMax(int x, int y, int z) {
		if(x > y && x > z) {
			return x;
		}
		if(y > x && y > z) {
			return y;
		}
		if(z > x && z > y) {
			return z;
		}

		return 0;
	}
	public static void main(String[] args) {
		int x = 66;
		int y = 45;
		int z = 89;
		MaximumNumber max = new MaximumNumber();
		System.out.println(max.findMax(x, y, z));

	}

}
