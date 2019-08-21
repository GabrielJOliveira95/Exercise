
package installments;

import java.util.Date;



public class InstallmentsClass{
    
    private double totalValue;
    private int contract_number;
    private String calendar;
    private TaxService taxclass;
    private int installments;
    
    public InstallmentsClass(){}

    public InstallmentsClass(int contract_number, double totalValue, String calendar, TaxService taxclass) {
        this.totalValue = totalValue;
        this.contract_number = contract_number;
        this.calendar = calendar;
        this.taxclass = taxclass;
        
    }

    public double getInstallmentsValue() {
        return totalValue;
    }

    public void setInstallmentsValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public int getContract_number() {
        return contract_number;
    }

    public void setContract_number(int contract_number) {
        this.contract_number = contract_number;
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    public TaxService getTaxclass() {
        return taxclass;
    }

    public void setTaxclass(TaxService taxclass) {
        this.taxclass = taxclass;
    }

   

    public void installments(double totalValue, int x, String date){
        
        taxclass.tax(totalValue, x, date);
        
    }
   
  

}
