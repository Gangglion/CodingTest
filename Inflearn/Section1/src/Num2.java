import java.io.*;

public class Num2 {

    public String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            // if(Character.isUpperCase(c))
            //     answer += Character.toLowerCase(c);
            // else
            //     answer += Character.toUpperCase(c);

            // 아스키코드 사용한 코드. 대문자는 65~90, 소문자는 97~ 122까지. char 형으로 형변환 해주어야 함.
            if(c>=65 && c<=90)
                answer += (char)(c + 32);
            else
                answer += (char)(c - 32);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num2 t = new Num2();
        System.out.println(t.solution(br.readLine()));
    }
}