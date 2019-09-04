import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args){
        int num1, num2, sum, product, average ;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        num1  = input.nextInt();

        System.out.println("Enter the second number");
        num2 = input.nextInt();
        sum = num1 + num2;
        product = num1* num2;

        if (sum > 200){
            System.out.println("The sum of the entered number is * " + sum +".");
        }else{
            System.out.println("The sum of the entered number is " + sum + ".");
        }
        System.out.println("The product of the entered numbers is " + product + ".");
        System.out.println("The average of the eneterd numbers is " + product/2 );

    }
}
