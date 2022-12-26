package codeup_Java;

import java.util.Scanner;

public class Basic_036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        char ch = num.charAt(0);        // 문자열 첫 번째 인덱스 문자로 변환

        System.out.println((int) ch);   // 문자를 int형으로 !
    }
}