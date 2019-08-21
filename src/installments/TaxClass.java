/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package installments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaxClass implements TaxService {

    @Override
    public void tax(double total_value, int x, String date) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        Date date2 = new Date();
        
        try {
            date2 = sdf.parse(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date2);
         
            double resultado = total_value / x;
            double resultadofinal;

            for(int y =1; y <= x; y++){
        
            calendar.add(Calendar.MONTH, + 1);
            date2 = calendar.getTime();
            double tax = resultado * y /100;
            double tax2 = resultado * 0.02;
            resultadofinal = resultado + tax + tax2;
            System.out.printf("Installment N°" + y + " " + sdf.format(date2) + " " + "%.2f", resultadofinal);
            System.out.println("\n");

            
            }
        } catch (ParseException ex) {
            Logger.getLogger(TaxClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
               
                    
        
    
   }

}
