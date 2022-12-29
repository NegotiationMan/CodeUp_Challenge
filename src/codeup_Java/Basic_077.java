package codeup_Java;

import java.util.Scanner;

public class Basic_077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0부터 그 수까지 줄을 바꿔 한 개씩 출력
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
