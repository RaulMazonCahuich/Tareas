package ADN;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        adnDoubleStrand Lista = new adnDoubleStrand();

        Lista.insertAtFront('A');
        Lista.insertAtPos('T',1);
        Lista.insertAtPos('C',2);
        Lista.insertAtPos('G',3);

        System.out.println(Lista.toString());

        Lista.ADN(0);
        Lista.ADN(2);



        System.out.println(Lista.toString());
    }
    
}
