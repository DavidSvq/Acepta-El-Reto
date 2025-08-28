package aceptaElReto;

import java.util.Scanner;

public class EnLaMenteDelTimonel458B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nC;
		while((nC = sc.nextInt()) != 0) {
			
			long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE;

			long min1 = Long.MAX_VALUE, min2 = Long.MAX_VALUE;
			
			for (int i = 0; i < nC; i++) {
				
				long num = sc.nextLong();
				
				if(num > max1) {
					max2 = max1;
					max1 = num;
					
				}
				else if(num > max2) {
					max2 = num;
				}
				
				if(num < min1) {
					min2 = min1;
					min1 = num;
					
				}
				else if(num < min2) {
					min2 = num;
				}
			}
			
			long mMax = max1 * max2;
			
			long mMin = min1 * min2;
			
			if(mMax > mMin) {
				System.out.println(mMax);
			}
			else {
				System.out.println(mMin);
			}
			
		}
		sc.close();
	}

}
