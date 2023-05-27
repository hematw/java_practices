
package codeunity;

import java.util.Scanner;
/**
 *
 * @author Who Am I
 */
public class Calc {
    
    public static void calc(){ 
        Scanner in = new Scanner(System.in);
        System.out.println("1.ARITHMATIC OPERATORS\n2.LOGICAL OPERATORS\n3.RELATIONAL OPERATORS\n\t\t\nPlease select one option: "); //Main menu 
        int choice = in.nextInt(); 
        int a,b,c; 
        switch(choice) //Main switch case 
        {
           
            case 1 : //arithmatic operators 
                System.out.println("Enter numbers: ");
                a = in.nextInt();
                b = in.nextInt();
                System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nVALUES OF a AND b ARE 10 AND 5 RESPECTIVELY\n\t\t\n"); 
                int aChoice=in.nextInt(); 
                switch(aChoice)       //Nested switch case 
                    {
                        case 1:                     //addition 
                            c=a+b; 
                            System.out.println("Addtion of a and b is "+ c +"\n"); 
                        break; 
                        case 2:                 //subtraction 
                            c=a-b; 
                            System.out.println("Subtraction of a and b is "+ c +"\n"); 
                        break; 

                        case 3:                 //Multiplication 
                            c=a*b; 
                            System.out.println("Multiplication of a and b is "+ 
                                c+"\n"); 
                        break; 
                        case 4:                  //division 
                            c=a/b; 
                            System.out.println("Divisiom of a and b is "+ c+"\n"); 
                        break; 
                        default: 
                            System.out.println("Please enter right choice"); 
                            }
            break; 
            case 2 : //logical operator 
                System.out.println("1.Logical AND\n2.Logical OR\n3.NOT Operator\n"); 

                int lchoice=in.nextInt(); 
                switch(lchoice) 
                {
                    case 1: // AND operator 
                        System.out.println("Enter your age: ");
                        int age=in.nextInt(); 
                        if(age>18 && age<50) 
                            System.out.println("(AGE=25)\nYou are eligible for this job.\n"); 
                            break; 
                    case 2: //0r operator 
                        System.out.println("Enter the salary: ");
                        int salary=in.nextInt(); 
                        if(salary<5000 || salary>2000) 
                            System.out.println("(SALARY=3000)\n The job is offordable.\n"); 
                        break; 
                    case 3: //not operator 
                        System.out.println("Enter your age: ");
                        int Age=in.nextInt(); 

                        if(Age!=18 || Age>18) 
                        System.out.println("(Age=20)\nYou are not eligible for voting\n"); 
                    break; 
                    default: 
                    System.out.println("Please enter right choice"); 
            }
            break; 
            case 3: //Relational operator 
                System.out.println("1.Greater than operator\n2.Less than operator\n3.Greater than or equal operator\n4.Lessthan or equal operator\n"); 
                
                int lChoice=in.nextInt(); 
                switch(lChoice) 
                {
                    case 1: //greater than operator 
                    System.out.println("Enter your age: ");
                    int aage=in.nextInt(); 
                    if(aage > 18) 
                    System.out.println("(Age=20) You are eligible for having a driving licens"); 
                    break; 
                    case 2: //less than operator 
                        System.out.println("Enter your age: ");
                        int A=in.nextInt(); 
                        if(A < 18) 
                        System.out.println("(Age=10) You are not eligible for having a driving licens"); 
                    break; 
                    case 3: //greater than equal to 
                    System.out.println("Enter your age: ");
                    int p=in.nextInt(); 
                    if(p >= 18) 
                    System.out.println("(Age=18) You are eligible for having a driving licens"); 
                    break; 

                    case 4: //less than or equal to 
                    System.out.println("Enter your age: ");
                    int q=in.nextInt(); 
                    if(q <= 18) 
                    System.out.println("(Age=13) You are not eligible for having a driving licens"); 
                    break; 
                    default: 
                    System.out.println("Please enter right choice"); 
                    }
            break; 
            default: 
            System.out.println("Please enter right choice"); 
            
            }
            in.close();
}
} 

