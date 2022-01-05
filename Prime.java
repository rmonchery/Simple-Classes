package com.hackerrank.practice;

import java.math.BigInteger;
import static java.lang.System.in;

public class Prime {

	public Prime() {

	}

	public void checkPrime(int... n) {
		for (int x : n) {
			if (BigInteger.valueOf(x).isProbablePrime(1)) {
				System.out.print(x + " ");
			}

		}
		System.out.println();
	}
}
