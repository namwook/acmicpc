package com.company;

import java.util.Scanner;

public class Q1003 {
    // public static int Cnt[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int f0[] = new int[41];
        int f1[] = new int[41];
        f0[0] = 1;
        f0[1] = 0;
        f1[0] = 0;
        f1[1] = 1;
        while (true) {
            int n = sc.nextInt();
            System.out.print( fibonacci0(n, f0) + " " +  fibonacci1(n, f1) +" ");
            t--;
            if (t == 0) break;
        }
        sc.close();
    }

    public static int fibonacci0(int n, int f0[]) {
        if (n == 0) {
            return f0[n];
        } else if (n == 1) {
            return f0[n];
        } else {
            if (f0[n] == 0) {
                f0[n] = fibonacci0(n-1, f0) + fibonacci0(n-2, f0);
                return f0[n];
            } else {
                return f0[n];
            }
        }
    }
    public static int fibonacci1(int n, int f1[]) {
        if (n == 0) {
            return f1[n];
        } else if (n == 1) {
            return f1[n];
        } else {
            if (f1[n] == 0) {
                f1[n] = fibonacci1(n-1, f1)+fibonacci1(n-2, f1);
                return f1[n];
            } else {
                return f1[n];
            }
        }
    }
}
