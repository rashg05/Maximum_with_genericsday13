package com.brigdelab.daygenerics;

import java.util.Scanner;

public class MaximumNumberUC5 <T extends Comparable<T>>{
	T first, second, third;
	
	public MaximumNumberUC5(T x, T y, T z) {
		this.first = x;
		this.second = y;
		this.third = z;
	}

	public T maximum()
	{
		return testMaximum(first, second, third);
	}
	public static <T extends Comparable<T>> T testMaximum (T x, T y, T z) {
		T max = x; 
		if(y.compareTo(max) > 0) 
		{
			max = y;  
		}
		if(z.compareTo(max) > 0) 
		{
			max = z; 
		}
		printMax (x, y, z, max);
		return max; 
	}

	public static <T> void printMax (T x, T y, T z, T max) {
		System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
	}
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		int ans;
		do {
			System.out.println("1.Integers\n2.Float\n3.String\nSelect Your Choice: ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
			{
				System.out.print("Enter First Value: ");
				Integer first = sc.nextInt();

				System.out.print("Enter Second Value: ");
				Integer second = sc.nextInt();

				System.out.print("Enter Third Value: ");
				Integer third = sc.nextInt();

				new MaximumNumberUC5<Integer>(first, second, third).maximum();
				break;
			}				
			case 2:
			{
				System.out.print("Enter First Value: ");
				Float first = sc.nextFloat();

				System.out.print("Enter Second Value: ");
				Float second = sc.nextFloat();

				System.out.print("Enter Third Value: ");
				Float third = sc.nextFloat();

				new MaximumNumberUC5<Float>(first, second, third).maximum();
				break;
			}
			case 3:
			{
				System.out.print("Enter First Value: ");
				String first = sc.next();

				System.out.print("Enter Second Value: ");
				String second = sc.next();

				System.out.print("Enter Third value ");
				String third = sc.next();

				new MaximumNumberUC5<String>(first, second, third).maximum();
				break;
			}
			default:
				System.out.println("Enter Choice Between 1 And 3");				
			}
			System.out.println("Do you want to continue ? press 1 for continue");
			ans = sc.nextInt();
		}while(ans == 1);		
		sc.close();
	}
}