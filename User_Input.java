import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //it is bacially object deceleration/initialization
        System.out.print("enter your name:");
        String name = input.nextLine();
        System.out.println("Good morning " + name);
        System.out.println(name + " also tell me your age");
        int age = input.nextInt();
        System.out.println("your age is : " +age);
    }
}

