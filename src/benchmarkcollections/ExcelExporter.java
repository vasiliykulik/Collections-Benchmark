package benchmarkcollections;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Vasiliy Kylik on 30.07.2017.
 */
public class ExcelExporter {
  public void exportTable(JTable table, File file) throws IOException {
    TableModel model = table.getModel();
    FileWriter out = new FileWriter(file);

    for (int i = 0; i < model.getColumnCount(); i++) {
      out.write(model.getColumnName(i) + "\t");
    }
    out.write("\n");
    for (int i = 0; i < model.getRowCount(); i++) {
      for (int j = 0; j < model.getColumnCount(); j++) {
        out.write(model.getValueAt(i, j).toString() + "\t");
      }
      out.write("\n");
    }
    out.close();
    System.out.println("write out to: " + file);
  }
}
