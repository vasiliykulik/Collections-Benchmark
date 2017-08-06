package benchmarkcollections.entity;

/**
 * Created by Vasiliy Kylik on 30.07.2017.
 */
public class AverageMeasurement  {
  private String testedStructure;
  private String operation;
  private int quantityOfElements;
  private long averageTimeOfExecution;

  @Override
  public String toString() {
    return "AverageMeasurement{" +
            "testedStructure='" + testedStructure + '\'' +
            ", operation='" + operation + '\'' +
            ", quantityOfElements=" + quantityOfElements +
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

  public int getQuantityOfElements() {
    return quantityOfElements;
  }

  public void setQuantityOfElements(int quantityOfElements) {
    this.quantityOfElements = quantityOfElements;
  }

  public long getAverageTimeOfExecution() {
    return averageTimeOfExecution;
  }

  public void setAverageTimeOfExecution(long averageTimeOfExecution) {
    this.averageTimeOfExecution = averageTimeOfExecution;
  }

  public AverageMeasurement(String testedStructure, String operation, int quantityOfElements, long averageTimeOfExecution) {
    this.testedStructure = testedStructure;
    this.operation = operation;
    this.quantityOfElements = quantityOfElements;
    this.averageTimeOfExecution = averageTimeOfExecution;
  }
}
