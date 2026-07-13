package benchmark.algorithms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ParallelMultiplier {

    public static double[][] multiply(double[][] A, double[][] B) {

        int n = A.length;

        double[][] C = new double[n][n];

        int threads = Runtime.getRuntime().availableProcessors();

        ExecutorService executor = Executors.newFixedThreadPool(threads);

        for (int row = 0; row < n; row++) {

            final int i = row;

            executor.execute(() -> {

                for (int j = 0; j < n; j++) {

                    double sum = 0;

                    for (int k = 0; k < n; k++) {

                        sum += A[i][k] * B[k][j];

                    }

                    C[i][j] = sum;

                }

            });

        }

        executor.shutdown();

        try {

            executor.awaitTermination(1, TimeUnit.HOURS);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }

        return C;

    }

}