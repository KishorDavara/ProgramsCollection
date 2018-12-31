/*
 You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise). 
 Follow up: Could you do this in-place?
 */
package Arrays;

/**
 *
 * @author KK Davara
 */
public class Rotate2D {
public static void rotate(int[][] matrix) {
	int n = matrix.length;
	for (int i = 0; i < n / 2; i++) {
		for (int j = 0; j < Math.ceil(((double) n) / 2); j++) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[n-1-j][i];
			matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
			matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
			matrix[j][n-1-i] = temp;
		}
	}
}
    public static void main(String[] args) {
        int array[][]=new int[3][3];
        /*for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;i++)
            {
               
            }
        }*/
        array[0][0]=1;array[0][1]=2;array[0][2]=3;
        array[1][0]=4;array[1][1]=5;array[1][2]=6;
        array[2][0]=7;array[2][1]=8;array[2][2]=9;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
              System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        rotate(array);
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
              System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
     }
    
}
