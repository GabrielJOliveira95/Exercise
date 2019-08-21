
package installments;

import java.util.Date;


public interface TaxService {
    
    void tax(double totalValue, int installments, String date);
    
}
