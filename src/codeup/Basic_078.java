package codeup_Java;

import java.util.Scanner;

public class Basic_078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1부터 입력된 수까지 짝수의 합을 출력
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}