package codeup_Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Basic_084 {
    public static void main(String[] args) throws IOException {
        // 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
        // 줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // BufferedReader가 Scanner보다 속도가 더 빠르다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String rgb[] = br.readLine().split(" ");
        int r = Integer.parseInt(rgb[0]);
        int g = Integer.parseInt(rgb[1]);
        int b = Integer.parseInt(rgb[2]);

        int count = r * g * b;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }
}