package codeup_Java;

import java.util.Scanner;

public class Basic_054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result;
        if (a == 1 && b == 1) {
            result = 1;
        } else {
            result = 0;
        }
        System.out.println(result); // 둘 다 참(1)일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력
    }
}
