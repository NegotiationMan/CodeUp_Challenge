package codeup_Java;

import java.util.Scanner;

public class Basic_062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1^num2); // 두 정수를 비트단위(bitwise)로 xor 계산을 수행한 결과를 10진수로 출력
    }
}
