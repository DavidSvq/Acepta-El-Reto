package problemas;

import java.util.Arrays;
import java.util.Scanner;

public class ReunionDeTorres609 {
	public static int calcularDistancia(int pxd, int pyd, int [] puntosX, int [] puntosY){
		int sumaXY = 0;
		for (int i = 0; i < puntosX.length; i++) {
			sumaXY += Math.abs(puntosX[i] - pxd) + Math.abs(puntosY[i] - pyd);
		}
		return sumaXY;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int tT = sc.nextInt();
			int nT = sc.nextInt();
			int [] pFila = new int [nT];
			int [] pFilaOrdenado = new int [nT];
			int [] pColumna = new int [nT];
			int [] pColumnaOrdenado = new int [nT];
			int mediana = 0;
			int medianaPFila = 0;
			int medianaPColumna = 0;
			for (int i = 0; i < pFila.length; i++) {
				pFila[i]= sc.nextInt();
				pColumna[i] = sc.nextInt();
				pFilaOrdenado[i] = pFila[i];
				pColumnaOrdenado[i] = pColumna[i];
			}
			Arrays.sort(pFilaOrdenado);
			Arrays.sort(pColumnaOrdenado);
			
			if(nT%2 == 0) {
				mediana = nT /2;
				medianaPFila = (pFilaOrdenado[mediana-1] + pFilaOrdenado[mediana])/2;
				medianaPColumna = (pColumnaOrdenado[mediana-1] + pColumnaOrdenado[mediana])/2;
			}
			else {
				mediana = nT /2;
				medianaPFila = pFilaOrdenado[mediana];
				medianaPColumna = pColumnaOrdenado[mediana];
			}
			System.out.println(medianaPFila + " " + medianaPColumna + "\n");
			int minDistancia = calcularDistancia(medianaPFila, medianaPColumna, pFila, pColumna);
	        int mejorFila = medianaPFila;
	        int mejorColumna = medianaPColumna;
	        System.out.println("Fuera del bucle " + minDistancia);
			//int distanciaRecorrida = calcularDistancia(medianaPFila, medianaPColumna, pFila, pColumna);
			for (int i = 0; i < nT; i++) {
				int distanciaRecorrida = calcularDistancia(pFila[i], pColumna[i], pFila, pColumna);
				System.out.println("Dist valor i" + i + distanciaRecorrida);
				if(distanciaRecorrida < minDistancia) {
					minDistancia = distanciaRecorrida;
					mejorFila = pFila[i];
					mejorColumna = pColumna[i];
					System.out.println("Primer if distancia es menor, valor de i" + i + mejorFila + " " + mejorColumna + "\n");
				}
				else if(distanciaRecorrida == minDistancia) {
					System.out.println("misma distancia");
					if (pFila[i] < mejorFila || (pFila[i] == mejorFila && pColumna[i] < mejorColumna)) {
						mejorFila = pFila[i];
						mejorColumna = pColumna[i];
						System.out.println("Entro en el igual mas a la izquierda");
					}
				}
			}
			System.out.println(mejorFila + " " + mejorColumna + "\n");
		}
		
	}	
}
