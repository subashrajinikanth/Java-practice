package Assignment7;

public class SpiralMatrix {

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3, 10 }, { 4, 5, 6, 11 }, { 7, 8, 9, 12 }, { 45, 78, 89, 56 } };

		int row = 4;
		int column = 4;
		int top = 0;
		int left = 0;
		int right = column - 1;
		int down = row - 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("Matrix spiral order  :");
		while (left <= down && top <= right) {
			// left to right
			for (int i = left; i <= right; i++) {
				System.out.println(matrix[top][i]);
			}
			top = top + 1;// 1
			// top to down
			for (int i = top; i <= down; i++) {
				System.out.println(matrix[i][right]);
			}
			right = right - 1;// 1
			// right to left
			for (int i = right; i >= left; i--) {
				System.out.println(matrix[down][i]);
			}
			down = down - 1;
			// down to top
			for (int i = down; i >= top; i--) {
				System.out.println(matrix[i][left]);
			}
			left = left + 1;
		}
	}

}
