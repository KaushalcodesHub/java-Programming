import java.util.Scanner;

public class Swapping_Numbers {
    public static void main(String[] args) {

        //Write a program to swap two number


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station ");
        System.out.print("please enter first number  ");
        int num1 = input.nextInt();
        System.out.print("please enter second number  ");
        int num2 = input.nextInt();
        System.out.println("before swapping numbers  : ");
        System.out.println("first number : " +num1);
        System.out.println("second number : " +num2);
// note : Modulus operator use only for integer
            int swap;
            swap= num1;
            num1=num2;
            num2=swap;

        System.out.println("After Swapping Numbers ");
        System.out.println(" first num : " +num1);
        System.out.println(" second num : " +num2);
    }
}
