package wsq.agil.test;

import java.awt.List;
import java.util.ArrayList;

import junit.framework.TestCase;

public class Agiltest extends TestCase {
	public static void main(String[] args) {
		System.out.print("hello");

		SplitInt(10000);

	}

	public static void SplitInt(int n) {
		for (int i = 2; i <= n; i++) {
			if (i == n) {
				System.out.print(i);
				return;
			}
			if (n > i && (n % i == 0)) {
				System.out.print(i + "*");
				SplitInt(n / i);
				break;
			}
		}
	}

	public static void displayScore(int a, int b) {
		if (a == b) {
			if (a == 0) {
				System.out.print("LOVE All");

			}
			if (a == 2) {
				System.out.print("TTHIRTY All");

			}
			if (a == 3) {
				System.out.print("DUCE");

			}

		}

		if (a == 1 && b == 0) {
			System.out.print("FIFTEEN All");

		}
		if (a == 2 && b == 0) {
			System.out.print("TTHIRTY All");

		}
		if (a == 3 && b == 0) {
			System.out.print("FORTY All");

		}
		if (a == 4 && b == 0) {
			System.out.print("A WIN");

		}
		if (a == 4 && b == 3) {
			System.out.print("A ADVANTAGE");

		}
		if (a == 5 && b == 3) {
			System.out.print("A WIN");

		}
		
		

	}

}
