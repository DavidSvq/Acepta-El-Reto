package aceptaElReto;

import java.util.Scanner;

public class TresDedosEnCadaMano272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nV = sc.nextInt();
		for (int i = 0; i < nV; i++) {
			int n = sc.nextInt();
			if (n < 6) {
				System.out.println(n);
			}
			else {
				int c = n / 6;
				String rS;
				rS = String.valueOf(n%6);
				while (c != 0) {
					rS = String.valueOf(c%6) + rS;
					c = c / 6;
				}
				System.out.println(rS);
			}
		}
		sc.close();
	}

}
