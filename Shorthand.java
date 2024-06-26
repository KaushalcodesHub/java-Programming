import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= 50;
        System.out.print("enter first number ");
        int a1= input.nextInt();
        a+=a1;
        System.out.println("addition is  "+a);
        System.out.print("enter second number ");
        int a2= input.nextInt();
        a+=a2;
        System.out.println("addition is  "+a);
        System.out.print("enter third number ");
        int a3 = input.nextInt();
        a+=a3;
        System.out.println("addition is  "+a);
        System.out.print("enter fourth number ");
        int a4= input.nextInt();
        a+=a4;
        System.out.println("addition is  "+a);

    }
}
