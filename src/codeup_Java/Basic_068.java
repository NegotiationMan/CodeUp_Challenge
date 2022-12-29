package codeup_Java;

import java.util.Scanner;

public class Basic_068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        // 점수(정수, 0 ~ 100)를 입력받아 평가를 출력
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
