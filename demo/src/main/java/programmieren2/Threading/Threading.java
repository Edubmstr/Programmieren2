package programmieren2.Threading;

import java.io.Console;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Threading {

    public static String format = "24";
    static Date date;

    public static void main(String[] args){

        Console console = System.console();
        Scanner scanner = new Scanner(System.in);
        

        DateFormat dateFormat12 = new SimpleDateFormat("hh:mm:ss a");
        DateFormat dateFormat24 = new SimpleDateFormat("HH:mm:ss");
        

        //Instant instant = Instant.now();


        
        Thread thread1 = new Thread(() -> {
            while(true){
                var now = LocalDateTime.now();
                var nowH = LocalDateTime.now();
                date = new Date(System.currentTimeMillis());

                //System.out.println(now);
                switch(format){
                    case "24":
                        System.out.println(dateFormat24.format(date));
                        break;
                    case "12":
                        System.out.println(dateFormat12.format(date));
                        break;
                    default:
                        System.out.println(dateFormat24.format(date));
                }

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        while(true){
            
            format = scanner.nextLine();


        }
        //scanner.close();
    }

}
