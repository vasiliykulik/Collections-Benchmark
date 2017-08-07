package benchmarkcollections.entity;

/**
 * Created by Vasiliy Kylik on 29.07.2017.
 */
public class Measurement {

  private String testedStructure;
  private String operation;
  private int quantityOfElements;
  private int quantityOfMeasurements;
  private long timeOfExecution;


  public Measurement(String testedStructure, String operation, int quantityOfElements, int quantityOfMeasurements, long timeOfExecution) {
    this.testedStructure = testedStructure;
    this.operation = operation;
    this.quantityOfElements = quantityOfElements;
    this.quantityOfMeasurements = quantityOfMeasurements;
    this.timeOfExecution = timeOfExecution;
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

  public int getQuantityOfMeasurements() {
    return quantityOfMeasurements;
  }

  public void setQuantityOfMeasurements(int quantityOfMeasurements) {
    this.quantityOfMeasurements = quantityOfMeasurements;
  }

  public long getTimeOfExecution() {
    return timeOfExecution;
  }

  public void setTimeOfExecution(long timeOfExecution) {
    this.timeOfExecution = timeOfExecution;
  }

  @Override
  public String toString() {
    return "Measurement{" +
            "testedStructure='" + testedStructure + '\'' +
            ", operation='" + operation + '\'' +
            ", quantityOfElements=" + quantityOfElements +
            ", quantityOfMeasurements=" + quantityOfMeasurements +
            ", timeOfExecution=" + timeOfExecution +
            '}';
  }
}
