package codeup_Java;

import java.util.Scanner;

public class Basic_073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료 (while)
        String[] num = sc.nextLine().split(" ");

        int i = 0;
        while (i < num.length) {
            if (num[i].equals("0")) {
                break;
            }
            System.out.println(num[i]);
            i++;
        }
    }
}
