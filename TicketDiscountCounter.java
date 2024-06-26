import java.util.Scanner;

public class TicketDiscountCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to ticket discount calculator ");
        System.out.print("Enter the amount of the Ticket : ");
        int amount= input.nextInt();
        System.out.println("enter your name : ");
        String name = input.nextLine();
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        System.out.print("enter your gender M/F/O ??: ");
        char Gender = input.nextLine().charAt(0);

        if(age<5){
            System.out.println("wow You got a 75% Discount");
            int paid = (amount *25)/100;
            System.out.println("you paid only "+paid+" rupees");
        } else if (Gender=='f'&& age<60) {
            System.out.println("wow you got 50% Discount ");
            int paid = (50*amount)/100;
            System.out.println("you paid only "+ paid+ " rupees");

        } else if (age<60 && Gender=='f') {
            System.out.println("wow you got a 25% discount ");
            int paid = (amount * 75) / 100;
            System.out.println("you paid only " + paid + "rupees ");
        }
            else
            {
                System.out.println(" wow you got 85% Discount ");
                int paid = (amount*15)/100;
                System.out.println("you paid only "+paid+"rupees ");
            }
        System.out.println("Thank you for using the calculator ");

        }


    }
