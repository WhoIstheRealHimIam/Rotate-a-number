import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = sc.nextInt();

        int number = num;
        int reverse = 0;

        while (number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        
        System.out.println("the reverse of " + num + " is: " + reverse);
        sc.close();
    }

}