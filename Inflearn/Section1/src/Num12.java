import java.util.*;

public class Num12 {
    // // 내 풀이 - 복습 필요
    // public String solution(int loop, String str) {
    //     String answer = "";
    //     str = str.replaceAll("[#]", "1");
    //     str = str.replaceAll("[*]", "0");
    //     for (int i = 0; i < loop; i++) {
    //         int start = i * 7;
    //         int end = i * 7 + 7;
    //         String tmp = str.substring(start, end);
    //         char c = (char) (Integer.parseInt(tmp, 2)); // Integer.parseInt(tmp,2) 라는 뜻은 tmp 라는 문자열이 2진수로 되어있으니 int(정수)형으로 바꿔라. 라는 뜻이다. 따라서 10진수 정수로 바꿔주게 된다.
    //         answer += c;
    //     }
    //     return answer;
    // }

    // 강의 풀이
    public String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2); // 2진수 String 을 10진수화 한다.
            answer += (char) num;
            s = s.substring(7); // substring(n) 하면 n부터 맨 뒤까지 잘라져서 저장된다. 원본에 자른걸 저장하면 앞에서부터 7개씩 사라지는거처럼 보일 수 있다.
            // 왜? abcdefghijklmn 이라는 문자열이 있을때 substring(3) 해서 원본에 저장하면 원본은 defghijklmn 이 되고, 다시 substring(3) 하면 ghijklmn 이 된다.
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num12 t = new Num12();
        int loop = sc.nextInt();
        String str = sc.next();
        System.out.println(t.solution(loop, str));
    }
}
