import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    System.out.print("Formula: Second number - First number \n Enter your first number :");
    int num1 = input.nextInt();

        System.out.print("Enter your second number :");
    int num2 = input.nextInt();

    int resuts = num2 - num1;

        System.out.println("your answer is "+resuts);
    }
}