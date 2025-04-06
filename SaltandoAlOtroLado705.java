package problemas;

import java.util.Scanner;

public class SaltandoAlOtroLado705 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nCasos = sc.nextInt();
		while (nCasos > 0) {
			int nPiedras;
			int salto = 0;
			int distanciaSaltoMax = 0;
			int contadorDisSalMax = 1;
			nPiedras = sc.nextInt();
			int piedras[]= new int[nPiedras];
			int distancias[]= new int[nPiedras];
			for (int i = 0; i < nPiedras; i++) {
				piedras[i] = sc.nextInt();	
			}
			for (int i = 0; i < nPiedras; i++) {
				if (i == 0) {
					distanciaSaltoMax = piedras[i];
					distancias[i] = piedras[i];
				}
				else {
					distancias[i] = piedras[i] - piedras[i - 1];
					
					if(distanciaSaltoMax < distancias[i]) {
						distanciaSaltoMax = distancias[i];
						contadorDisSalMax = 1;
						
					}
					else if(distanciaSaltoMax == distancias[i]) {
						contadorDisSalMax ++;
					}
				}
			}
			boolean correcto = true;
			int distanciaAux = distanciaSaltoMax;
			for (int i = 0; i < nPiedras; i++) {
				if(distanciaAux == distancias[i]) {
					distanciaAux --;
				}
				else if(distanciaAux < distancias[i]) {
					correcto = false;
				}
					
			}
			if(contadorDisSalMax > 1) {
				salto = distanciaSaltoMax + 1;
			}
			else if (contadorDisSalMax == 1 && !correcto){
				salto = distanciaSaltoMax + 1;
			}
			else {
				salto = distanciaSaltoMax;
			}
			//System.out.println(distanciaAux);
			System.out.println(salto);
			/*for (int i = 0; i < nPiedras; i++) {
				System.out.println(distancias[i]);	
			}*/
			/*System.out.println(distanciaSaltoMax);
			System.out.println(contadorDisSalMax);*/
			nCasos --;
		}

	}

}
