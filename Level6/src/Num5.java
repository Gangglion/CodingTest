// 브론즈1
// 단어 공부 - 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
// 단, 대문자와 소문자를 구분하지 않는다.
// 가장 많이 출력된 알파벳이 여러개일 경우 ?를 출력한다.
import java.io.*;
import java.util.*;
public class Num5 {
    public String solution(String str) {
        String answer = "?";
        char[] c = str.toUpperCase().toCharArray();
        int count = 1;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : c) {
            if (!map.containsKey(x)) {
                count = 1;
            } else {
                count = map.get(x) + 1;
            }
            map.put(x, count);
        }
        for (char x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = String.valueOf(x);
            }else if(map.get(x)==max){
                answer = "?";
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num5 t = new Num5();
        System.out.println(t.solution(br.readLine()));
    }    
}
