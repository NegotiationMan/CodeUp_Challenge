package codeup_Java;

import java.util.Scanner;

public class Basic_081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
        // 첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}