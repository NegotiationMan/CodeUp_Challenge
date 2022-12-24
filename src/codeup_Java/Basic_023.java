package codeup_Java;
import java.util.Scanner;

public class Basic_023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] index = sc.nextLine().split("[.]");         // 실수 1개 입력받 부분별로 출력 -> 정수 부분, 실수 부분

        System.out.println(index[0]);
        System.out.println(index[1]);

//        System.out.printf("%s\n%s",index[0],index[1]);            // 이렇게 한줄로도 가능
    }
}
