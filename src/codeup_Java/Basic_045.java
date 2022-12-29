package codeup_Java;

import java.util.Scanner;

public class Basic_045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d\n", num1 + num2);                 // 합
        System.out.printf("%d\n", num1 - num2);                 // 차
        System.out.printf("%d\n", num1 * num2);                 // 곱
        System.out.printf("%d\n", num1 / num2);                 // 몫
        System.out.printf("%d\n", num1 % num2);                 // 나머지
        System.out.printf("%.2f", (double) num1 / num2);        // 나눈 값
    }
}

