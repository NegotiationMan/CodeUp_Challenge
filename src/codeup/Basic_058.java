package codeup_Java;

import java.util.Scanner;

public class Basic_058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a == 0 && a == 0 ? 1 : 0); // 둘 다 거짓일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력
    }
}
