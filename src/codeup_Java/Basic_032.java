package codeup_Java;

import java.util.Scanner;

public class Basic_032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.printf("%x", num);        // 10진수 입력받아서 16진수로 출력
    }
}