import java.io.*;
public class Num7 {
    public String solution(String str) {
        // // 내 풀이
        // String answer = "";
        // char[] c = str.toUpperCase().toCharArray();
        // int lt = 0;
        // int rt = c.length-1;
        // while (lt < rt) {
        //     if(c[lt]==c[rt])
        //         answer = "YES";
        //     else {
        //         answer = "NO";
        //         break;
        //     }
        //     lt++;
        //     rt--;
        // }
        // return answer;

        // // 강의 풀이 - 회문 문자열은 절반으로 나누었을때만 비교하면 됨. for 문의 범위를 문자열 길이의 절반만큼만 돌리고, 문자 비교를 맨처음거, 맨 끝거 비교하면됨
        // // 풀이 자체는 내가 푼것과 동일하지만 나는 인덱스를 lt, rt 주었고, 문제에서는 비교범위를 줄이고 인덱스 대신 charAt 을 사용하여 비교함.
        // String answer = "YES";
        // str = str.toUpperCase();
        // for (int i = 0; i < str.length() / 2; i++) {
        //     if(str.charAt(i) != str.charAt(str.length()-i-1))
        //         return "NO";
        // }
        // return answer;

        // 강의 풀이2 - StringBuilder 의 reverse와 대소문자 구분 안하는 equalsIgnoreCase 사용
        // equalsIgnoreCase 는 대소문자를 구분하지 않고 같으면 T, 다르면 F 리턴
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp))
            answer =  "YES";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num7 t = new Num7();
        System.out.println(t.solution(br.readLine()));
    }
}
