package codeup_Java;
import java.util.Scanner;

public class Basic_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력값을 받기위해서 Scanner

        String str = sc.next();                 // 자바 Scanner은 문자를 입력벋는 기능없다
        char ch = str.charAt(0);                // 문자열 입력 받은 후 String.charAt(0)으로 문자 꺼내오기

        System.out.println(ch);
    }
}
