package coding_Ninja_Pattern_Java_Square;

import java.util.Scanner;

/*
// For N=4:
****
****
****
****
*/
public class Square_Pattern1 {
	public void sqr_P1() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		// row will loop upto n times
		while (row <= n) {
			int col = 1;
			// col will loop upto n times
			while (col <= n) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}
 
}
 
		 



