package benchmark;

import java.io.FileWriter;
import java.io.IOException;

public class CSVExporter {

    public static void export(PerformanceResult... results) {

        try (FileWriter writer = new FileWriter("results.csv")) {

            writer.write("Algorithm,ExecutionTime(ms)\n");

            for (PerformanceResult result : results) {

                writer.write(result.getAlgorithm() + "," + result.getExecutionTime() + "\n");

            }

            System.out.println("\nResults exported to results.csv");

        } catch (IOException e) {

            System.out.println("Error writing CSV.");

        }

    }

}