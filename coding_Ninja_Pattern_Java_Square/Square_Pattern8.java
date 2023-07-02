package coding_Ninja_Pattern_Java_Square;

import java.util.Scanner;

/*
// For N=4:

12344321
123**321
12****21
1******1

==>(break the pattern into two N X N square pattern)

1234
123*
12**
1***

+

4321
*321
**21
***1


*/
public class Square_Pattern8 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		// row will loop from 1 to n times
		while (row <= n) {
			int col = 1;
			// printing col 
			while (col <= n-row+1) {
				System.out.print(col);
				col++;
			}
			// printing *
			int space1 = 1;		
			while (space1 <= row-1) {
				System.out.print("*");
				space1++;
						}
			//printing * for 2nd half
			int colN =1;
			while(colN < row) {
				System.out.print("*");
				colN++;
				
			}
			//printing numbers for 2nd half
			int temp = n-row+1;
			colN =1;
			while(colN <= n-row+1) {
				System.out.print(temp);
				temp--;
				colN++;
			}
			System.out.println();
			row++;
		}
		
		
		}
	}
 

 
		 



