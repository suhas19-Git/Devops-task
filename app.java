
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello! Naan sum calculator");
        System.out.print("Ondu number enter madu: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Inno number enter madu: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        System.out.println("Sum = " + sum);
        
        scanner.close();
    }
}
