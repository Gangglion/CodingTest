import java.io.*;

public class Num11 {
    public String solution(String str) {
        // 강의 풀이 : 복습 필요
        // 문자열의 i인덱스와 i+1인덱스를 비교해서 같으면 count증가, 다르면 c[i] 넣고, count가 1 보다 클떄 count도 넣어준다.
        // 단 이렇게하면 마지막인덱스에서 i와 i+1을 비교할 수 없으므로, 문자열에 임의의 공백 문자 한개를 넣어주고, for문을 돌릴때는 공백문자를 뺀 범위만큼 돌도록 범위를 지정해준다.
        String answer = "";
        int count = 1;
        str += " ";
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length-1; i++) {
            if(c[i]==c[i+1])
                count++;
            if (c[i] != c[i + 1]) {
                answer += c[i];
                if (count > 1) {
                    answer += count;
                    count = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num11 t = new Num11();
        System.out.println(t.solution(br.readLine()));
    }
}
