
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

/**
 * Created by nameuk on 6/29/17.
 */
public class Q2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[];
        int a, b;

        input = br.readLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);

        int A = a, B = b, r = 0;
        int gcd = 0, lcm;
        boolean check = true;

        while (check) {
            r = a % b;
            if (r == 0) {
                gcd = b;
                check = false;
            }
            a = b;
            b = r;
        }
        lcm = (A / gcd) * (B / gcd) * gcd;
        System.out.println(gcd + " " + lcm);
    }
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int A = a, B = b;
        int r = 0, q = 0;
        int gcd = 0, lcm = 0;
        boolean check = true;
        while (check) {
            r = a % b;
            if (r == 0) {
                gcd = b; check = false;
            }
            a = b;
            b = r;
        }
        lcm = (A / gcd) * (B / gcd) * gcd;
        System.out.println(gcd + " " + lcm);
    }*/
}