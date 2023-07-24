package util

import com.xlson.groovycsv.PropertyMapper
import groovy.io.FileType
import model.CsvTestRow
import com.xlson.groovycsv.CsvParser

import java.nio.file.Paths

class FileUtils {
    def list = []
    private def headers

    List<CsvTestRow> readFile() {
        List<CsvTestRow> testRows = []
        list.each { file ->
            headers = loadFile(file, true)[0]
            loadFile(file).each {
                row ->
                    String envFromCSV = TestDataProcessor.getRowValue((PropertyMapper) row, "environment")
                    if (!row.toString().containsIgnoreCase("ignore: TRUE") &&
                            envFromCSV.containsIgnoreCase(PropertiesData.selectedEnv))
                        testRows.add(CsvTestRow.builder().headers(headers).row(row).build())
            }
        }
        testRows
    }


    private def loadFile(File file, boolean readFirstLine = false) {
        CsvParser.parseCsv(file.getText(), separator: ",", readFirstLine: readFirstLine)
    }


    void getFile(String className) {
        def path = System.getProperty("user.dir")+"/src/main/resources/csv"
        def dir = new File(path)
        dir.eachFileRecurse (FileType.FILES) { file ->
            if(file.getName().contains(className))
                list << file
        }
    }

}


