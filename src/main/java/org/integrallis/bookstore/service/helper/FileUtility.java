package org.integrallis.bookstore.service.helper;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {

    void generateReportFile(String content) throws IOException {
        FileWriter fileWriter = new FileWriter("~/DailyReports/Report.csv");
        fileWriter.write(content);
        fileWriter.close();
    }

    public void printOutput() {
    }
}
