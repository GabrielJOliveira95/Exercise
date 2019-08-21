
package installments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Installments {

   
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        Date calendar = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        
        System.out.println("-----Contract Value----");
        System.out.print("Contract date (dd/mm/yyy) ");
        calendar = sdf.parse(keyboard.next());
        String calendarString = sdf.format(calendar);
        
        System.out.print("Contract number: ");
        int cn = keyboard.nextInt();
        
        System.out.print("Contract value: ");
        double value = keyboard.nextDouble();
        
        System.out.print("Number of installments: ");
        int installments = keyboard.nextInt();
        System.out.println("");
        
        InstallmentsClass cv = new InstallmentsClass(cn, value, calendarString, new TaxClass());
        cv.installments(cv.getInstallmentsValue(), installments, cv.getCalendar());
    
        
        
        
        
        
       
     
        
    }
    
}
