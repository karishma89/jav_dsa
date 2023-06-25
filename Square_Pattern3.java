package coding_Ninja_Pattern_Java_Square;

import java.util.Scanner;

/*
// N = 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5


*/
public class Square_Pattern3 {
	public void sqr_P3() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		// row will loop upto n times
		while (row <= n) {
			int col = 1;
			// col will loop upto n times
			while (col <= n) {
				//here we'r printing col values
				System.out.print(col);
				col++;
			}
			System.out.println();
			row++;
		}
	}
 
}
 
		 



