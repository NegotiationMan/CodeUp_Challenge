package codeup_Java;

import java.util.Scanner;

public class Basic_080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
        // 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num >= sum) {
                sum += i;
            }
            if (sum >= num) {
                System.out.println(i);

            }
        }
        System.out.println();
    }
}