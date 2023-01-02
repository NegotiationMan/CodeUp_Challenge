package codeup_Java;

import java.util.Scanner;

public class Basic_079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력
        String[] str = sc.nextLine().split(" ");

        for (String s : str) {
            if (s.equals("q")) {
                System.out.println(s);
                break;
            }
            System.out.println(s);
        }
    }
}