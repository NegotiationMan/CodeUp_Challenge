package codeup_Java;
import java.util.Scanner;

public class Basic_024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] index = sc.nextLine().split("");         // 단어 1개 입력받아 나누어 출력 -> 'B' 'o' 'y'

        /*
        for(int i=0; i<index.length; i++){                      // index개수 .length;
            System.out.printf("\'%s\'\n",index[i]);
        }
         */

        for(String s : index){                       // for(대입받을 변수정의 : 배열명) -> 향상된 for문 -> 배열만 사용 가능
            System.out.println("\'"+s+"\'");
        }
    }
}