package coding_Ninja_Pattern_Java_Square;

import java.util.Scanner;

/*
Code : Square Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4

4444
4444
4444
4444

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
*/
public class SquarePattern {
	public void sqr_P7() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		// row will loop upto n times
		while (row <= n) {
			int col = 1;
			while(col <= n) {
				System.out.print(n);
				col++;
			}
			System.out.println();
			row++;
		}
	}
}
 
		 



