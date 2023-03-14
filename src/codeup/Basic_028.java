package codeup_Java;
import java.util.Scanner;

public class Basic_028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();           // -2147483648 ~ +2147483647 범위를 넘어가는 수는 long 타입으로 변수 선언

        System.out.println(num);

    }
}