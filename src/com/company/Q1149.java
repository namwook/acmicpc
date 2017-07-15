package com.company;

import java.util.Scanner;

/**
 * Created by nameuk on 6/29/17.
 */
public class Q1149 {
    public static int dp[][];
    public static int rgb[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n][3];
        rgb = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                rgb[i][j] = sc.nextInt();
                System.out.print(rgb[i][j] + " ");
            }
            System.out.println();
        }
        dp[n - 1][0] = rgb[n - 1][0]; // r
        dp[n - 1][1] = rgb[n - 1][1]; // g
        dp[n - 1][2] = rgb[n - 1][2]; // b


        System.out.println(Math.min(distance(0, 0), Math.min(distance(0, 1), distance(0, 2))));

    }

    public static int distance(int index, int color) {
        int color1 = (color + 1) % 3;
        int color2 = (color + 2) % 3;


        int price1 = rgb[index][color] + (dp[index + 1][color1] != 0 ? dp[index + 1][color1] : distance(index + 1, color1));
        int price2 = rgb[index][color] + (dp[index + 1][color2] != 0 ? dp[index + 1][color2] : distance(index + 1, color2));

        return dp[index][color] = Math.min(price1, price2);
    }
}
