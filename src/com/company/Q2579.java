package com.company;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;*/

import java.util.Scanner;

/**
 * Created by nameu on 2017-07-18.
 */
public class Q2579 {
    public static int dp[];
    public static int arr[];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
/*
        int n = sc.nextInt();
        arr = new int[n + 1];
        dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(stairs(n - 1, 2));*/

    }


    public static int stairs(int index, int c) {
        int fst, snd, snd1, snd2;
        fst = snd = snd1 = snd2 = 0;
        if (index == 1) {
            if (c == 1) return dp[index] = arr[1];
            else return dp[index] = arr[1] + dp[0];
        } else if (index == 0) return dp[0];
        if (c == 1) {
            fst = arr[index] + (dp[index - 2] == 0 ? stairs(index - 2, 2) : dp[index - 2]);
        } else {
            snd1 = arr[index] + (dp[index - 1] == 0 ? stairs(index - 1, 1) : dp[index - 1]);
            snd2 = arr[index] + (dp[index - 2] == 0 ? stairs(index - 2, 2) : dp[index - 2]);
            snd = snd1 > snd2 ? snd1 : snd2;
        }
        return dp[index] = fst > snd ? fst : snd;
    }
}

/*public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[];
        input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int arr[] = new int[n];
        dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i + 1]);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        dp[0] = arr[n - 1];

        stair(n);

    }*/