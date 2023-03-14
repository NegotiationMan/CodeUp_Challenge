package codeup_Java;

import java.util.Scanner;

public class Basic_076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a부터 입력한 문자까지 순서대로 공백을 두고 출력
        String str = sc.next();
        int num = str.charAt(0);

        for (int i = 97; i <= num; i++) {
            System.out.print((char) i + " ");
        }
    }
}
