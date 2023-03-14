package codeup_Java;
import java.util.Scanner;

public class Basic_017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

//        System.out.println(String.format("%d %d %d",i));      // 개수에 맞춰서 !!
        System.out.println(String.format("%d %d %d",i,i,i));
        System.out.printf("%d %d %d",i,i,i);                    // printf 사용하면 더 쉬울듯?
    }
}
