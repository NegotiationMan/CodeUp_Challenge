package codeup_Java;

import java.io.*;
import java.util.Scanner;

public class Basic_085 {
    public static void main(String[] args) throws IOException {
        // 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
        // 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();

        // 44100 * 16 * 2 * 1 bit의 저장공간이 필요
        System.out.println(String.format("%.1f MB",(double)((h*b*c*(s/10))/8)/1024/100));
    }
}