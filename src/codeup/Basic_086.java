package codeup_Java;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Basic_086 {
    public static void main(String[] args) throws IOException {
        // 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
        // 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.

//        System.out.println(solution(new int[]{1,2,3,4,5},1,2));
//        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 2)));
        System.out.println(solution(23));
    }
    public static String solution(int age) {
        // a - > 97
        String[] str = String.valueOf(age).split("");
        char ch = str[0].charAt(0);
        String answer = "";
        return answer;
    }
}