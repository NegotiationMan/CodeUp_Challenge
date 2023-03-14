package codeup_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Basic_034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        System.out.println(Integer.parseInt(num, 8));        // 8진수 입력받아서 10진수로 출력
    }
}