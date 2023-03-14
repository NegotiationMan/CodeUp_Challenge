package codeup_Java;

import java.util.Scanner;

public class Basic_055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result;
        if (a == 0 && b == 0) {
            result = 0;
        } else {
            result = 1;
        }
        System.out.println(result);         // 하나라도 참일 경우 1을 출력하고, 그 외의 경우에는 0을 출력
    }
}
