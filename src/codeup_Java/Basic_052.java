package codeup_Java;

import java.util.Scanner;

public class Basic_052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a != b ? 1 : 0);         // a와 b가 다른 경우 1을, 그렇지 않은 경우 0을 출력
    }
}

