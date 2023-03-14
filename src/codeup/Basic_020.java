package codeup_Java;
import java.util.Scanner;

public class Basic_020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] index = sc.nextLine().split("-");

//        int y = Integer.parseInt(index[0]);
//        int m = Integer.parseInt(index[1]);

//        System.out.printf("%06d%07d",y,m);   // %02 -> 일의 자리수면 앞에 0 추가
        System.out.println(index[0]+index[1]);  // 이렇게 간단하게도 가능




    }
}
