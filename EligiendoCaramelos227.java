package aceptaElReto;

import java.util.Scanner;

public class EligiendoCaramelos227 {
	
	private final static int MAX_CARAMELOS = 5001;
	private final static long MOD = 1_000_000_007;
	
	static long fact [] = new long[MAX_CARAMELOS];
	static long invFact[]= new long[MAX_CARAMELOS];

	public static void main(String[] args) {
		
		fact[0] = 1;
		
		for (int i = 1; i < MAX_CARAMELOS; i++) {
			fact[i] = (fact[i -1] * i) % MOD;
		}
		
		invFact[MAX_CARAMELOS -1] = inversoModular(fact[MAX_CARAMELOS - 1]);
		for (int i = MAX_CARAMELOS - 2; i >= 0; i--) {
		    invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
		}
		
		Scanner sc = new Scanner(System.in);
		
		long tC = sc.nextLong(), mC = sc.nextLong();
		
		while(tC != 0 || mC != 0) {
			
			for (int i = 0; i <= mC; i++) {
				
				long resul = combinacion((int) tC, i);
				if ( i == mC) {
					System.out.println(resul);
				}
				else {
					System.out.print(resul + " ");
				}
			}
			tC = sc.nextLong();
			mC = sc.nextLong();
		}
		
		sc.close();

	}

	private static long inversoModular(long l) {
		
		return pow(l, MOD - 2);
	}

	private static long pow(long l, long m) {
		long res = 1;
	    l = l % MOD;
	    while (m > 0) {
	        if ((m & 1) == 1)
	            res = (res * l) % MOD;
	        l = (l * l) % MOD;
	        m = m / 2;
	    }
	    return res;
	}
	
	public static long combinacion(int n, int k) {
	    if (k < 0 || k > n) return 0;
	    return (((fact[n] * invFact[k]) % MOD) * invFact[n - k]) % MOD;
	}
	
}
