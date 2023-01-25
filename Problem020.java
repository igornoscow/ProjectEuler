package main;

import java.math.*;

public class Main {
	public static void main (String[] args) {
		BigInteger f = BigInteger.valueOf(1);
		for (int i=1; i<=100; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		int sum = 0;
		for (char i: f.toString().toCharArray()) {
			sum += i-48;
		}
		System.out.println(sum);
	}
}
