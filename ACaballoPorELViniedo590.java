package problemas;

import java.util.Scanner;

public class ACaballoPorELViniedo590 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nRacimos; 
		int nUvas;
		int suma;
		int sumaDef;
		boolean sumaEsIgual;
		boolean sumaEsMayor = false;
		int sumaMinima = 0;
		nRacimos = sc.nextInt();
		nUvas = sc.nextInt();
		while(nRacimos !=0 && nUvas !=0) {
			sumaDef = Integer.MAX_VALUE;
			sumaMinima = 0;
			sumaEsIgual = false;
			suma = 0;
			int [] uRacimos = new int [nRacimos];

			for (int i = 0; i < nRacimos; i++) {
				uRacimos[i] = sc.nextInt();
				if(sumaMinima <= nUvas) {
					sumaMinima += uRacimos[i];
				}
				
			}
	
			int j = 0;
			while (j<nRacimos && !sumaEsIgual) {
				sumaEsMayor = false;
				for (int i = j; i < nRacimos && !sumaEsMayor; i++) {
					suma += uRacimos[i];
					if(suma == nUvas) {
						sumaDef = suma;
						sumaEsMayor = true;
						sumaEsIgual =  true;
					}
					else if (suma > nUvas) {
						sumaEsMayor = true;
						if(sumaDef > suma) {
							sumaDef = suma;
						}
					}
				}
				suma = 0;
				j++;
			}
			if(sumaMinima < nUvas) { 
				System.out.println("IMPOSIBLE");
			}
			else {
				System.out.println(sumaDef);
			}
			nRacimos = sc.nextInt();
			nUvas = sc.nextInt();
		}
		sc.close();
	}

}
