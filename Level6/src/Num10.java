// 1316번(실버5) : 그룹 단어 체커
// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
// 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
// aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

import java.io.*;

public class Num10 {
    public int solution(int n,String[] str) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            char[] c = str[i].toCharArray();
            boolean check = true;
            for (int j = 0; j < c.length;j++) {
                if (str[i].indexOf(c[j]) != j) {
                    if (str[i].charAt(j) != str[i].charAt(j - 1)) {
                        check = false;
                        break;
                    } else
                        check = true;
                } else
                    check = true;
            }
            if(check)
                answer++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Num10 t = new Num10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        System.out.println(t.solution(n, str));
    }
}
