package com.brigdelab.daygenerics;

public class MaximumNumberUC3< T extends Comparable<T>> {
	public T findMax(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) >= 1) {
			max = y;
		}
		if(y.compareTo(max) >= 1) {
			max = y;
		}
		return max;
	}
	
	public static void main(String[] args) {
		String x = "java";
		String y = "python";
		String z = "c++";
		MaximumNumberUC3<String> max = new MaximumNumberUC3<String>();
		System.out.println(max.findMax(x, y, z));
		
	}

}
