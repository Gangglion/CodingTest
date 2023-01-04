import java.io.*;

public class Num8 {
    public String solution(String str) {
        // // 내 풀이
        // String answer = "YES";
        // char[] c = str.toUpperCase().toCharArray();
        // int lt = 0;
        // int rt = c.length - 1;
        // while (lt < rt) {
        //     if(!Character.isAlphabetic(c[lt]))
        //         lt++;
        //     else if(!Character.isAlphabetic(c[rt]))
        //         rt--;
        //     else {
        //         if (c[lt] != c[rt]) {
        //             answer = "NO";
        //             break;
        //         }
        //         lt++;
        //         rt--;
        //     }
        // }
        // return answer;

        // 강의 풀이 - replaceAll 을 사용해서 특수문자를 다 지워버리고, StringBuilder의 reverse 와 equals 사용
        // replaceAll 에는 정규식 사용이 가능하다.
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", ""); // 정규식 [^A-Z] 는 대문자 A 부터 Z가 아닌(^)것들은 공백으로("") 대체한다
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp))
            answer = "YES";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num8 t = new Num8();
        System.out.println(t.solution(br.readLine()));
    }
}
