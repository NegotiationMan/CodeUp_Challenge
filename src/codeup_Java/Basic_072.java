package codeup_Java;

import java.util.Scanner;

public class Basic_072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n개의 정수를 한 개씩 줄을 바꿔 출력
        String n = sc.nextLine();
        String[] num = sc.nextLine().split(" ");

        for (String s : num) {
            System.out.println(s);
        }
    }
}
