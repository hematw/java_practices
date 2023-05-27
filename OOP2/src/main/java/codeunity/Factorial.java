
package codeunity;

import java.util.Scanner;

/**
 *
 * @author Who Am I
 */
public class Factorial {
    public static void fact() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number to calculate factorial: ");
        int num = in.nextInt();

        long f = 1;
        for (int i = 1; num >= 1; num--) {
            f = f * num;
        }
        System.out.println("factorial: " + f);
        in.close();
    }

    public static void factRet(int num) {
        long result = 1;

        for (int i = 1; num >= i; i++) {
            result *= i;
        }

        System.out.println("factorial of " + num + ": " + result);
        
    }
    
}
