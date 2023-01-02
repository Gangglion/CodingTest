import java.io.*;

public class Num1 {
    public int solution(String str, char c) {
        int result = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if(str.toUpperCase().charAt(i) == Character.toUpperCase(c))
        //         result++;
        // }

        // 강의에서 나온 foreach 문 사용
        for (char x : str.toCharArray()) { // toCharArray : str의 문자 한개한개를 분리하여 문자 배열 객체를 만든다.
            if (x == c)
                result++;
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num1 T = new Num1();
        System.out.println(T.solution(br.readLine(), br.readLine().charAt(0)));
    }
}
