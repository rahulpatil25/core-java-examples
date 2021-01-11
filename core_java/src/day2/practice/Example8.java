package day2.practice;

public class Example8 {
	public static void main(String[] args) {
		int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		int c[][] = new int[3][3];
		
		//MULTIPLYING & MULTIPLICATION OF 2 MATRICES
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for(int k = 0; k < 3; k++) {
					c[i][j] = a[i][k] + b[k][j];
				} //END OF K LOOP
				System.out.print(c[i][j] + " "); //PRINTING MATRIX ELEMENTS
			} // END OF J LOOP
			System.out.println(); //NEW LINE
		}
		
	}
}
