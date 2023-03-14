package codeup_Java;
import java.util.Scanner;

public class Basic_015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float f = sc.nextFloat();

        System.out.println(String.format("%.2f",f));    // 결과를 소수점 셋 째 자리에서 반올림 해, 소숫점 이하 둘째 자리까지 출력.
        System.out.printf("%.3f",f);                    // printf 사용하면 더 쉬울듯
    }
}
