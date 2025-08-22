package aceptaElReto;

import java.util.ArrayList;
import java.util.Scanner;

public class HoyComemosMejillones502 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			
			ArrayList <Integer> mon = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				
				int concha = sc.nextInt();
				
				int pos = limiteSuperior(mon, concha);
				
				 if (pos < mon.size()) {
	                 mon.set(pos, concha);
				 } 
				 else {
					 mon.add(concha);
	                }
			}
			
			System.out.println(mon.size());
			}
		sc.close();
		}
		
	private static int limiteSuperior(ArrayList<Integer> mon, int concha) {
		int bajo = 0, alto = mon.size();
		
		while ( bajo < alto) {
			int medio = (bajo + alto)/2;
			if (mon.get(medio) > concha) {
				alto = medio;
			}
			else {
				bajo = medio + 1;
			}
		}
		return bajo;
	}

}

