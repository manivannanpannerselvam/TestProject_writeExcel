package pkg1;
import org.apache.poi.ss.usermodel.Cell;

//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class sample {

        public static void main(String arg[]) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFWorkbook workbook1 = new XSSFWorkbook();
        XSSFWorkbook workbook2 = new XSSFWorkbook();
        XSSFWorkbook workbook3 = new XSSFWorkbook();
        XSSFWorkbook workbook4 = new XSSFWorkbook();
        XSSFWorkbook workbook5 = new XSSFWorkbook();
        XSSFWorkbook workbook6 = new XSSFWorkbook();
        XSSFWorkbook workbook7 = new XSSFWorkbook();
        XSSFWorkbook workbook8 = new XSSFWorkbook();
        XSSFWorkbook workbook9 = new XSSFWorkbook();
        XSSFWorkbook workbook10 = new XSSFWorkbook();
        XSSFWorkbook workbook11 = new XSSFWorkbook();
        XSSFWorkbook workbook12 = new XSSFWorkbook();
        XSSFWorkbook workbook13 = new XSSFWorkbook();
        XSSFWorkbook workbook14 = new XSSFWorkbook();
        XSSFWorkbook workbook15 = new XSSFWorkbook();
        // Creating a blank Excel sheet
        XSSFSheet sheet
                = workbook.createSheet("student Details");

        XSSFSheet sheet1
                = workbook1.createSheet("student Details");

        XSSFSheet sheet2
                = workbook2.createSheet("student Details");

        XSSFSheet sheet3
                = workbook3.createSheet("student Details");

        XSSFSheet sheet4
                = workbook4.createSheet("student Details");

        XSSFSheet sheet5
                = workbook5.createSheet("student Details");

        XSSFSheet sheet6
                = workbook6.createSheet("student Details");
        XSSFSheet sheet7
                = workbook7.createSheet("student Details");

        XSSFSheet sheet8
                = workbook8.createSheet("student Details");

        XSSFSheet sheet9
                = workbook9.createSheet("student Details");

        XSSFSheet sheet10
                = workbook10.createSheet("student Details");

        XSSFSheet sheet11
                = workbook11.createSheet("student Details");

        XSSFSheet sheet12
                = workbook12.createSheet("student Details");

        XSSFSheet sheet13
                = workbook13.createSheet("student Details");

        XSSFSheet sheet14
                = workbook14.createSheet("student Details");

        XSSFSheet sheet15
                = workbook15.createSheet("student Details");

        // Creating an empty TreeMap of string and Object][]
        // type

        Map<String, Object[]> data01
                = new TreeMap<String, Object[]>();
        Map<String, Object[]> data
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data1
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data2
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data3
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data4
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data5
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data6
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data7
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data8
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data9
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data10
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data11
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data12
                = new TreeMap<String, Object[]>();


        Map<String, Object[]> data13
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data14
                = new TreeMap<String, Object[]>();

        Map<String, Object[]> data15
                = new TreeMap<String, Object[]>();

        for (int i = 0; i < 6; i++) {
            //generate random values from 0-24
            //  if(i==0) {
//              for(int j=0;j<3;i++)
//              {

            int min = 50;
            int max = 100000000;

            //Generate random int value from 50 to 10
            System.out.println("Random value in int from " + min + " to " + max + ":");
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println(random_int);
            data01.put("" + i + "",
                    new Object[]{"MURUGAN", "MURUGAN01", "MURUGAN02"});

            data.put("" + i + "",
                    new Object[]{"Am_pf_LT1_create" + random_int + " ", "Am_legal_lt1_create" + random_int + "", "Am_TStar_create" + random_int + ""});

            data1.put("" + i + "",
                    new Object[]{"Am_pf_LT1_complete" + random_int + " ", "Am_legal_lt1_complete" + random_int + "", "Am_TStar_complete" + random_int + ""});

            data2.put("" + i + "",
                    new Object[]{"Am_pf_LT1_complete" + random_int + " "});

            data3.put("" + i + "",
                    new Object[]{"Am_pf_LT1_Update" + random_int + " ", "Am_legal_lt1_update" + random_int + "", "Am_TStar_update" + random_int + ""});


            data5.put("" + i + "",
                    new Object[]{"Bm_GAA_LT1_create" + random_int + " ", "BM_CRTSCD_lt1_create" + random_int + ""});

            data6.put("" + i + "",
                    new Object[]{"Bm_GAA_LT1_complete" + random_int + " ", "BM_CRTSCD_lt1_complete" + random_int + ""});

            data6.put("" + i + "",
                    new Object[]{"Bm_GAA_LT1_complete" + random_int + " ", "BM_CRTSCD_lt1_complete" + random_int + ""});

            data7.put("" + i + "",
                    new Object[]{"Bm_GAA_LT1_update" + random_int + " ", "BM_CRTSCD_lt1_update" + random_int + ""});

            data8.put("" + i + "",
                    new Object[]{"Is_LT1_create" + random_int + " ", "Is_Desc_LT1_create" + random_int + "", "Is_RDM_create" + random_int + ""});

            data9.put("" + i + "",
                    new Object[]{"Is_LT1_complete" + random_int + " ", "Is_Desc_LT1_complete" + random_int + "", "Is_RDM_complete" + random_int + ""});

            data10.put("" + i + "",
                    new Object[]{"Is_LT1_update" + random_int + " ", "Is_Desc_LT1_update" + random_int + "", "Is_RDM_update" + random_int + ""});

            data11.put("" + i + "",
                    new Object[]{"Insti_LT1_create" + random_int + " ", "Insti_LT1_create" + random_int + "", "Insti_LT1_create" + random_int + ""});

            data12.put("" + i + "",
                    new Object[]{"Insti_LT1_complete" + random_int + " ", "Insti_LT1_complete" + random_int + "", "Insti_LT1_complete" + random_int + ""});

            data13.put("" + i + "",
                    new Object[]{"sc_LT1_create" + random_int + " ", "sc_LT1_create" + random_int + "", "sc_LT1_create" + random_int + ""});

            data14.put("" + i + "",
                    new Object[]{"sc_LT1_complete" + random_int + " ", "sc_LT1_complete" + random_int + "", "sc_LT1_complete" + random_int + ""});

            data15.put("" + i + "",
                    new Object[]{"sc_LT1_update" + random_int + " ", "sc_LT1_update" + random_int + "", "sc_LT1_update" + random_int + ""});

            // Iterating over data and writing it to sheet
            Set<String> keyset01 = data01.keySet();
            Set<String> keyset = data.keySet();

            Set<String> keyset1 = data1.keySet();

            Set<String> keyset2 = data2.keySet();

            Set<String> keyset3 = data3.keySet();
            Set<String> keyset4 = data4.keySet();
            Set<String> keyset5 = data5.keySet();
            Set<String> keyset6 = data6.keySet();
            Set<String> keyset7 = data7.keySet();
            Set<String> keyset8 = data8.keySet();
            Set<String> keyset9 = data9.keySet();
            Set<String> keyset10 = data10.keySet();
            Set<String> keyset11 = data11.keySet();
            Set<String> keyset12 = data12.keySet();
            Set<String> keyset13 = data13.keySet();
            Set<String> keyset14 = data14.keySet();
            Set<String> keyset15 = data15.keySet();
            int rownum = 1;
            int rownum1 = 1;
            int rownum2 = 1;
            int rownum3 = 1;
            int rownum4 = 1;
            int rownum5 = 1;
            int rownum6 = 1;
            int rownum7 = 1;
            int rownum8 = 1;
            int rownum9 = 1;
            int rownum10 = 1;
            int rownum11 = 1;
            int rownum12 = 1;
            int rownum13 = 1;
            int rownum14 = 1;
            int rownum15 = 1;
            int rownum0=0;
            for (String key : keyset01) {


                // Creating a new row in the sheet
                Row row = sheet.createRow(rownum0);
                Object[] objArr = data01.get(key);
                int cellnum = 0;

                for (Object obj : objArr) {

                    // This line creates a cell in the next
                    //  column of that row

                    Cell cell = row.createCell(cellnum++);

                    if (obj instanceof String)
                        cell.setCellValue((String) obj);

                    else if (obj instanceof Integer)
                        cell.setCellValue((Integer) obj);

                }
            }

            for (String key : keyset) {


                // Creating a new row in the sheet
                Row row = sheet.createRow(rownum++);
                Object[] objArr = data.get(key);
                int cellnum = 0;

                for (Object obj : objArr) {

                    // This line creates a cell in the next
                    //  column of that row

                    Cell cell = row.createCell(cellnum++);

                    if (obj instanceof String)
                        cell.setCellValue((String) obj);

                    else if (obj instanceof Integer)
                        cell.setCellValue((Integer) obj);

                }
            }


            for (String key1 : keyset1) {

                // Creating a new row in the sheet
                Row row1 = sheet1.createRow(rownum1++);
                Object[] objArr1 = data1.get(key1);
                int cellnum1 = 0;
                for (Object obj1 : objArr1) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell1 = row1.createCell(cellnum1++);


                    if (obj1 instanceof String)
                        cell1.setCellValue((String) obj1);

                    else if (obj1 instanceof Integer)
                        cell1.setCellValue((Integer) obj1);

                }
            }

            for (String key2 : keyset2) {

                // Creating a new row in the sheet
                Row row2 = sheet2.createRow(rownum2++);

                Object[] objArr2 = data2.get(key2);

                int cellnum2 = 0;

                for (Object obj2 : objArr2) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell2 = row2.createCell(cellnum2++);

                    if (obj2 instanceof String)
                        cell2.setCellValue((String) obj2);

                    else if (obj2 instanceof Integer)
                        cell2.setCellValue((Integer) obj2);
                }
            }

            for (String key3 : keyset3) {

                // Creating a new row in the sheet
                Row row3 = sheet3.createRow(rownum3++);
                Object[] objArr3 = data3.get(key3);
                int cellnum3 = 0;

                for (Object obj3 : objArr3) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell3 = row3.createCell(cellnum3++);

                    if (obj3 instanceof String)
                        cell3.setCellValue((String) obj3);

                    else if (obj3 instanceof Integer)
                        cell3.setCellValue((Integer) obj3);
                }
            }

            for (String key5 : keyset5) {

                // Creating a new row in the sheet
                Row row5 = sheet5.createRow(rownum5++);
                Object[] objArr5 = data5.get(key5);
                int cellnum5 = 0;

                for (Object obj5 : objArr5) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell5 = row5.createCell(cellnum5++);

                    if (obj5 instanceof String)
                        cell5.setCellValue((String) obj5);

                    else if (obj5 instanceof Integer)
                        cell5.setCellValue((Integer) obj5);
                }
            }

            for (String key6 : keyset6) {

                // Creating a new row in the sheet
                Row row6 = sheet6.createRow(rownum6++);
                Object[] objArr6 = data6.get(key6);
                int cellnum6 = 0;

                for (Object obj6 : objArr6) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell6 = row6.createCell(cellnum6++);

                    if (obj6 instanceof String)
                        cell6.setCellValue((String) obj6);

                    else if (obj6 instanceof Integer)
                        cell6.setCellValue((Integer) obj6);
                }
            }

            for (String key7 : keyset7) {

                // Creating a new row in the sheet
                Row row7 = sheet7.createRow(rownum7++);
                Object[] objArr7 = data7.get(key7);
                int cellnum7 = 0;

                for (Object obj7 : objArr7) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell7 = row7.createCell(cellnum7++);

                    if (obj7 instanceof String)
                        cell7.setCellValue((String) obj7);

                    else if (obj7 instanceof Integer)
                        cell7.setCellValue((Integer) obj7);
                }
            }

            for (String key8 : keyset8) {

                // Creating a new row in the sheet
                Row row8 = sheet8.createRow(rownum8++);
                Object[] objArr8 = data8.get(key8);
                int cellnum8 = 0;

                for (Object obj8 : objArr8) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell8 = row8.createCell(cellnum8++);

                    if (obj8 instanceof String)
                        cell8.setCellValue((String) obj8);

                    else if (obj8 instanceof Integer)
                        cell8.setCellValue((Integer) obj8);
                }
            }

            for (String key9 : keyset9) {

                // Creating a new row in the sheet
                Row row9 = sheet9.createRow(rownum9++);
                Object[] objArr9 = data9.get(key9);
                int cellnum9 = 0;

                for (Object obj9 : objArr9) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell9 = row9.createCell(cellnum9++);

                    if (obj9 instanceof String)
                        cell9.setCellValue((String) obj9);

                    else if (obj9 instanceof Integer)
                        cell9.setCellValue((Integer) obj9);
                }
            }

            for (String key10 : keyset10) {

                // Creating a new row in the sheet
                Row row10 = sheet10.createRow(rownum10++);
                Object[] objArr10 = data10.get(key10);
                int cellnum10 = 0;

                for (Object obj10 : objArr10) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell10 = row10.createCell(cellnum10++);

                    if (obj10 instanceof String)
                        cell10.setCellValue((String) obj10);

                    else if (obj10 instanceof Integer)
                        cell10.setCellValue((Integer) obj10);
                }
            }

            for (String key11 : keyset11) {

                // Creating a new row in the sheet
                Row row11 = sheet11.createRow(rownum11++);
                Object[] objArr11 = data11.get(key11);
                int cellnum11 = 0;

                for (Object obj11 : objArr11) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell11 = row11.createCell(cellnum11++);

                    if (obj11 instanceof String)
                        cell11.setCellValue((String) obj11);

                    else if (obj11 instanceof Integer)
                        cell11.setCellValue((Integer) obj11);
                }
            }

            for (String key12 : keyset12) {

                // Creating a new row in the sheet
                Row row12 = sheet12.createRow(rownum12++);
                Object[] objArr12 = data12.get(key12);
                int cellnum12 = 0;

                for (Object obj12 : objArr12) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell12 = row12.createCell(cellnum12++);

                    if (obj12 instanceof String)
                        cell12.setCellValue((String) obj12);

                    else if (obj12 instanceof Integer)
                        cell12.setCellValue((Integer) obj12);
                }
            }

            for (String key13 : keyset13) {

                // Creating a new row in the sheet
                Row row13 = sheet13.createRow(rownum13++);
                Object[] objArr13 = data13.get(key13);
                int cellnum13 = 0;

                for (Object obj13 : objArr13) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell13 = row13.createCell(cellnum13++);

                    if (obj13 instanceof String)
                        cell13.setCellValue((String) obj13);

                    else if (obj13 instanceof Integer)
                        cell13.setCellValue((Integer) obj13);
                }
            }

            for (String key14 : keyset14) {

                // Creating a new row in the sheet
                Row row14 = sheet14.createRow(rownum14++);
                Object[] objArr14 = data14.get(key14);
                int cellnum14 = 0;

                for (Object obj14 : objArr14) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell14 = row14.createCell(cellnum14++);

                    if (obj14 instanceof String)
                        cell14.setCellValue((String) obj14);

                    else if (obj14 instanceof Integer)
                        cell14.setCellValue((Integer) obj14);
                }
            }

            for (String key15 : keyset15) {

                // Creating a new row in the sheet
                Row row15 = sheet15.createRow(rownum15++);
                Object[] objArr15 = data15.get(key15);
                int cellnum15 = 0;

                for (Object obj15 : objArr15) {

                    // This line creates a cell in the next
                    //  column of that row
                    Cell cell15 = row15.createCell(cellnum15++);

                    if (obj15 instanceof String)
                        cell15.setCellValue((String) obj15);

                    else if (obj15 instanceof Integer)
                        cell15.setCellValue((Integer) obj15);
                }
            }

            // Try block to check for exceptions
            try {

                // Writing the workbook
                FileOutputStream out = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s01_create.xlsx"));
                workbook.write(out);


                FileOutputStream out1 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_complete/s01_AM_create.xlsx"));
                workbook1.write(out1);
                FileOutputStream out2 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s02_AM_complete.xlsx"));
                workbook2.write(out2);

                FileOutputStream out3 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_update/s01_AM_Create.xlsx"));
                workbook3.write(out3);

                FileOutputStream out4 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_update/s02_AM_Complete.xlsx"));
                workbook3.write(out4);

                FileOutputStream out5 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s03_AM_update.xlsx"));
                workbook3.write(out5);

                FileOutputStream out6 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s04_BM_Create.xlsx"));
                workbook5.write(out6);

                FileOutputStream out66 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_complete/s04_BM_creates.xlsx"));
                workbook6.write(out66);

                FileOutputStream BMComplete = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s05_BM_Complete.xlsx"));
                workbook6.write(BMComplete);

                FileOutputStream out7 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_update/s04_BM_Creates.xlsx"));
                workbook7.write(out7);

                FileOutputStream BMcompletes = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_update/s05_BM_Completes.xlsx"));
                workbook7.write(BMcompletes);

                FileOutputStream BMupdate = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s06_BM_Update.xlsx"));
                workbook7.write(BMupdate);

                FileOutputStream out8 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s07_issue_create.xlsx"));
                workbook8.write(out8);

                FileOutputStream s09 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_complete/s07_issue_create.xlsx"));
                workbook9.write(s09);

                FileOutputStream s09completes = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s08_issues_complete.xlsx"));
                workbook9.write(s09completes);

                FileOutputStream s10 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_update/s07_issues_creates.xlsx"));
                workbook10.write(s10);

                FileOutputStream s10update = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_update/s08_issue_complete.xlsx"));
                workbook10.write(s10update);

                FileOutputStream s10updates = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s09_issue_update.xlsx"));
                workbook10.write(s10updates);

                FileOutputStream s11 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s10_institute_create.xlsx"));
                workbook11.write(s11);

                FileOutputStream s12 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_complete/s10_institute_create.xlsx"));
                workbook12.write(s12);

                FileOutputStream s13 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s11_institute_complete.xlsx"));
                workbook12.write(s13);

                FileOutputStream s14 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s12_shareclass_create.xlsx"));
                workbook13.write(s14);

                FileOutputStream s15 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_complete/s12_shareclass_create.xlsx"));
                workbook14.write(s15);

                FileOutputStream s16 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s12_shareclass_complete.xlsx"));
                workbook14.write(s16);

                FileOutputStream s17 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_update/s12_shareclass_create.xlsx"));
                workbook15.write(s17);

                FileOutputStream s18 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/Datasetup_update/s12_shareclass_complete.xlsx"));
                workbook15.write(s18);

                FileOutputStream s19 = new FileOutputStream(
                        new File("/Users/manivannanpanneerselvam/Downloads/s14_sc_update.xlsx"));
                workbook15.write(s19);

//                    FileOutputStream BMComplete = new FileOutputStream(
//                            new File("/Users/manivannanpanneerselvam/Downloads/Book11.csv"));
//                    workbook6.write(BMComplete);
                // Closing file output connections
                // out.close();
                out1.close();
                out2.close();
                out3.close();
                out4.close();
                out5.close();
                out6.close();
                out66.close();
                BMComplete.close();
                out7.close();
                BMcompletes.close();
                BMupdate.close();
                s09.close();
                s09completes.close();
                s10.close();
                s10update.close();
                s10updates.close();
                s11.close();
                s12.close();

                // Console message for successful execution of
                // program
                System.out.println(
                        "gfgcontribute.xlsx written successfully on disk.");
            }

            // Catch block to handle exceptions
            catch (Exception e) {

                // Display exceptions along with line number
                // using printStackTrace() method
                e.printStackTrace();
            }
        }
    }
}

