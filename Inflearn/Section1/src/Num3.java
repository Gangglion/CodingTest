import java.io.*;

public class Num3 {
    public String solution(String string) {
        String answer = "";
        String[] str = string.split(" ");
        // // 내가 한 코드
        // int len = 0;
        // int index = 0;
        // for (int i = 0; i < str.length; i++) {
        //     if (str[i].length() > len) {
        //         len = str[i].length();
        //         index = i;
        //     }
        // }
        // answer = str[index];

        // // 강의에서 한 코드 - 1
        // // 최소값으로 해야하기때문에 강의에서는 다음과 같이 했음
        // int len = Integer.MIN_VALUE;
        // for (String s : str) {
        //     if (s.length() > len) {
        //         len = s.length();
        //         answer = s;
        //     }
        // }

        // 강의에서 한 코드 - 2 (indexOf 와 substring 사용)
        int m = Integer.MIN_VALUE;
        int pos;
        while ((pos = string.indexOf(' ')) != -1) {
            String temp = string.substring(0, pos);
            int len = temp.length();
            if (len > m) {
                m = len;
                answer = temp;
            }
            string = string.substring(pos + 1);
        }
        // 마지막 단어 체크가 필수임. 왜? 앞에서 substring 으로 잘라주고 공백을 indexOf로 확인하게 되면 미자믹 단어에는 공백이 없기때문에
        // 적용이 안된다. 따라서 마지막 단어 체크도 해주어야한다.
        if (string.length() > m)
            answer = string;
        return answer;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num3 t = new Num3();
        System.out.println(t.solution(br.readLine()));
    }
}
