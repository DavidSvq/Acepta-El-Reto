package problemas;

import java.util.ArrayList;
import java.util.Scanner;

public class ConseguirUnCuadradoPerfecto414 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nCasosDePrueba = sc.nextInt();
		int numero = 0;
		
		ArrayList<Integer> primos = precalcularPrimos(46341);
		
		while(nCasosDePrueba > 0) {
			numero = sc.nextInt();
			int i = 1;
			for (int j : primos) {
				if(j * j > numero) {
					break;
				}
				int contador = 0;
				while (numero % j == 0) {
					contador ++;
					numero /= j;
				}
				if(contador % 2 != 0) {
					i *= j;
				}
			}
			if(numero > 1) {
				i *= numero;
			}
			nCasosDePrueba --;
			System.out.println(i);
		}

	}
	public static ArrayList<Integer> precalcularPrimos(int limite) {
	    ArrayList<Integer> primos = new ArrayList<>();
	    boolean[] esPrimo = new boolean[limite + 1];
	    for (int i = 2; i <= limite; i++) {
	        esPrimo[i] = true;
	    }
	    for (int p = 2; p * p <= limite; p++) {
	        if (esPrimo[p]) {
	            for (int i = p * p; i <= limite; i += p) {
	                esPrimo[i] = false;
	            }
	        }
	    }
	    for (int i = 2; i <= limite; i++) {
	        if (esPrimo[i]) {
	            primos.add(i);
	        }
	    }
	    return primos;
	}
}
