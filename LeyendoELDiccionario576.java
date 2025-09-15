package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeyendoELDiccionario576 {

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
			
			if(totalSeg < 60) {
				String segS = "";
				segS = formatoHora(totalSeg);
				System.out.println("00:00:" + segS);
				//System.out.println("%02d:%02d:%02d".formatted(horas, minutos, totalSeg));
			}
			else {
				minutos = totalSeg / 60;
				seg = totalSeg%60;	
				String segS = formatoHora(seg);
				if (minutos < 60) {
					
					String minS = formatoHora(minutos);
					
					System.out.println("00:"+ minS + ":" + segS);
					//System.out.println("%02d:%02d:%02d".formatted(horas, minutos, seg));
				}
				else {
					horas = minutos / 60;
					minutos = minutos%60;
					
					String minS = formatoHora(minutos);
					String horaS = formatoHora(horas);
					
					System.out.println(horaS + ":" + minS + ":" + segS);
					
					//System.out.println("%02d:%02d:%02d".formatted(horas, minutos, seg));
				}
			}
			
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
