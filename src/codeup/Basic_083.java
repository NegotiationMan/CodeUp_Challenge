package codeup_Java;

import java.util.Scanner;

public class Basic_083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
        // 3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}