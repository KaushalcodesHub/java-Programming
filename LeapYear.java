import java.util.Scanner;
//WAP to determine the given year is leap year or not

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year you want to check: ");
        int year = input.nextInt();
       if(year%400==0){
           System.out.println(year+" is leap year ");
       }
           else if (year%4==0 && year%100!=0){
               System.out.println(year+" is a leap year ");
           }
           else {
           System.out.println(year+" is not a leap year ");
       }

       }

    }

