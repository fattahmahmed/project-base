
public class RaggedArray {

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int[] replacementArray;
		
		for (int row = 0; row < matrix.length; row ++) {
			replacementArray = new int [matrix.length - row];
			for (int column = 0; column < replacementArray.length; column ++) {
				replacementArray[column] = column + 1;
				//replacementArray[column] = matrix.length - column;
			}
			matrix[row] = replacementArray;
		}
		
		for (int[] row: matrix) {
			for (int column: row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}
