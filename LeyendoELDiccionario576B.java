package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeyendoELDiccionario576B {

	public static void main(String[] args) throws NumberFormatException, IOException {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nSeg = Integer.parseInt(br.readLine());
		
		while(nSeg != 0) {
			
			StringTokenizer palabras = new StringTokenizer(br.readLine());
			
			int suma = 0;
			
			while(palabras.hasMoreTokens()) {
				
				suma += Integer.parseInt(palabras.nextToken());
			}
			
			int totalSeg = nSeg * suma;
			
			int seg = 0;
			int minutos = 0;
			int horas = 0;
			
			//System.out.println(totalSeg);
			
			seg = totalSeg%60;
			
			minutos = (totalSeg/60)%60;
			
			horas = (totalSeg/60) / 60;
			
			String segStr = formatoHora(seg);
			
			String minutosStr = formatoHora(minutos);
			
			String horasStr = formatoHora(horas);
			
			System.out.println(horasStr + ":" + minutosStr + ":" + segStr);
			
			nSeg = Integer.parseInt(br.readLine());
		}

	}

	private static String formatoHora(int total) {
		String resul;
		if(total < 10) {
			resul = "0" + String.valueOf(total);
		}
		else {
			resul = String.valueOf(total);
		}
		return resul;
	}

}
