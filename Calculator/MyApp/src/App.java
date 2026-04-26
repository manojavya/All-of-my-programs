import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("V.1.0.0");
        System.out.println("Type help for information about this app or type exit to close the app or type c to continue");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("help")){
            System.out.println("This app is a simple calculator that can add, subtract, multiply, and divide numbers.");
            System.out.println("To use this app, type the first number, then the operator, then the second number.");
            System.out.println("For example, to add 2 and 3, type 2 + 3.");
            System.out.println("The operators are + for addition, - for subtraction, * for multiplication, and / for division.");
            System.out.println("Type exit to close the app or type c to continue");
            input = scanner.nextLine();
        }
        if(input.equals("c")){
            while(true){
                System.out.println("Enter the first number:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the operator:");
                String operator = scanner.next();
                System.out.println("Enter the second number:");
                double num2 = scanner.nextDouble();
                double result = 0;
                if(operator.equals("+")){
                    result = num1 + num2;
                }else if(operator.equals("-")){
                    result = num1 - num2;
                }else if(operator.equals("*")){
                    result = num1 * num2;
                }else if(operator.equals("/")){
                    result = num1 / num2;
                }else{
                    System.out.println("Invalid operator");
                }
                System.out.println("Result: " + result);
                System.out.println("Type exit to close the app or type c to continue");
                input = scanner.next();
                if(input.equals("exit")){
                    System.exit(1);
                }
            }
        } 
    }
}
