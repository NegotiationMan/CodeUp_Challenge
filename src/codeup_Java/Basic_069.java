package codeup_Java;

import java.util.Scanner;

public class Basic_069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        // 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력
        switch (str.charAt(0)) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }
}
