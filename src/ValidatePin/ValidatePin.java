package ValidatePin;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
    	Scanner in =  new Scanner(System.in);
    	int secretNumber = 13;
    	System.out.println("INSERT PIN");
    	int guess =  in.nextInt();
    	while (guess!=secretNumber) {
    		System.out.println("WRONG");
    		guess = in.nextInt();
    	}
    	
    	System.out.println("CORRECT");
    }
}
