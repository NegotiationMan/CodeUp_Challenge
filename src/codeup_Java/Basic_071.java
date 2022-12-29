package codeup_Java;

import java.util.Scanner;

public class Basic_071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료
        String[] str = sc.nextLine().split(" ");

        for (String s : str) {
            if (s.equals("0")) {
                break;
            }
            System.out.println(s);
        }
    }
}
