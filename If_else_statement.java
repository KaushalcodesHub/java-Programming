import java.util.Scanner;

public class If_else_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the age of the candidate :  ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("you are eligible for the vote ");
            System.out.println("thank you");
        } else if (age>=10) {
            System.out.println("you are not eligible for the vote ");
            int remainAge = 18-age;
            System.out.println("waiting for "+ remainAge + " years");
            System.out.println("thank you ");
        }
        else {
            System.out.println("Beta tum abhi cycle chalao ");
        }

    }
}
