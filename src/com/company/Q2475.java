package com.company;

import java.util.Scanner;

/**
 * Created by nameuk on 7/12/17.
 */
public class Q2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int j = 0, sum = 0;
        for (int i = 0; i < 5; i++) {
            j = sc.nextInt();
            arr[i] = j*j;
            sum+= arr[i];
        }
        System.out.println(sum%10);

    }
}
