// 브론즈5
// 알파벳 찾기 - 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

import java.io.*;
public class Num3 {
    public int[] solution(String str) {
        int[] answer = new int[26];
        for (char i = 'a'; i <= 'z'; i++)
            answer[i-'a'] = str.indexOf((char)i);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num3 t = new Num3();
        for(int x : t.solution(br.readLine()))
            System.out.print(x + " ");
    }
}
