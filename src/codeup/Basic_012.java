package codeup_Java;
import java.util.Scanner;

public class Basic_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력값을 받기위해서 Scanner

        float f = sc.nextFloat();

        System.out.println(f);
        System.out.println(String.format("%.3f",f));    // String.format 사용해서 소수점 자릿수 정하기
        System.out.println(String.format("%f",f));      // 기본 소수점 6번째 자리까지
    }
}
