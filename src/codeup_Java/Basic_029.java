package codeup_Java;
import java.util.Scanner;

public class Basic_029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();           // double 타입으로 변수 선언

        System.out.printf("%.11f",num);         // 입력된 실수를 소수점 이하 11자리까지 반올림하여 출력
    }
}