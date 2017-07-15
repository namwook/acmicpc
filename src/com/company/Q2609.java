
package com.company;

import java.util.Scanner;

/**
 * Created by nameuk on 6/29/17.
 */
public class Q2609 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        //find prime number;
        int priNum[] = new int[10001];
        int Cnt = 0;

        priNum[0] = priNum[1] = -1;

        for (int i = 2; i < priNum.length; i++) {
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
                if (i < 20) System.out.println("prime [" + temp + "] is " + prime[temp]);
                temp++;
            }
        }

        //get the result
        int length;
        if( first >= second) length = first;
        else length = second;

        for (int i = 0; i < length; i++) {
            if( first % prime[i] ==0 && second%prime[i] ==0){

            }
        }

    }
}