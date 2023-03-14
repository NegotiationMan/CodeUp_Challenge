package codeup_Java;

import java.util.Scanner;

public class Basic_046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.printf("%d\n", num1 + num2 +num3);                 // 합
        System.out.printf("%.1f\n", (double)(num1 + num2 +num3)/3);   // 평균
    }
}

