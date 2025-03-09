package problemas;

import java.util.Scanner;

public class EvitandoTropiezos688 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean tropiezo;
		int difEntrePelda;
		int difMax;
		int nPelda;
		int h;
		int hMin;
		int hMax;
		while(sc.hasNext()) {
			tropiezo = false;
			difEntrePelda = sc.nextInt();
			difMax = sc.nextInt();
			nPelda = sc.nextInt();
			h = sc.nextInt();
			hMin = 0;
			hMax = 0;
			int[] hPelda = new int[nPelda];
			for (int i = 0; i < nPelda; i++) {
				hPelda[i]= sc.nextInt();
			}
			int[] difsPels = new int [nPelda];
			
			for (int i = 0; i < nPelda; i ++) {
				if (i == 0) {
					difsPels[i]= hPelda[i] - h;
					hMin = difsPels[i];
					hMax = difsPels[i];
				}else {
					difsPels[i] = hPelda[i] - hPelda[i - 1];
					if(difsPels[i] < hMin) hMin = difsPels[i];
					if(difsPels[i] > hMax) hMax = difsPels[i];
					/*if(i <= nPelda - 1) {
						if(Math.abs(difsPels[i - 1] - difsPels[i]) > difEntrePelda) {
							tropiezo = true;
							i = nPelda;
						}
						if((hMax - hMin) > difMax) tropiezo = true;
					}*/
					
				}
			}
			
			for (int i = 0; i < nPelda - 1; i++) {
				if(Math.abs(difsPels[i] - difsPels[i + 1]) > difEntrePelda) {
					tropiezo = true;
					i = nPelda - 1;
				}
			}
			if((hMax - hMin) > difMax) tropiezo = true;
				
			if(tropiezo) {
				System.out.println("Tropiezo");
			}else {
				System.out.println("Ok");
			}
		}
	}

}
