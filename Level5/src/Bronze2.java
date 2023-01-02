// 정수 N개의 합

import java.util.Random;

public class Bronze2 {
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        Random r = new Random();
        int[] a = new int[1000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(3000000) + 1;
        }
        System.out.println(test.sum(a));
    }
}
// 제출한 함수
class Test {
    long sum(int[] a){
        long ans=0;
        for(int i:a){
            ans+=i;
        }
        return ans;
    }
}
