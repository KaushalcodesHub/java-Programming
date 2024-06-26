import java.util.Scanner;
//wap to input the whole class number and convert it into percentage if according to percentage given a grade

public class MahaChallenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total;
        System.out.print("enter the number of student in the class : ");
        int num= input.nextInt();

        for (int i = 1; i <=num ; i++) {
            System.out.println("enter the name of the "+i+" student ");
            String name = input.nextLine();
            System.out.print("enter the marks of the subject Hindi : ");
            int hindi= input.nextInt();
            System.out.print("enter the marks of the subject Math : ");
            int math= input.nextInt();
            System.out.print("enter the marks of the subject Physics : ");
            int physics= input.nextInt();
            System.out.print("enter the marks of the subject Chemistry : ");
            int chemistry= input.nextInt();
            System.out.print("enter the marks of the subject Computer/English : ");
            int computer= input.nextInt();
            total =(hindi+math+physics+chemistry+computer)*100/500f;
            System.out.println("you got " + total + "%");
            if (total >=90) {
                System.out.println("Amazing you got a A grade");
                System.out.println("Well done");
            }
                else if (total>=75){
                System.out.println("Good you got B grade");
                System.out.println("i hope next time you will try harder");
            }
                else if (total>=60){
                System.out.println("you got a c grade");
                System.out.println("you push up again and again");
                System.out.println("Try some extra efforts");
            }
                else if (total>=45){
                System.out.println(" you got D grade");
                System.out.println("you got more and more practice ");
                System.out.println("next time you will definitely failed ");
            } else if (total>=35) {
                System.out.println(" you got D grade");
                System.out.println("only pass");
                System.out.println(" Go to principle office with taking report card");
                }
                else {
                System.out.println("You are fail ....");
                System.out.println("call your parents right now..");
                System.out.println("beta pad le abhi bhi time hai ");

            }

        }


        }
    }

