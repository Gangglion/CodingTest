// 백준 실버4 - 한수
// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

import java.io.*;

public class Sliver4 {
    public int solution(String str) {
        int answer = 0;
        int[] d_array = new int[2];
        for (int i = 1; i <= Integer.parseInt(str); i++) {
            if(i<100)
                answer++;
            else if (i >= 100 && i < 1000) {
                int h = i / 100;
                int t = (i % 100) / 10;
                int o = (i % 100) % 10;
                if(h-t == t-o)
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Sliver4 t = new Sliver4();
        System.out.println(t.solution(br.readLine()));
    }
}