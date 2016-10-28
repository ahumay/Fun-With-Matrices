import java.util.Arrays;

public class Main
{
    public static final int[][] MATRIX_1 = { {3, 3, 3}, {1, 1, 1}, {2, 2, 2}};
    public static final int[][] MATRIX_2 = { {0, 0, 3}, {0, 2, 2}, {1, 1, 1}};
    
    // Do you believe in magic?
    public static final int[][] MAGIC_MATRIX_1 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}; // yes
    public static final int[][] MAGIC_MATRIX_2 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}; // yes
    public static final int[][] MAGIC_MATRIX_3 = {{2, 7, 12, 13}, {16, 9, 6, 3}, {5, 4, 15, 10}, {11, 14, 1, 8}}; // yes
    public static final int[][] MAGIC_MATRIX_4 = {{2, 7, 6}, {9, 5, 1}, {4, 1, 8}}; // no
    public static final int[][] MAGIC_MATRIX_5 = {{2, 7, 6}, {9, 5, 1}, {5, 3, 8}}; // no
    public static final int[][] MAGIC_MATRIX_6 = {{1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}}; // no    

    public static void main(String[] args)
    {
    	int[][] matrix = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}, {5, 6, 7}};
    	//printMatrix(matrix, true);
    	shiftUp(matrix);
    	//printMatrix(numberPyramid(4), false);
    }
    public static void printMatrixRow(int[] row, boolean printZeroes) {
    	String x = "";
    	for (int elem: row){
    		if (elem == 0){
    			printZeroes = false;
    			if (printZeroes == false) {
    			x = "  ";
    			System.out.printf(x);
    			
    			}
    		}
    		if (printZeroes == true){
    			x = elem + "" + " ";
    			System.out.printf(x);
    		}
    		printZeroes = true;
    	}
    	
    }
    public static void printMatrix(int[][] matrix, boolean printZeroes){
    	for (int[] row: matrix) {
    		printMatrixRow(row, true);
    		System.out.println();
    	}
    }
    
    public static void shiftUp(int[][] matrix) {
    	System.out.println();
    	printMatrix(matrix, true);
    	    	
    	for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[0].length; j++){
    			int y = matrix[0][j];
    			int x = matrix[matrix.length - 1][j];

    			matrix[0][j] = x;
    			matrix[matrix.length -1][j] = y;
    		}
    	}
    	System.out.println();
    	printMatrix(matrix, true);
    }
    public static int[][] numberPyramid(int n) {
    	int[][] arr = new int[n][n];
    	
    	
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = n - i - 1; j < n; j++) {
    			arr[i][j] = i + 1;
    		}
    	}
    	
    	
    	return arr;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
