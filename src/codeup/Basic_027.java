package codeup_Java;
import java.util.Scanner;

public class Basic_027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] index = sc.nextLine().split("[.]");      // 년월일 입력 받아 형식 바꿔 출력하기

        int y = Integer.parseInt(index[0]);
        int m = Integer.parseInt(index[1]);
        int d = Integer.parseInt(index[2]);

        System.out.printf("%02d-%02d-%04d",d,m,y);

//        System.out.printf("%02d-%02d-%04d",Integer.parseInt(index[2]), Integer.parseInt(index[1]), Integer.parseInt(index[0]));
    }
}