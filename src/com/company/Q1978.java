package com.company;

import java.util.Scanner;

/**
 * Created by nameuk on 7/3/17.
 */
public class Q1978 {
    public static void main(String[] args) {
        int prime[] = new int[1001];

        for (int i = 2; i < 1001; i++) {
            for (int j = 2; j <= i; j++) {
                if (i%j == 0) {
                    if (j==i) prime[i] = -1;
                    else break;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int Cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            for (int j = 0; j < prime.length; j++) {
                if (prime[j] == -1 && arr[i] == j) {
                    Cnt++;
                }
            }
        }
        System.out.println(Cnt);
    }
}
/*//find prime number;
        int priNum[] = new int[1002];
        int Cnt = 0;
        priNum[0] = -1;
        priNum[1] = -1;

        for (int i = 2; i < 1001; i++) {
            if (priNum[i] == 0) {
                priNum[i] = 1;
                Cnt++;
                for (int j = i + 1; j < priNum.length; j++) {
                    if (j % i == 0) priNum[j] = -1;
                }
            }
        }

        // arrange the prime number array.
        int prime[] = new int[Cnt + 2];
        int temp = 0;
        for (int i = 0; i < priNum.length; i++) {
            if (priNum[i] == 1) {
                prime[temp] = i;
                temp++;
            }
        }
        Cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < prime.length; j++) {
                if (arr[i] == prime[j]) Cnt++;
            }
        }
        System.out.println(Cnt);*/