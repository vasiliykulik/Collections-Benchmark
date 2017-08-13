package benchmarkcollections;


import benchmarkcollections.entity.AverageAllMeasurement;
import benchmarkcollections.entity.AverageMeasurement;
import benchmarkcollections.entity.Measurement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by Raketa on 09.10.2016.
 */
public class Randomizer {

  public static int j;
  public static int quantityOfMeasurements = 2;
  public static List<Measurement> testResults = new ArrayList<>();
  public static List<AverageMeasurement> avgTestResults = new ArrayList<>();
  public static List<AverageAllMeasurement> avgAll = new ArrayList<>();

  public static List<Measurement> test(int count, int quantityOfMeasurements) {

    List<String> arrayList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();
    Set<String> hashSet = new HashSet<>();
    Set<String> treeSet = new TreeSet<>();
    ArrayDeque<String> arrayDeque = new ArrayDeque<>();

    Random myRandom = new Random();

    long start, finish;
    for (int k = 0; k <= quantityOfMeasurements; k++) {

      // ArrayList

      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        arrayList.add(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("arrayList", "add", count,
              quantityOfMeasurements, (finish - start)));
//      System.out.println("arrayList " + count + " add:   " + (finish - start) + " (populate)");


      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        arrayList.set(i, new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("arrayList", "set", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("arrayList " + count + " set:   " + (finish - start));


      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        arrayList.get(i);
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("arrayList", "get", count,
              quantityOfMeasurements, (finish - start)));
//      System.out.println("arrayList " + count + " get:   " + (finish - start));

      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        arrayList.contains(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("arrayList", "contains", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("arrayList " + count + " contains:   " + (finish - start));


      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        arrayList.remove(0);
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("arrayList", "remove", count,
              quantityOfMeasurements, (finish - start)));
//      System.out.println("arrayList " + count + " remove:   " + (finish - start));


      ListIterator<String> arrayListIterator = arrayList.listIterator();
      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        arrayListIterator.add(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("arrayListIterator", "add", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("arrayListIterator " + count + " add:   " + (finish - start));

      start = System.nanoTime();
      while (arrayListIterator.hasNext()) {
        arrayListIterator.next();
        arrayListIterator.remove();
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("arrayListIterator", "remove", count,
              quantityOfMeasurements, (finish - start)));
      //    System.out.println("arrayListIterator " + count + " remove:   " + (finish - start));


// LinkedList

      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        linkedList.add(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("linkedList", "add", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("linkedList " + count + " add:   " + (finish - start));


      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        linkedList.set(i, new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("linkedList", "set", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("linkedList " + count + " set:   " + (finish - start));


      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        linkedList.get(i);
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("linkedList", "get", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("linkedList " + count + " get:   " + (finish - start));

      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        arrayList.contains(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("linkedList", "contains", count,
              quantityOfMeasurements, (finish - start)));
      //   System.out.println("arrayList " + count + " contains:   " + (finish - start));


      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        linkedList.remove(0);
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("linkedList", "remove", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("linkedList " + count + " remove:   " + (finish - start));

      ListIterator<String> linkedListIterator = linkedList.listIterator();
      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        linkedListIterator.add(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("linkedListIterator", "add", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("linkedListIterator " + count + " add:   " + (finish - start) + " (populate)");

      start = System.nanoTime();
      while (linkedListIterator.hasNext()) {
        linkedListIterator.next();
        linkedListIterator.remove();
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("linkedListIterator", "remove", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("arrayListIterator " + count + " remove:   " + (finish - start));

      // HashSet

      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        hashSet.add(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("hashSet", "add", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("hashSet " + count + " add:   " + (finish - start) + " (populate)");


      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        hashSet.contains(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("hashSet", "contains", count,
              quantityOfMeasurements, (finish - start)));
//      System.out.println("hashSet " + count + " contains:   " + (finish - start));


      start = System.nanoTime();
      for (int i = 0; i <= hashSet.size() / 3; i++) {
        hashSet.remove(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("hashSet", "remove", count,
              quantityOfMeasurements, (finish - start)));
      //    System.out.println("hashSet " + count + " remove:   " + (finish - start));


      // TreeSet

      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        treeSet.add(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("treeSet", "add", count,
              quantityOfMeasurements, (finish - start)));
      //    System.out.println("treeSet " + count + " add:   " + (finish - start) + " (populate)");


      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        treeSet.contains(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("treeSet", "contains", count,
              quantityOfMeasurements, (finish - start)));
      //    System.out.println("treeSet " + count + " contains:   " + (finish - start));


      start = System.nanoTime();
      for (int i = 0; i <= treeSet.size() / 3; i++) {
        treeSet.remove(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("treeSet", "remove", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("treeSet " + count + " remove:   " + (finish - start));

      // ArrayDeque

      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        arrayDeque.addFirst(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("arrayDeque", "add", count,
              quantityOfMeasurements, (finish - start)));
      //    System.out.println("arrayDeque " + count + " add:   " + (finish - start) + " (populate)");


      start = System.nanoTime();
      for (int i = 0; i < count; i++) {
        arrayDeque.contains(new Integer(myRandom.nextInt(30000)).toString());
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("arrayDeque", "contains", count,
              quantityOfMeasurements, (finish - start)));
      //    System.out.println("arrayDeque " + count + " contains:   " + (finish - start));


      start = System.nanoTime();
      for (int i = 0; i <= count - 1; i++) {
        arrayDeque.removeFirst();
      }
      finish = System.nanoTime();
      testResults.add(new Measurement("arrayDeque", "remove", count,
              quantityOfMeasurements, (finish - start)));
      //     System.out.println("arrayDeque " + count + " remove:   " + (finish - start));
    }
    return testResults;
  }

  public static void main(String[] args) {
    for (j = 100; j <= 10000; j *= 10) {
      test(j, quantityOfMeasurements);
    }
    AverageResult average = new AverageResult();

    avgTestResults.add(average.averageWVolume("arrayList", "add", 100));
    avgTestResults.add(average.averageWVolume("arrayList", "add", 1000));
    avgTestResults.add(average.averageWVolume("arrayList", "add", 10000));
    avgTestResults.add(average.averageWVolume("arrayList", "set", 100));
    avgTestResults.add(average.averageWVolume("arrayList", "set", 1000));
    avgTestResults.add(average.averageWVolume("arrayList", "set", 10000));
    avgTestResults.add(average.averageWVolume("arrayList", "get", 100));
    avgTestResults.add(average.averageWVolume("arrayList", "get", 1000));
    avgTestResults.add(average.averageWVolume("arrayList", "get", 10000));
    avgTestResults.add(average.averageWVolume("arrayList", "contains", 100));
    avgTestResults.add(average.averageWVolume("arrayList", "contains", 1000));
    avgTestResults.add(average.averageWVolume("arrayList", "contains", 10000));
    avgTestResults.add(average.averageWVolume("arrayList", "remove", 100));
    avgTestResults.add(average.averageWVolume("arrayList", "remove", 1000));
    avgTestResults.add(average.averageWVolume("arrayList", "remove", 10000));
    avgTestResults.add(average.averageWVolume("arrayListIterator", "add", 100));
    avgTestResults.add(average.averageWVolume("arrayListIterator", "add", 1000));
    avgTestResults.add(average.averageWVolume("arrayListIterator", "add", 10000));
    avgTestResults.add(average.averageWVolume("arrayListIterator", "remove", 100));
    avgTestResults.add(average.averageWVolume("arrayListIterator", "remove", 1000));
    avgTestResults.add(average.averageWVolume("arrayListIterator", "remove", 10000));
    avgTestResults.add(average.averageWVolume("linkedList", "add", 100));
    avgTestResults.add(average.averageWVolume("linkedList", "add", 1000));
    avgTestResults.add(average.averageWVolume("linkedList", "add", 10000));
    avgTestResults.add(average.averageWVolume("linkedList", "set", 100));
    avgTestResults.add(average.averageWVolume("linkedList", "set", 1000));
    avgTestResults.add(average.averageWVolume("linkedList", "set", 10000));
    avgTestResults.add(average.averageWVolume("linkedList", "get", 100));
    avgTestResults.add(average.averageWVolume("linkedList", "get", 1000));
    avgTestResults.add(average.averageWVolume("linkedList", "get", 10000));
    avgTestResults.add(average.averageWVolume("linkedList", "contains", 100));
    avgTestResults.add(average.averageWVolume("linkedList", "contains", 1000));
    avgTestResults.add(average.averageWVolume("linkedList", "contains", 10000));
    avgTestResults.add(average.averageWVolume("linkedList", "remove", 100));
    avgTestResults.add(average.averageWVolume("linkedList", "remove", 1000));
    avgTestResults.add(average.averageWVolume("linkedList", "remove", 10000));
    avgTestResults.add(average.averageWVolume("linkedListIterator", "add", 100));
    avgTestResults.add(average.averageWVolume("linkedListIterator", "add", 1000));
    avgTestResults.add(average.averageWVolume("linkedListIterator", "add", 10000));
    avgTestResults.add(average.averageWVolume("linkedListIterator", "remove", 100));
    avgTestResults.add(average.averageWVolume("linkedListIterator", "remove", 1000));
    avgTestResults.add(average.averageWVolume("linkedListIterator", "remove", 10000));
    avgTestResults.add(average.averageWVolume("hashSet", "add", 100));
    avgTestResults.add(average.averageWVolume("hashSet", "add", 1000));
    avgTestResults.add(average.averageWVolume("hashSet", "add", 10000));
    avgTestResults.add(average.averageWVolume("hashSet", "contains", 100));
    avgTestResults.add(average.averageWVolume("hashSet", "contains", 1000));
    avgTestResults.add(average.averageWVolume("hashSet", "contains", 10000));
    avgTestResults.add(average.averageWVolume("hashSet", "remove", 100));
    avgTestResults.add(average.averageWVolume("hashSet", "remove", 1000));
    avgTestResults.add(average.averageWVolume("hashSet", "remove", 10000));
    avgTestResults.add(average.averageWVolume("treeSet", "add", 100));
    avgTestResults.add(average.averageWVolume("treeSet", "add", 1000));
    avgTestResults.add(average.averageWVolume("treeSet", "add", 10000));
    avgTestResults.add(average.averageWVolume("treeSet", "contains", 100));
    avgTestResults.add(average.averageWVolume("treeSet", "contains", 1000));
    avgTestResults.add(average.averageWVolume("treeSet", "contains", 10000));
    avgTestResults.add(average.averageWVolume("treeSet", "remove", 100));
    avgTestResults.add(average.averageWVolume("treeSet", "remove", 1000));
    avgTestResults.add(average.averageWVolume("treeSet", "remove", 10000));
    avgTestResults.add(average.averageWVolume("arrayDeque", "add", 100));
    avgTestResults.add(average.averageWVolume("arrayDeque", "add", 1000));
    avgTestResults.add(average.averageWVolume("arrayDeque", "add", 10000));
    avgTestResults.add(average.averageWVolume("arrayDeque", "contains", 100));
    avgTestResults.add(average.averageWVolume("arrayDeque", "contains", 1000));
    avgTestResults.add(average.averageWVolume("arrayDeque", "contains", 10000));
    avgTestResults.add(average.averageWVolume("arrayDeque", "remove", 100));
    avgTestResults.add(average.averageWVolume("arrayDeque", "remove", 1000));
    avgTestResults.add(average.averageWVolume("arrayDeque", "remove", 10000));
    avgTestResults.forEach(System.out::println);

    avgAll.add(average.averageAll("arrayList", "add"));
    long aLA = average.averageAll("arrayList", "add").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("arrayList", "set"));
    long aLS = average.averageAll("arrayList", "set").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("arrayList", "get"));
    long aLG = average.averageAll("arrayList", "get").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("arrayList", "contains"));
    long aLC = average.averageAll("arrayList", "contains").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("arrayList", "remove"));
    long aLR = average.averageAll("arrayList", "remove").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("arrayListIterator", "add"));
    long aLIA = average.averageAll("arrayListIterator", "add").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("arrayListIterator", "remove"));
    long aLIR = average.averageAll("arrayListIterator", "remove").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("linkedList", "add"));
    long lLa = average.averageAll("linkedList", "add").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("linkedList", "set"));
    long lLS = average.averageAll("linkedList", "set").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("linkedList", "get"));
    long lLG = average.averageAll("linkedList", "get").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("linkedList", "contains"));
    long lLC = average.averageAll("linkedList", "contains").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("linkedList", "remove"));
    long lLR = average.averageAll("linkedList", "remove").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("linkedListIterator", "add"));
    long lLIA = average.averageAll("linkedListIterator", "add").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("linkedListIterator", "remove"));
    long lLIR = average.averageAll("linkedListIterator", "remove").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("hashSet", "add"));
    long hSA = average.averageAll("hashSet", "add").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("hashSet", "contains"));
    long hSC = average.averageAll("hashSet", "contains").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("hashSet", "remove"));
    long hSR = average.averageAll("hashSet", "remove").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("treeSet", "add"));
    long tSA = average.averageAll("treeSet", "add").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("treeSet", "contains"));
    long tSC = average.averageAll("treeSet", "contains").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("treeSet", "remove"));
    long tSR = average.averageAll("treeSet", "remove").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("arrayDeque", "add"));
    long aDA = average.averageAll("arrayDeque", "add").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("arrayDeque", "contains"));
    long aDC = average.averageAll("arrayDeque", "contains").getAverageTimeOfExecution();
    avgAll.add(average.averageAll("arrayDeque", "remove"));
    long aDR = average.averageAll("arrayDeque", "remove").getAverageTimeOfExecution();
    avgAll.forEach(System.out::println);


    String[][] data = {
            {"ArrayList", String.valueOf(aLA), String.valueOf(aLS), String.valueOf(aLG),
                    String.valueOf(aLC), String.valueOf(aLR), "not measured", String.valueOf(aLIA), String.valueOf(aLIR)},
            {"LinkedList", String.valueOf(lLa), String.valueOf(lLS), String.valueOf(lLG),
                    String.valueOf(lLC), String.valueOf(lLR), "not measured", String.valueOf(lLIA), String.valueOf(lLIR)},
            {"HashSet", String.valueOf(hSA), "not measured", "not measured", String.valueOf(hSC), String.valueOf(hSR),
                    "not measured", "not measured", "not measured"},
            {"TreeSet", String.valueOf(tSA), "not measured", "not measured", String.valueOf(tSC), String.valueOf(tSR),
                    "not measured", "not measured", "not measured"},
            {"ArrayDeque", String.valueOf(aDA), "not measured", "not measured", String.valueOf(aDC), String.valueOf(aDR),
                    "not measured", "not measured", "not measured"}
    };
    String[] headers = {"Collection",
            "add",
            "set",
            "get",
            "contains",
            "remove",
            "populate",
            "iterator add",
            "iterator remove"};

    JFrame frame = new JFrame("Collections Benchmark");
    DefaultTableModel model = new DefaultTableModel(data, headers);
    final JTable table = new JTable(model);
    JScrollPane scroll = new JScrollPane(table);

    JButton export = new JButton("Export");
    export.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        try {
          ExcelExporter exp = new ExcelExporter();
          exp.exportTable(table, new File("results.xls"));
        } catch (IOException ex) {
          System.out.println(ex.getMessage());
          ex.printStackTrace();
        }
      }
    });

    frame.getContentPane().add("Center", scroll);
    frame.getContentPane().add("South", export);
    frame.pack();
    frame.setVisible(true);
  }


}
