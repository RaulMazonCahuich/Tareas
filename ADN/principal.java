package ADN;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        adnDoubleStrand Lista = new adnDoubleStrand();

        Lista.insertAtFront('A');
        Lista.insetAtPos('T',1);
        Lista.insetAtPos('C',2);
        Lista.insetAtPos('G',3);

        System.out.println(Lista.toString());

        Lista.ADN(0);
        Lista.ADN(2);
        Lista.ADN(4);


        System.out.println(Lista.toString());
    }
    
}
