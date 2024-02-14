import java.util.Scanner;
public class IncomeTax_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: Rs ");
        double income = sc.nextDouble();
        double tax;

        if (income<750000){
            tax = 0.1* income;
            System.out.println("10% tax you will have to pay");
        }
        
        else{
            tax = 0.3 * income;
            System.out.println("30% tax you will pay");
        }

        System.out.println("Your tax is = Rs " + tax);
    }
}
        
    



