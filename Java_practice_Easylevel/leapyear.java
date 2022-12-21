package tutorial;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        if (a%4==0){
            System.out.println("is leap year");

        }else{
            System.out.println("not leap year");
        }
    }
}
