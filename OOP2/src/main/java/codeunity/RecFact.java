
package codeunity;

/**
 *
 * @author Who Am I
 */
public class RecFact {
    static int factorial(int x){
    
        if(x>1){
            return x*factorial(x-1);
        }
        else {
            return 1;
        }
        
    }
    
    
}
