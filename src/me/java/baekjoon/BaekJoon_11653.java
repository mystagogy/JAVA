package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_11653 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                sb.append(i).append('\n');
                N /= i;
            }
        }

        if (N != 1) { sb.append(N); }

        System.out.println(sb);
    }
}
