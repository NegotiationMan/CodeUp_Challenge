package codeup_Java;

import java.util.Scanner;

public class Basic_063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 > num2 ? num1 : num2); // 두 정수 중 큰 값을 10진수로 출력 (삼항연산자)
    }
}
