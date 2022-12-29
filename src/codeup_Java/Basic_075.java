package codeup_Java;

import java.util.Scanner;

public class Basic_075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1씩 줄이면서 한 줄에 하나씩 0이 될 때까지 출력
        int num = sc.nextInt();

        while (--num >= 0) {
            System.out.println(num);
        }
    }
}
