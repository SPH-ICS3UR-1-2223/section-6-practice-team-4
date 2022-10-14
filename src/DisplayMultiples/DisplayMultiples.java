package DisplayMultiples;
import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
    	Scanner in =  new Scanner(System.in);
    	System.out.println("Guess the secret number");
    	int number = in.nextInt();
    	for (int counter=1;counter<=12;counter++) {
    		System.out.println(number+" * "+counter+" = "+(number*counter));
    	}
//    System.out.println(number + "* 1");
//    System.out.println(number + "* 2");
//    System.out.println(number);
//    System.out.println(number);
//    System.out.println();
//    System.out.println();
//    System.out.println();
//    System.out.println();
//    System.out.println();
//    System.out.println();
//    System.out.println();
//    System.out.println();
//    System.out.println();
    }

}
