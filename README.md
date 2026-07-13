#  Matrix Multiplication Performance Benchmarker

A Java-based benchmarking tool that compares the execution performance of different matrix multiplication algorithms. The project measures execution time, evaluates algorithm efficiency, and exports benchmark results to a CSV file for further analysis.

---

##  Features

- Generate random matrices of configurable size
- Benchmark multiple multiplication algorithms
- Compare execution times
- Export results to CSV
- Console-based performance report
- Multithreaded implementation using Java ExecutorService

---

##  Technologies Used

- Java 26
- Maven
- Java Concurrency (ExecutorService)
- File I/O
- Object-Oriented Programming

---

## 📂 Project Structure

```
src
 └── main
     └── java
         └── benchmark
             ├── Main.java
             ├── BenchmarkRunner.java
             ├── CSVExporter.java
             ├── MatrixGenerator.java
             ├── PerformanceResult.java
             └── algorithms
                 ├── NaiveMultiplier.java
                 ├── ParallelMultiplier.java
                 └── TransposeMultiplier.java
```

---

## ⚙ Algorithms Compared

- Naive Matrix Multiplication
- Transpose Optimization
- Parallel Matrix Multiplication

---

## ▶️ How to Run

```bash
mvn compile
mvn exec:java
```

---

## 📊 Sample Output

```
========================================
 Matrix Multiplication Benchmarker
========================================

Generating matrices...
Matrix Size : 500 x 500

------------------------------------
Algorithm         Time(ms)
------------------------------------
Naive                180
Transpose            130
Parallel              72
------------------------------------

Results exported to results.csv
```

---

## 📁 Output

A CSV file named

```
results.csv
```

is generated containing benchmark results.

---

## 🔮 Future Improvements

- Strassen Matrix Multiplication
- Memory Usage Benchmarking
- Performance Charts
- GUI Dashboard
- Benchmark Multiple Matrix Sizes
- JMH Integration

---

