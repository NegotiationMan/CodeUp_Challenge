package codeup_Java;

import java.util.Scanner;

public class Basic_053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num == 0 ? 1 : 0);         // 입력된 값이 0이면 1, 1이면 0을 출력
    }
}

