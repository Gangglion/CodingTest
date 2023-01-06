// 브론즈2
// 문자열 반복 - 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
// S에는 QR Code "alphanumeric" 문자만 들어있다. QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

import java.io.*;

public class Num4 {
    public String solution(int loop, String str) {
        String answer = "";
        char[] c = str.toCharArray();
        for (char x : c) {
            for(int i=0;i<loop;i++)
                answer += x;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num4 t = new Num4();
        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            String[] input = br.readLine().split(" ");
            System.out.println(t.solution(Integer.parseInt(input[0]), input[1]));
        }
    }
}
