/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        
        
        if (n <= 0) {
            System.out.println("Please enter a number greater than zero");
        } else if (n == 1) {
             
               System.out.println("0");
        } else {
            
            int num1 = 0, num2 = 1;

            System.out.print(num1 + ", " + num2);

            
            for (int i = 2; i < n; i++) {
                int nextNum = num1 + num2; 
                System.out.print(", " + nextNum);
                num1 = num2;
                num2 = nextNum; 
           
        }

        
        scanner.close();
    }
}}
