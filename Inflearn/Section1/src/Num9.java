import java.io.*;

public class Num9 {
    public int solution(String str) {
        // // 내 풀이
        // String answer = "";
        // char[] c = str.toCharArray();
        // for (char x : c) {
        //     if(!Character.isAlphabetic(x))
        //         answer += x;
        // }
        // return Integer.parseInt(answer);

        // // 강의 풀이1 - 아스키코드 0~9가 48~57라는 것을 이용하여 answer = answer*10+(x-48) 이라는 식으로 누적시키는 방식을 사용한다.
        // // 48을 빼는 이유는 char 는 정수형이기 때문에 0이라는 생각으로 그냥 +x를 해주게되면 0이 더해지는것이 아닌 문자 0 에 해당하는 48이 더해진다.
        // int answer = 0;
        // for (char x : str.toCharArray()) {
        //     if (x >= 48 && x <= 57) { // 이 조건을 만족하면 숫자라는 뜻임
        //         answer = answer * 10 + (x - 48);
        //     }
        // }
        // return answer;

        // 강의풀이2 - Character.isDigit(x) 라는 함수 이용. 숫자인지 판별하는 함수
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isDigit(x))
                answer += x;
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num9 t = new Num9();
        System.out.println(t.solution(br.readLine()));
    }
}
