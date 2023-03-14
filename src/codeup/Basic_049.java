package codeup_Java;

import java.util.Scanner;

public class Basic_049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a > b ? 1 : 0);         // a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력
    }
}

