package codeup_Java;
import java.util.Scanner;

public class Basic_025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] index = sc.nextLine().split("");         // 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력
        /*
        System.out.printf("[%s0000]\n",index[0]);
        System.out.printf("[%s000]\n",index[1]);
        System.out.printf("[%s00]\n",index[2]);
        System.out.printf("[%s0]\n",index[3]);
        System.out.printf("[%s]\n",index[4]);
        */

        //  for문을 이용해서 간단하게 풀기
        int count = 5;          // count로 0 개수 세기

        for(String s : index){
            count--;
            System.out.print("["+s);
            for(int i=0; i<count; i++){
                System.out.print("0");
            }
            System.out.println("]");
        }
    }
}