package codeup_Java;
import java.util.Scanner;

public class Basic_019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] index = str.split("\\.");                   // 정규식에서의 .은 임의의 문자열을 의미
//        String[] index = str.split("[.]");                   // 이렇게 사용해도 ok
        String[] index = sc.nextLine().split("\\.");    // 이렇게 한번에 코드 작성 가능

        int y = Integer.parseInt(index[0]);
        int m = Integer.parseInt(index[1]);
        int d = Integer.parseInt(index[2]);

        System.out.printf("%04d.%02d.%02d",y,m,d);   // %02 -> 일의 자리수면 앞에 0 추가




    }
}
