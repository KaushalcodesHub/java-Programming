import java.util.Scanner;

public class Challange4 {
    public static void main(String[] args) {
        //create a program to calculate the product of two numbers
        Scanner input = new Scanner(System.in);
        System.out.println("enter first floating number ");
       float num1= input.nextFloat();
        System.out.println("enter second number ");
        float num2= input.nextFloat();
        System.out.println("the sum of the number is "+(num1+num2));
        System.out.println("the substraction of the number is "+(num1-num2));
        System.out.println("the multiplication of the number is "+(num1*num2));
        System.out.println("the division of the number is "+(num1/num2));
        System.out.println("the remainder of the number is "+(num1%num2));
    }
}
