import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[][] matrixA = createRandomMatrix(size, size);
        double[][] matrixB = createRandomMatrix(size, size);

        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println();

        System.out.println("Matrix B:");
        printMatrix(matrixB);
        System.out.println();

        double[][] sum = addMatrices(matrixA, matrixB);
        System.out.println("Addition result:");
        printMatrix(sum);
        System.out.println();

        double[][] diff = subtractMatrices(matrixA, matrixB);
        System.out.println("Subtraction result:");
        printMatrix(diff);
        System.out.println();

        double[][] product = multiplyMatrices(matrixA, matrixB);
        System.out.println("Multiplication result:");
        printMatrix(product);
        System.out.println();

        double[][] transposeA = transposeMatrix(matrixA);
        System.out.println("Transpose of A:");
        printMatrix(transposeA);
        System.out.println();

        double detA = determinant(matrixA);
        System.out.println("Determinant of A: " + detA);
        System.out.println();

        double[][] inverseA = inverseMatrix(matrixA);
        if (inverseA != null) {
            System.out.println("Inverse of A:");
            printMatrix(inverseA);
        } else {
            System.out.println("Matrix A is singular, no inverse exists.");
        }
    }

    private static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;  // random ints from 1 to 10
            }
        }
        return matrix;
    }

    private static double[][] addMatrices(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    private static double[][] subtractMatrices(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    private static double[][] multiplyMatrices(double[][] a, double[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        double[][] result = new double[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    private static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    private static double determinant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) return matrix[0][0];
        if (n == 2) return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double det = 0;
        for (int i = 0; i < n; i++) {
            det += Math.pow(-1, i) * matrix[0][i] * determinant(getMinor(matrix, 0, i));
        }
        return det;
    }

    private static double[][] getMinor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        int minorRow = 0;
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            int minorCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                minor[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }
        return minor;
    }

    private static double[][] inverseMatrix(double[][] matrix) {
        int n = matrix.length;
        double det = determinant(matrix);
        if (det == 0) return null;

        double[][] cofactor = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cofactor[i][j] = Math.pow(-1, i + j) * determinant(getMinor(matrix, i, j));
            }
        }

        double[][] adjoint = transposeMatrix(cofactor);

        double[][] inverse = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = adjoint[i][j] / det;
            }
        }
        return inverse;
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }
}