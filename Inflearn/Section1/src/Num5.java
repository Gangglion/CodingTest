import java.util.*;
import java.io.*;

// 강의 풀이. 내일 복습하기
// <알고리즘>
// left와 right(이하 lt, rt) 2개로 앞과 뒤에서 비교한다. 특수문자는 그대로 놔두고 알파벳끼리만 교환해야 하므로 c[lt] 와 c[rt]가 모두 알파벳일때만 교환해주고
// c[lt]가 알파벳이 아니면 lt증가, c[rt]가 알파벳이 아니면 rt 감소. while문으로 lt 와 rt의 위치가 바뀌면, 즉 lt가 rt보다 커지기 전까지 while 문으로
// 알파벳인지 아닌지, 둘다 아니면 교환하는 알고리즘을 반복해서 실행해준다.
public class Num5 {
    public String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = c.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt]))
                lt++;
            else if (!Character.isAlphabetic(c[rt]))
                rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num5 T = new Num5();
        System.out.println(T.solution(br.readLine()));
    }
}
