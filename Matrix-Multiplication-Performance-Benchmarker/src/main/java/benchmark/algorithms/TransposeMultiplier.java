package benchmark.algorithms;

public class TransposeMultiplier {

    public static double[][] multiply(double[][] A, double[][] B) {

        int n = A.length;

        double[][] BT = new double[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                BT[j][i] = B[i][j];

            }

        }

        double[][] C = new double[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                double sum = 0;

                for (int k = 0; k < n; k++) {

                    sum += A[i][k] * BT[j][k];

                }

                C[i][j] = sum;

            }

        }

        return C;

    }

}