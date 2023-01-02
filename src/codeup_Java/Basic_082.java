package codeup_Java;

import java.util.Scanner;

public class Basic_082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력
        // 계산 결과도 16진수로 출력
        String str = sc.nextLine();
        int num = Integer.parseInt(str, 16);
        for (int i = 1; i <= 15; i++) {
            System.out.println(String.format("%X*%X=%X", num, i, num * i));
        }
    }
}