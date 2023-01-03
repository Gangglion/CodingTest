import java.io.*;
import java.util.*;

public class Num6 {
    public String solution(String str) {
        String answer = "";
        // // 내 풀이
        // char[] c = str.toCharArray();
        // for (char tmp : c) {
        //     if (answer.equals("")) {
        //         answer += tmp;
        //     } else if(answer.indexOf(tmp)==-1){ // str.indexOf(tmp) 는 str에서 tmp 가 없으면 -1을 반환하고, 있으면 해당 인덱스를 반환한다.
        //         answer += tmp;
        //     }
        // }

        // 강의풀이
        // indexOf는 해당 문자가 첫번째로 나온 위치의 인덱스를 반환한다. 입력값 ksekkset의 경우 kse는 i가 각각 0,1,2이고, str.indexOf(k)는 0, str.indexOf(s)는 1, str.indexOf(e)는 2이므로 i와 동일하다.
        // 즉 중복된 문자를 제거한다는말은 문자가 처음 나온것들만 뽑아낸다는것과 같으므로 아래와 같이 풀 수 있다.(복습 필요)
        for (int i = 0; i < str.length(); i++)
        {
            if(str.indexOf(str.charAt(i))==i)
                answer += str.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num6 T = new Num6();
        System.out.println(T.solution(br.readLine()));
    }
}

// // 복습 - 완료시 주석처리
// import java.io.*;

// public class Num6 {
//     public String solution(String str) {
//         String answer = "";
//         for (int i = 0; i < str.length(); i++) {
//             if(i == str.indexOf(str.charAt(i)))
//                 answer += str.charAt(i);
//         }
//         return answer;
//     }
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         Num6 T = new Num6();
//         System.out.println(T.solution(br.readLine()));
//     }
// }