package com.company;

import java.util.Scanner;

public class Q1260 {
    public static int matrix[][];
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // 정점 개수
        int m = scn.nextInt(); // 간선 개수
        int v = scn.nextInt(); // 탐색 시작 번호
        matrix = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            int s = scn.nextInt();
            int w = scn.nextInt();
            matrix[s][w] = matrix[w][s] = 1;
        }
        dfs(v);
        bfs(v);

    }

    public static void dfs(int start) {

    }

    public static void bfs(int start) {

    }
}
