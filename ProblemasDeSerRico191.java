package problemas;

import java.util.Scanner;

public class ProblemasDeSerRico191 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nCasos = sc.nextInt();
		int sumaTotal;
		while(nCasos > 0) {
			sumaTotal = 0;
			int nCompartimentos = sc.nextInt();
			int capacidadMax = sc.nextInt();
			int difLitros = sc.nextInt();
			//Formula SumaDifLitros = difLiros * nºCasos * nºCaasos-1 / 2
			sumaTotal = (capacidadMax * nCompartimentos) - (difLitros * (nCompartimentos - 1) * (nCompartimentos) / 2);
			/*while(nCompartimentos > 0) {
				sumaTotal += capacidadMax;
				capacidadMax -= difLitros;
				nCompartimentos --;
			}*/
			nCasos --;
			System.out.println(sumaTotal);
		}	
		sc.close();
	}
}
