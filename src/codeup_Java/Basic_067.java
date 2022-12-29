package codeup_Java;

import java.util.Scanner;

public class Basic_067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        // 입력된 정수에 대해
        // 첫 줄에 minus 나 plus 를 출력,
        // 두 번째 줄에 odd 나 even 을 출력
        if (num >= 0) {
            System.out.println("plus");
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else {
            System.out.println("minus");
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

    }
}
