import java.util.Scanner;

 public class Challange5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 1 for area of triangle ");
        System.out.println("Enter 2 for simple interest ");
        System.out.println("Enter 3 for compound interest ");
        System.out.println("Enter 4 for convert the Temperature fahrenheit to celsius ");
        int a= input.nextInt();
        switch(a)
        {
            case 1:
            {
                System.out.print("Enter the length of the triangle : ");
                float length = input.nextFloat();
                System.out.print("Enter the breadth of the triangle : ");
                float breath = input.nextFloat();
                float area = 0.5f*length*breath;
                System.out.print("Area of the triangle is :  " +area);
                break;
            }
            case 2:{
                System.out.print("Enter the principal amount of the money Rs ");
                int principal_amount = input.nextInt();
                System.out.print("Enter the rate of interest per year is :  ");
                float rate = input.nextFloat();
                System.out.print("Enter the time of the money invest :  ");
                int time = input.nextInt();
                float simple_interest = (principal_amount*rate*time)/100f ;
                System.out.print("The simple interest is :  " + simple_interest);
                break;
            }
            case 3:{
                System.out.print("Enter the principal amount of money  :");
                int principal_amount = input.nextInt();
                System.out.print("Enter the rate of interest per year : ");
                float rate = input.nextFloat();
                System.out.print("Enter the time of money invested in year : ");
                int time= input.nextInt();
                double compound_interest = principal_amount* Math.pow((1+rate/100),time);
                System.out.print("The compound interest is  :  " +compound_interest);
                break;
            }
            case 4:{
                System.out.print("Enter the Temperature in fahrenheit  is :  ");
                float temp = input.nextFloat();
                float celsius = temp-273;
                System.out.print("Ehe temperature in celsius is  :  " + celsius);
                break;
            }
            default:
            {
                System.out.println("ERROR.......... ");
                System.out.println("Please check the value.....");
                System.out.println("Please check the value.....");
                break;
            }

        }

    }
}
