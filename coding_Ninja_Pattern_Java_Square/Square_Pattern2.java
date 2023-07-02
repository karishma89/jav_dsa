package coding_Ninja_Pattern_Java_Square;

import java.util.Scanner;

/*
// N = 5
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

*/
public class Square_Pattern2 {
	public void sqr_P2() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		// row will loop upto n times
		while (row <= n) {
			int col = 1;
			// col will loop upto n times
			while (col <= n) {
				//here we'r printing row values
				System.out.print(row);
				col++;
			}
			System.out.println();
			row++;
		}
	}
 
}
 
		 



