package benchmarkcollections.entity;

/**
 * Created by Vasiliy Kylik on 30.07.2017.
 */
public class AverageAllMeasurement{
  private String testedStructure;
  private String operation;
  private long averageTimeOfExecution;

  @Override
  public String toString() {
    return "AverageAllMeasurement{" +
            "testedStructure='" + testedStructure + '\'' +
            ", operation='" + operation + '\'' +
            ", averageTimeOfExecution=" + averageTimeOfExecution +
            '}';
  }

  public String getTestedStructure() {
    return testedStructure;
  }

  public void setTestedStructure(String testedStructure) {
    this.testedStructure = testedStructure;
  }

  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public long getAverageTimeOfExecution() {
    return averageTimeOfExecution;
  }

  public void setAverageTimeOfExecution(long averageTimeOfExecution) {
    this.averageTimeOfExecution = averageTimeOfExecution;
  }

  public AverageAllMeasurement(String testedStructure, String operation, long averageTimeOfExecution) {
    this.testedStructure = testedStructure;
    this.operation = operation;
    this.averageTimeOfExecution = averageTimeOfExecution;
  }
}
