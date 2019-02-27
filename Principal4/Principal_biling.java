
package Principal4;

import chapter4.Billing;


public class Principal_biling {
    public static void main (String [] args){
    Billing b=new Billing();
        System.out.println(b.computeBill(10));
        System.out.println(b.computeBill(10,2));
        System.out.println(b.computeBill(10,2,3));
}
}
