import java.util.Scanner;

public class ExampleTryCatch {
    public static void main( String[] args ) {
        int tab[] = {1,2,3,4,5};
        Scanner odczyt = new Scanner(System.in);
        int index = -1;

        System.out.println("Specify index of the array: ");
        index = odczyt.nextInt();
//        Zastosowanie bloku try catch spowoduje ze program nie zostanie zatrzymany.
//        Bo opsłużyliśmy wyjątek - czyli nietypowe/ nieprawdiłowe działanie programu.
        try {
            System.out.println(tab[index]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Provided index is out of bounds. Size of the array: " + tab.length);
        }
        System.out.println("End of the program.");
    }

}
