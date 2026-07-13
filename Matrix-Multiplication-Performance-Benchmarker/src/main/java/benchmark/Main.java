package benchmark;

public class Main {

    public static void main(String[] args) {

        int size = 500;

        System.out.println("");
        System.out.println(" Matrix Multiplication Benchmarker");
        System.out.println("");

        System.out.println("\nGenerating matrices...");

        double[][] A = MatrixGenerator.generate(size);
        double[][] B = MatrixGenerator.generate(size);

        System.out.println("Matrix Size : " + size + " x " + size);

        PerformanceResult naive =
                BenchmarkRunner.runNaive(A, B);

        PerformanceResult transpose =
                BenchmarkRunner.runTranspose(A, B);

        PerformanceResult parallel =
                BenchmarkRunner.runParallel(A, B);

        System.out.println("\n -");

        System.out.printf("%-15s %10s%n",
                "Algorithm",
                "Time(ms)");

        System.out.println("");

        System.out.printf("%-15s %10d%n",
                naive.getAlgorithm(),
                naive.getExecutionTime());

        System.out.printf("%-15s %10d%n",
                transpose.getAlgorithm(),
                transpose.getExecutionTime());

        System.out.printf("%-15s %10d%n",
                parallel.getAlgorithm(),
                parallel.getExecutionTime());

        System.out.println(" ");

        CSVExporter.export(
                naive,
                transpose,
                parallel
        );

    }

}