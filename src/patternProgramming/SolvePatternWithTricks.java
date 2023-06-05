package patternProgramming;

public class SolvePatternWithTricks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolvePatternWithTricks.pattern4(4);
	}
	public static void pattern1(int n) {
		for(int i =1;i <= n;i++) {
			for(int j = 1; j <= (n+1)-i ;j++){
				System.out.print("* ");							
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		//for printing rows
		for(int row = 1; row <= n; row++) {
			//for printing columns
			for(int col = 1; col <= row; col++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int n) {
		//print no. of rows
		for(int row = 1; row <= n; row++) {
			//print no. of cols.
			for(int col = 1; col <= 4; col++) {
				System.out.print("* ");
			}
			//to go to next line
			System.out.println();
		}
	}
	public static void pattern4(int n) {
		//for printing rows 1 to 9
		for(int row = 1; row <= (2*n)-1; row++) {
			//for printing columns if row < n = print row ,if n > row = print 2n -row *
			int totalCol = row > n ? 2 * n - row: row;
			for(int col = 1; col <= totalCol; col++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
