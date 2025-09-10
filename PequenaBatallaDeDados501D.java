package aceptaElReto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PequenaBatallaDeDados501D {

	public static void main(String[] args) throws IOException {
		
		int tropasDefensa;
		int tropasAtaque;
		int maxDadosDefensa;
		int maxDadosAtaque;
		int numeroOleadas;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String infor;
		
		while((infor = br.readLine()) != null) {
			String[] aux = infor.split(" ");
			tropasDefensa = Integer.parseInt(aux[0]);
			tropasAtaque = Integer.parseInt(aux[1]);
			maxDadosDefensa = Integer.parseInt(aux[2]);
			maxDadosAtaque = Integer.parseInt(aux[3]);
			numeroOleadas = Integer.parseInt(aux[4]);
			
			StringTokenizer tirada = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < numeroOleadas; i++) {
					
				int tamanDef = Math.min(tropasDefensa, maxDadosDefensa);	
				int tamanAtaq = Math.min(tropasAtaque, maxDadosAtaque);
				
				int oleadaDef [] = new int[tamanDef];
					
				int oleadaAtaq [] = new int[tamanAtaq];
					
				for (int j = 0; j < tamanDef; j++) {

					oleadaDef[j] = Integer.parseInt(tirada.nextToken());
				}
					
				for (int j = 0; j < tamanAtaq; j++) {
						
					oleadaAtaq[j] = Integer.parseInt(tirada.nextToken());
				}
				
				Arrays.sort(oleadaDef);
				Arrays.sort(oleadaAtaq);
				
				for (int j = 0; j < Math.min(tamanDef, tamanAtaq); j++) {
						
					int def = oleadaDef[tamanDef - 1 - j];
					int ataq = oleadaAtaq[tamanAtaq - 1 - j];
					if (def >= ataq) {
						
						tropasAtaque--;
					}
					else {
						
						tropasDefensa--;
					}
				}
			}
			System.out.println(tropasDefensa + " " + tropasAtaque);
		}
	}	
}
