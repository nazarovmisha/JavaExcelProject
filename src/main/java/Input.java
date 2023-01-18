import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Input {
    public static void main(String[] args) throws IOException {
        List listStudents = new ArrayList();
        List listUniversities = new ArrayList();
        File file = new File("src/universityInfo.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheetStudents = workbook.getSheetAt(0);
        Iterator<Row> rowIteratorStudents = sheetStudents.iterator();
        rowIteratorStudents.next();
        while (rowIteratorStudents.hasNext()) {
            Row rowStudents = rowIteratorStudents.next();
            Iterator<Cell> cellIteratorStudents = rowStudents.cellIterator();
            while (cellIteratorStudents.hasNext()) {
                Cell cell = cellIteratorStudents.next();
                listStudents.add(cell);
            }
        }
        System.out.print(listStudents);
        XSSFSheet sheetUniversities = workbook.getSheetAt(1);
        Iterator<Row> rowIteratorUniversities = sheetUniversities.iterator();
        rowIteratorUniversities.next();
        while (rowIteratorUniversities.hasNext()){
            Row rowUniversities=rowIteratorUniversities.next();
            Iterator<Cell> cellIteratorUniversities = rowUniversities.cellIterator();
            while(cellIteratorUniversities.hasNext()){
                Cell cell =cellIteratorUniversities.next();
                listUniversities.add(cell);

            }
        }
        System.out.println(listUniversities);

    }

}