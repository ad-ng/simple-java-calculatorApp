import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the adn calculator app");
        System.out.println("type: 1 for addition");
        System.out.println("type: 2 for subtraction");
        System.out.println("type: 3 for multiplication");
        System.out.println("type: 4 for division");
        String sign = scanner.nextLine();
        System.out.println("you have typed:" +sign);
        
    }
}
