package codeup_Java;

import java.util.Scanner;

public class Basic_035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        int hex = Integer.parseInt(num, 16);              // 16진수 정수 1개 입력

        System.out.println(Integer.toOctalString(hex));        // 8진수 바꾸어 출력
    }
}