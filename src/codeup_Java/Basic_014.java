package codeup_Java;
import java.util.Scanner;

public class Basic_014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력값을 받기위해서 Scanner
        /*
        String str = sc.next();         // 문자열 입력받아서 문자로 쪼개기
        char ch1 = str.charAt(0);       // 이건 한 문자열의 0,1번 인덱스 가져오는 것
        char ch2 = str.charAt(1);

        System.out.println(ch2+" "+ch1);
        */
        char ch1 = sc.next().charAt(0); // 문자열 생성할 필요없이 바로 문자형으로 !
        char ch2 = sc.next().charAt(0);

        System.out.println(ch2+" "+ch1);
    }
}
