package problemas;

import java.util.Scanner;

public class SalvadosPolElNueve572 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadorCeros;
		int contadorNueves;
		int nCasos = sc.nextInt();
		while(nCasos > 0) {
			double [] notas = new double[5];
			contadorCeros = 0;
			contadorNueves = 0;
			for (int i = 0; i < 5; i++) {
				notas[i] = sc.nextDouble();
				if(notas[i] == 0.0) {
					contadorCeros++;
				}
				else if(notas[i] >= 9) {
					contadorNueves++;
				}
			}
			
			if(contadorCeros == 0) {
				System.out.println("MEDIA");
			}
			else if(contadorCeros > 0 && contadorNueves > 0) {
				System.out.println("MEDIA");
			}
			else {
				System.out.println("SUSPENSO DIRECTO");
			}
			nCasos --;
		}
	}

}
