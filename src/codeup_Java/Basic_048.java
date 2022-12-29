package codeup_Java;

import java.util.Scanner;

public class Basic_048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d", a << 1 * b);         // 정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력
    }
}

