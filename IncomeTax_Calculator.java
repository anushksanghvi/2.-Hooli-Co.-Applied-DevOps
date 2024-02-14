import java.util.Scanner;
public class IncomeTax_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: Rs ");
        double income = sc.nextDouble();
        double tax;

        if (income<500000){
            tax = 0;
            System.out.println("0% tax you will have to pay");
        }
        else if (income>=500000 && income<1000000){
            tax = 0.2 * income;
            System.out.println("20% tax you will pay");
        } 
        else{
            tax = 0.3 * income;
            System.out.println("30% tax you will pay");
        }

        System.out.println("Your tax is = Rs " + tax);
    }
}