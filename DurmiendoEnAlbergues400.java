package problemas;

import java.util.Scanner;

public class DurmiendoEnAlbergues400 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String albergue;
		int contadorCamasVacias;
		int contadorCamasLlenas;
		int mejorDistancia = 0;
		while(sc.hasNext()) {
			contadorCamasVacias = 0;
			contadorCamasLlenas = 0;
			mejorDistancia = 0;
			albergue = sc.next();
			for (int i = 0; i < albergue.length(); i++) {
				if(albergue.charAt(i) == '.') {
					contadorCamasVacias ++;
					if(i == albergue.length() - 1) {
						contadorCamasVacias --;
						if(mejorDistancia < contadorCamasVacias) {
							mejorDistancia = contadorCamasVacias;
						}
					}
				}
				else {
					if(contadorCamasLlenas < 3) {
						contadorCamasLlenas ++; 
					}
					if(contadorCamasLlenas == 1) {
						contadorCamasVacias --;
						if(mejorDistancia < contadorCamasVacias) {
							mejorDistancia = contadorCamasVacias;
						}
						
					}
					if(contadorCamasVacias%2 == 0) {
						contadorCamasVacias = (contadorCamasVacias/2) - 1;
					}else {
						contadorCamasVacias = (contadorCamasVacias - 1) / 2;
					}
					if(mejorDistancia < contadorCamasVacias) {
						mejorDistancia = contadorCamasVacias;
					}
					contadorCamasVacias = 0;
				}
			}
			System.out.print(mejorDistancia + "\n");
		}
	}

}
