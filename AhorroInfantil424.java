package problemas;

import java.util.Scanner;

public class AhorroInfantil424 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int rM = 0;
		int r = 0;
		while(n != 0) {
			n = sc.nextInt();
			if (n > 0) {
				int v = n;
				while (v > 0) {
					if(v == n) {
						rM = sc.nextInt();
						r = rM;
						v--;
					}
					else {
						r += sc.nextInt(); 
						if(rM < r) {
							rM = r;
						}
						v--;
					}
				}
				System.out.println(r + " " + rM);
			}
			//System.out.println(r + " " + rM);
		}

	}

}
