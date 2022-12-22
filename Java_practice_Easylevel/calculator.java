package tutorial;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        int a;
        int b;
        char ch;
        System.out.println("enter the 1st number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("choose the opertion = +,-,*,/");
        ch = sc.next().charAt(0);
        System.out.println("enter the 2nd number");
        b = sc.nextInt();
        switch (ch){
            case '+':{
                System.out.println("addtion of two number is =" + (a + b));
                break;
            }
            case '-':{
                System.out.println("subtraction of two number is =" + (a - b));
                break;
            }
            case '*':{
                System.out.println("multiplication of two number is =" +(a * b));
                break;
            }
            case '/':{
                System.out.println("division of two number is =" + (a / b));
                break;

            }
            default:{
                System.out.println("invalid");


                }
            }


        }
    }

