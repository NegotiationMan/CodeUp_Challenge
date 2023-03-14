package codeup_Java;

import java.util.Scanner;

public class Basic_066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // 입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력
        if (num1 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if (num2 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if (num3 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
