// 2292번 - 브론즈2 : 벌집
// 등차수열 합 구하는 공식 사용
// 입력값이 특정 항 개수일때의 수열의 합보다 작거나 같은 경우
// 특정 항 개수+1 한 것이 최단거리

import java.io.*;

public class Num2 {
    public int solution(int num){
        if(num==1) // 목표로 하는 방이 1번방일때는 1이므로 1을 바로 리턴한다.
            return 1;
        int hap = 0;
        int n = 1;
        int a = 6;
        while(true){
            hap = (n*(2*a+(n-1)*6))/2+1; 
            // 규칙을 보면 2번째칸에는 2부터 7까지, 3번째 칸에는 8부터 19까지 이다.
            // 공차가 6인 등차수열일때 2번째 칸을 1항으로 보고 1항일떄의 수열의 총 합은 6인데,
            // 들어가는 수는 7까지 들어가므로 1을 더해준다.
            if(num<=hap){
                return n+1; // 시작하는 방을 더해준다.
            }
            else
                n++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Num2 t = new Num2();
        System.out.println(t.solution(num));
    }
}