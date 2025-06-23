package problemas;

import java.util.Scanner;

public class SumaDigitos140 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int n = 0;
		while (n >= 0) {
			n = sc.nextInt();
			if (n >= 0) {
				String nS = String.valueOf(n);
				for (int i = 0; i < nS.length(); i++) {
					int nAux = Integer.parseInt(String.valueOf(nS.charAt(i)));
					suma += nAux;
					if(i + 1 == nS.length()) {
						System.out.print(nAux);
					}
					else {
						System.out.print(nAux + " + ");
					}
				}
				System.out.print(" = " + suma + "\n");
				suma = 0;
			}
		}
		sc.close();
	}

}
