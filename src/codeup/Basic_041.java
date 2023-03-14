package codeup_Java;

import java.util.Scanner;

public class Basic_041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char ch = str.charAt(0);

        System.out.println((char) (ch + 1));        // 문자 1개 입력받 다음 문자 출력

    }
}

