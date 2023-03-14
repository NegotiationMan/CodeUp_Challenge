package codeup_Java;

import java.util.Scanner;

public class Basic_056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a == b ? 0 : 1); // 참/거짓이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력
    }
}
