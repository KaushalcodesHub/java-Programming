import java.util.Scanner;
//WAP to determine the greatest number of three number

public class Greatest_of_three_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the all three number : ");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        if (num1>=num2 && num1>=num3){
            System.out.println(num1+ " is a greatest number ");
        } else if (num2>=num1&&num2>=num3) {
            System.out.println(num2 + " is a greatest number ");
        }
            else{
                System.out.println(num3+" is a greatest number ");
            }

        }
    }

