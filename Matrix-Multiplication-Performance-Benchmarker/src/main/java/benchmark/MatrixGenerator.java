package benchmark;

import java.util.Random;

public class MatrixGenerator {

    public static double[][] generate(int size) {

        Random random = new Random();

        double[][] matrix = new double[size][size];

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                matrix[i][j] = random.nextDouble() * 100;

            }

        }

        return matrix;
    }

}