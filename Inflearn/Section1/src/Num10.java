import java.io.*;

public class Num10 {
    public int[] solution(String str) {
        String[] s = str.split(" ");
        // 강의 풀이 - 복습 필요!!
        // 처음 p값은 문자열의 최대 길이는 100을 넘지 않는다했으므로 절대 나올수 없는 거리인 1000으로 둔다.
        // 왼쪽에서 오른쪽으로 탐색하면서 e가 아니면 p에 1증가한 값을 넣고, e 면 p를 0으로 초기화해서 answer 배열에 넣는다.
        // 오른쪽에서 왼쪽으로 탐색할때는 왼쪽에서 탐색할때와 마찬가지로 p를 1000으로 두고 탐색하는데, answer배열에 있는 값과 p를 비교하여 더 작은 값을
        // answer 에 넣어준다.
        int[] answer = new int[s[0].length()];
        int p = 1000;
        for (int i = 0; i < s[0].length(); i++) {
            if (s[0].charAt(i) == s[1].charAt(0)) {
                p = 0;
                answer[i] = p;
            } else
                answer[i] = ++p;
        }
        p=1000;
        for (int i = s[0].length()-1; i >=0; i--) {
            if (s[0].charAt(i) == s[1].charAt(0)) {
                p = 0;
            }
            else {
                answer[i] = Math.min(answer[i], ++p);
            }
        }
        return answer;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num10 t =new Num10();
        for (int i : t.solution(br.readLine())) {
            System.out.print(i + " ");
        }
    }
}
