package benchmark;

public class PerformanceResult {

    private final String algorithm;

    private final long executionTime;

    public PerformanceResult(String algorithm, long executionTime) {

        this.algorithm = algorithm;

        this.executionTime = executionTime;

    }

    public String getAlgorithm() {

        return algorithm;

    }

    public long getExecutionTime() {

        return executionTime;

    }

}