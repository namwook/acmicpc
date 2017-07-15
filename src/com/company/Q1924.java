package com.company;

import java.util.Scanner;

/**
 * Created by nameuk on 17. 6. 29.
 */
public class Q1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        switch (m){
            case 1:
                System.out.println(day[d%7]);
                break;
            case 2:
                System.out.println(day[((31*1)+d)%7]);
                break;
            case 3:
                System.out.println(day[((31*1)+(28*1)+(30*0)+d)%7]);
                break;
            case 4:
                System.out.println(day[((31*2)+(28*1)+(30*0)+d)%7]);
                break;
            case 5:
                System.out.println(day[((31*2)+(28*1)+(30*1)+d)%7]);
                break;
            case 6:
                System.out.println(day[((31*3)+(28*1)+(30*1)+d)%7]);
                break;
            case 7:
                System.out.println(day[((31*3)+(28*1)+(30*2)+d)%7]);
                break;
            case 8:
                System.out.println(day[((31*4)+(28*1)+(30*2)+d)%7]);
                break;
            case 9:
                System.out.println(day[((31*5)+(28*1)+(30*2)+d)%7]);
                break;
            case 10:
                System.out.println(day[((31*5)+(28*1)+(30*3)+d)%7]);
                break;
            case 11:
                System.out.println(day[((31*6)+(28*1)+(30*3)+d)%7]);
                break;
            case 12:
                System.out.println(day[((31*6)+(28*1)+(30*4)+d)%7]);
                break;
            default:
        }
    }
}
