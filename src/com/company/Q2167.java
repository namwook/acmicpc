package com.company;

import java.util.Scanner;

/**
 * Created by nameu on 2017-07-21.
 */
public class Q2167 {
    public static int arr[];
    public static int n, m;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[301 * 301];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i * m + j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.println(sum(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

    }

    public static int sum(int i, int j, int x, int y) {
        int temp = 0;
        for (int k = (i - 1) * m + (j - 1); k <= (x - 1) * m + (y - 1); k++) {
            System.out.println("is "+k);
            temp += arr[k];
        }
        return temp;
    }

}
