import java.io.*;
import java.util.*;

// // 내가 한 풀이
// public class Num4 {
//     public String solution(String[] str) {
//         String answer = "";
//         for (String s : str) {
//             char[] temp = s.toCharArray();
//             for (int i = temp.length - 1; i >= 0; i--) {
//                 answer += temp[i];
//             }
//             answer += "\n";
//         }
//         return answer;
//     }

//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         Num4 T = new Num4();
//         int count = Integer.parseInt(br.readLine());
//         String[] strArray = new String[count];
//         for(int i=0;i<strArray.length;i++)
//             strArray[i] = br.readLine();
//         System.out.println(T.solution(strArray));
//     }
// }

// 강의 풀이 : StringBuilder reverse 사용
// StringBuilder : 문자열을 다루는 클래스. 왜 사용하는가?
// String 으로 만들게 되면 값이 변하지 않는다. 변하는것처럼 보이는 이유는 객체를 계속 생성해서 가리키는 것이 달라지기 때문임. 객체를 계속 생성하기 때문에 메모리 낭비가 심함.
// 이를 방지하기 위해 StringBuilder 를 사용한다.
public class Num4 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        // // StringBuilder 의 reverse 사용하는 방법
        // 
        // for (String x : str) {
        //     String tmp = new StringBuilder(x).reverse().toString(); // reverse() 메소드 자체로 문자열을 뒤집을 수 있음
        //     answer.add(tmp);
        // }

        // // 코드로 구현해서 뒤집는 방법. 인덱스 짝을 지어서 교환해주는 방법 - 문자열에서 특정 조건에서 뒤집을때 사용되는 알고리즘임. 잘 기억하기
        //
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // char배열을 String 화 시켜준다. valueOf는 static 메소드이므로 클래스명으로 접근이 가능함.
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args) {
        Num4 T = new Num4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++)
            str[i] = kb.next();
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }   
}