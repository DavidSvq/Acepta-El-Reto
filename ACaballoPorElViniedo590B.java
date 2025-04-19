package problemas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACaballoPorElViniedo590B {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(lector.readLine());
		int nRacimos; 
		int nUvas;
		int suma;
		int sumaDef;
		boolean sumaEsIgual;
		boolean sumaEsMayor = false;
		int sumaMinima = 0;
		nRacimos = Integer.parseInt(st.nextToken());
		nUvas = Integer.parseInt(st.nextToken());
		while(nRacimos !=0 && nUvas !=0) {
			sumaDef = Integer.MAX_VALUE;
			sumaMinima = 0;
			sumaEsIgual = false;
			suma = 0;
			int [] uRacimos = new int [nRacimos];
			
			st = new StringTokenizer(lector.readLine());
			for (int i = 0; i < nRacimos; i++) {
				uRacimos[i] = Integer.parseInt(st.nextToken());
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
			st = new StringTokenizer(lector.readLine());
			nRacimos = Integer.parseInt(st.nextToken());
			nUvas = Integer.parseInt(st.nextToken());
		}

	}

}
