package coding_Ninja_Pattern_Java_Square;

import java.util.Scanner;

/*
// N = 4
4555
3455
2345
1234
=>

4
34
234
1234

+

555
55
5
*/
public class Square_Pattern6 {
	public static void sqr_P6() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		// row will loop upto n times
		while (row <= n) {
			int col = 1;
			// col will loop upto n times
			while (col <= row) {
				//here we'r printing (n-row+col) values
				System.out.print(n-row+col);
				col++;
			}
			col=1;
			int space = 1;
			while(space <= n-row) {
				System.out.print(n+1);
				space++;
			}
			System.out.println();
			row++; 
		}
	}
}
 
		 



