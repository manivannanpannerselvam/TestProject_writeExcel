package pkg1;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class sample1 {

    public static void main(String args[])
    {
        System.out.println("JAVA");

        SimpleDateFormat formatDate = new SimpleDateFormat(
                "yyyy-MM-dd-hh:mm");

        Date date = new Date();
        formatDate.setTimeZone(TimeZone.getTimeZone("sg"));
        System.out.println(formatDate.format(date));

        System.out.println(LocalDateTime.now());
        String str =String.valueOf(LocalDateTime.now());
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        for (int i = 1; i < 10; i++) {
            
        }

//        int x, y, sum;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        x = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        y = sc.nextInt();
//        sum = x+y;
//        System.out.println("The sum of two numbers x and y is: " + sum);
        String w = args[0];
//        int x = Integer.parseInt(args[0]); //first arguments
//        int y = Integer.parseInt(args[1]); //second arguments
//        int sum = x + y;
        System.out.println("The sum of x and y is: " +w);

    }
}
