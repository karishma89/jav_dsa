package coding_Ninja_Pattern_Java_Square;

import java.util.Scanner;

/*
// N = 5
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1

*/
public class Square_Pattern4 {
	public void sqr_P4() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		// row will loop upto n times
		while (row <= n) {
			int col = 1;
			// col will loop upto n times
			while (col <= n) {
				//here we'r printing (n-col+1) values
				System.out.print(n-col+1);
				col++;
			}
			System.out.println();
			row++;
		}
	}
 
}
 
		 



