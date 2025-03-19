package problemas;

import java.util.Scanner;

public class CheckMult750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		int numero;
		int numeroAuxiliar = 0;
		int multiplicacion = 1;
		String multiplicacionString = "aaaaaa";
		int nCeros = 0;
		numero = sc.nextInt();
		while (numero !=0 ) {
			String numeroString = String.valueOf(numero);
			while(multiplicacionString.length() != 1) {
				for (int i = 0; i < numeroString.length(); i++) {
					if(numeroString.charAt(i) == '0') {
						nCeros ++;
					}
					else {
						numeroAuxiliar = Integer.parseInt(String.valueOf(numeroString.charAt(i)));
						multiplicacion *= numeroAuxiliar;
						multiplicacionString = String.valueOf(multiplicacion);
					}
				}
				numeroString = multiplicacionString;
				multiplicacion = 1;
			}
			System.out.println(numeroString + nCeros);
			nCeros = 0;
			multiplicacion = 1;
			multiplicacionString = "aaaaaa";
			numero = sc.nextInt();
		}

	}

}
