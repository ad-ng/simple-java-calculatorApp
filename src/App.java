import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // initializing scanner so that we can receive input from user
        Scanner scanner = new Scanner(System.in);

        /*
         * welcoming user and prompting him to know which task we gonna perform
        */
        System.out.println("welcome to the adn calculator app");

        //reading first number
        System.out.println("enter the first number");
        float firstNumber = scanner.nextFloat();
        
        //reading the sign
        System.out.println("enter the sign");
        String sign = scanner.next();

        //reading second number
        System.out.println("enter the second number");
        float secondNumber = scanner.nextFloat();
        

        if (sign.equals("+")) {
            System.out.println(calculator.addition(firstNumber, secondNumber));
        }

        if(sign.equals("-")) {
            System.out.println(calculator.subtraction(firstNumber, secondNumber));
        }

        if (sign.equals("x")) {
            System.out.println(calculator.multiplication(firstNumber, secondNumber));
        }

        scanner.close();
    }
}
