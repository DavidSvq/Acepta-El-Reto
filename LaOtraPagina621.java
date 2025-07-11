package problemas;

import java.util.Scanner;

public class LaOtraPagina621 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0) {
			int p = sc.nextInt();
			if(p%2 == 0) {
				System.out.println(p + 1);
			}
			else {
				System.out.println(p - 1);
			}
			n--;
		}
		sc.close();
	}

}
