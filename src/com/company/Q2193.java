    package com.company;

    import java.util.Scanner;

    /**
     * Created by nameuk on 6/29/17.
     */
    public class Q2193 {
        /*public static long cnt[];

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            cnt = new long[n + 1];
            cnt[1] = 1;
            if( n >= 2) cnt[2] = 1;
            cal(n);
            System.out.println(cnt[n]);
        }

        public static long cal(int n) {
            if (n == 1 || n == 2) return cnt[n];

                if (cnt[n] > 0) {

                    return cnt[n];
                }
                cnt[n] = cal(n - 1) + cal(n - 2);
                return cnt[n];
        }*/
        /*public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long cnt[] = new long[n+1];
            cnt[0] = cnt[1] = 1;

            for (int i = 2; i <= n; i++) {
                cnt[i] = cnt[i-1]+cnt[i-2];
            }
            System.out.println(cnt[n]);
        }*/
        public static long cnt[];

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            cnt = new long[n + 1];
            cnt[1] = 1;
            if( n >= 2) cnt[2] = 1;
            cal(n);
            System.out.println(cnt[n]);
        }

        public static long cal(int n) {
            if (n == 1 || n == 2) return cnt[n];

            if (cnt[n] > 0) {

                return cnt[n];
            }
            cnt[n] = cal(n - 1) + cal(n - 2);
            return cnt[n];
        }
    }