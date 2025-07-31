package aceptaElReto;

import java.io.IOException;
import java.util.Scanner;

public class LosNinoPrimero354B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		boolean s = true;
		while(s == true) {
			int n = sc.nextInt();
			
			if(n == 0) {
				s = false;
			}
			else {
			int alturas[]= new int[n];
			for (int i = 0; i < n; i++) {
				alturas[i] = sc.nextInt();
			}
			
			int maxI[] = new int[n];
			int minD[] = new int[n];
			
			maxI[0]= alturas[0];
			for (int i = 1; i < n; i++) {
				maxI[i]=  Math.max(maxI[i-1], alturas[i]);
			}
			
			minD[n-1]= alturas[n-1];
			for(int i = n - 2; i>=0;i--) {
				minD[i]= Math.min(minD[i + 1], alturas[i]);
			}
			
			int c = 0;
			for (int i = 1; i < n; i++) {
				  if (maxI[i - 1] >= minD[i]) {
	                    c++;
	                } else {
	                	i = n;
	                }
			}
			System.out.println(c + 1);
			}
			
		}
		sc.close();
	}
}
