package problemas;

import java.util.Scanner;

public class LaPruebaDeLasCajasYLasBolas357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nPaseos;
		while(sc.hasNext()) {
			nPaseos = 0;
			int n = sc.nextInt();
			while(n!=1) {
				if (n%2 == 0) {
					n = n/2;
					nPaseos++;
				}
				else {
					n--;
					n = n/2;
					nPaseos++;
				}
			}
			nPaseos++;
			System.out.println(nPaseos);
		}
	}
}
