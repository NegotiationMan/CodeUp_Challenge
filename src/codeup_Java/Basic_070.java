package codeup_Java;

import java.util.Scanner;

public class Basic_070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        // 월이 입력될 때 계절 이름이 출력
        switch (month){
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            default:
                System.out.println("fall");
        }
    }
}
