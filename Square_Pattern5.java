package coding_Ninja_Pattern_Java_Square;

import java.util.Scanner;

/*
// N = 5
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9


*/
public class Square_Pattern5 {
	public void sqr_P5() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		// row will loop upto n times
		while (row <= n) {
			int col = 1;
			// col will loop upto n times
			while (col <= n) {
				//here we'r printing (col+row-1) values
				System.out.print(col+row-1);
				col++;
			}
			System.out.println();
			row++;
		}
	}
 
}
 
		 



