package problemas;

import java.util.Scanner;

public class DivisionEuclidea304 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resto;
		int cociente;
		int nCasos = sc.nextInt();
		while(nCasos > 0) {
			resto = 0;
			cociente = 0;
			int dividendo = sc.nextInt();
			int divisor = sc.nextInt();
			
			if(divisor == 0) {
				System.out.println("DIV0");
			}
			else if (dividendo%divisor != 0) {
				if ((divisor > 0 && dividendo > 0) | (divisor < 0 && dividendo > 0)) {
					cociente = dividendo/divisor;
					resto = dividendo - (cociente * divisor);
				}
				else if (divisor > 0 && dividendo < 0) {
					cociente = dividendo/divisor;
					cociente--;
					resto = dividendo + Math.abs(cociente*divisor);
				}
				else if(divisor < 0 && dividendo < 0) {
					cociente = dividendo/divisor;
					cociente++;
					resto = dividendo + Math.abs(cociente*divisor);
				}
			}
			else {
				cociente = dividendo/ divisor;
				resto = 0;
			}
			if (divisor != 0) {
				System.out.println(cociente + " " + resto);
			}
			nCasos--;
		}
		sc.close();
	}
}
