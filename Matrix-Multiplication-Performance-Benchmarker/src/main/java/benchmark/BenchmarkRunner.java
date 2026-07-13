package benchmark;

import benchmark.algorithms.NaiveMultiplier;
import benchmark.algorithms.ParallelMultiplier;
import benchmark.algorithms.TransposeMultiplier;

public class BenchmarkRunner {

    public static PerformanceResult runNaive(double[][] A, double[][] B) {

        long start = System.nanoTime();

        NaiveMultiplier.multiply(A, B);

        long end = System.nanoTime();

        return new PerformanceResult("Naive", (end - start) / 1_000_000);

    }

    public static PerformanceResult runTranspose(double[][] A, double[][] B) {

        long start = System.nanoTime();

        TransposeMultiplier.multiply(A, B);

        long end = System.nanoTime();

        return new PerformanceResult("Transpose", (end - start) / 1_000_000);

    }

    public static PerformanceResult runParallel(double[][] A, double[][] B) {

        long start = System.nanoTime();

        ParallelMultiplier.multiply(A, B);

        long end = System.nanoTime();

        return new PerformanceResult("Parallel", (end - start) / 1_000_000);

    }

}