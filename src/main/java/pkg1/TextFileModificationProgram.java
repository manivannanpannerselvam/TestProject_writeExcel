package pkg1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TextFileModificationProgram {

    static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);

        String oldContent = "";

        BufferedReader reader = null;

        FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            //Reading all the lines of input text file into oldContent

            String line = reader.readLine();

            while (line != null)
            {
                oldContent = oldContent + line + System.lineSeparator();

                line = reader.readLine();
            }

            //Replacing oldString with newString in the oldContent

            String newContent = oldContent.replaceAll(oldString, newString);

            //Rewriting the input text file with newContent

            writer = new FileWriter(fileToBeModified);

            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources

                reader.close();

                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

        String date = sdf.format(new Date());
        System.out.println(date);


        String dt = date;  // Start date
        SimpleDateFormat sdfs = new SimpleDateFormat("dd-MMM-yyyy");
        Calendar c = Calendar.getInstance();
       // c.setTime(sdfs.parse(dt));
       // c.add(Calendar.DATE, 1);
        c.add(Calendar.MONTH, 1);// number of days to add
        c.add(Calendar.YEAR, 1);// number of days to add
        dt = sdf.format(c.getTime());
        System.out.println(dt);

        modifyFile("/Users/manivannanpanneerselvam/Downloads/learning-spark-with-java-master/target/test1.txt", "18-Jul-2022", dt);
       // modifyFile("/Users/manivannanpanneerselvam/Downloads/s02_AM_complete.xlsx", dt, date);
        System.out.println("done");
    }
}
