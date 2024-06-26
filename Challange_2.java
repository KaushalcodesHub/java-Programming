import java.util.Scanner;

public class Challange_2 {
    public static void main(String[] args) {
        /*write a program to  take two number and arithmatic operation on two number*/
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.print("enter your name ");
        String name = input.nextLine();
        System.out.print("enter first number ");
        int num1= input.nextInt();
        System.out.print("enter second number ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of the number is " +sum);
        System.out.println("the substraction of the number is : " +(num1-num2));
        System.out.println("the multiplication of the given number is : " +(num1*num2));
        System.out.println("the remainder of the given number is  " +(num1%num2));
        //challange 2
        // input name from user and print  hello name welcome name my unicorn company
       // System.out.print("enter your name ");
       // String name = input.nextLine();
        System.out.println("hello "+ name);
        System.out.println("Welcome "+ name + " join My Unicorn company ");



    }

}
