package benchmarkcollections;

import benchmarkcollections.entity.AverageAllMeasurement;
import benchmarkcollections.entity.AverageMeasurement;
import benchmarkcollections.entity.Measurement;

import static benchmarkcollections.Randomizer.testResults;

/**
 * Created by Vasiliy Kylik on 30.07.2017.
 */
public class AverageResult {


  public AverageMeasurement averageWVolume(String structure, String operation, int volume) {
    int sum = 0;
    int cnt = 0;
    for (Measurement measurement : testResults) {
      if (measurement.getTestedStructure().equals(structure) &&
              measurement.getOperation().equals(operation) && measurement.getQuantityOfElements() == volume) {
        sum += measurement.getTimeOfExecution();
      }
      cnt++;
    }
    return new AverageMeasurement(structure,operation,volume,sum/cnt);

  }

  public AverageAllMeasurement averageAll(String structure, String operation) {
    int sum = 0;
    int cnt = 0;
    for (Measurement measurement : testResults) {
      if (measurement.getTestedStructure().equals(structure) &&
              measurement.getOperation().equals(operation)) {
        sum += measurement.getTimeOfExecution();
      }
      cnt++;
    }
    return new AverageAllMeasurement(structure,operation, sum/cnt);
  }


}
