package codeup_Java;
import java.util.Scanner;

public class Basic_026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] index = sc.nextLine().split(":");         // 입력되는 시:분:초 에서 분만 출력

        int m = Integer.parseInt(index[1]);
        System.out.printf("%1d",m);                              // 0분으로 하고싶으면 문자열이 아닌 정수형으로 반환

//        System.out.println(Integer.parseInt(index[1]));        // 이렇게 간단하게도 가능
    }
}