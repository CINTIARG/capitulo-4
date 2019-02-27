
package Principal4;

import chapter4.FormLetterWriter;

public class Principal_Letter {
    public static void main (String [] args){
    FormLetterWriter fw = new FormLetterWriter();
        System.out.println(fw.displaySalutation("Sosa"));
        System.out.println(fw.displaySalutation("Sosa","Miguel"));
}
}
