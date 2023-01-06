// 중복 확인
// 현수네 반에는 N명의 학생들이 있습니다. 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
// 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고, 
// N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.

// HashMap 사용하면 시간복잡도 n 으로도 풀수 있음. 정렬은 원래 시간복잡도가 nlogn 이라서 성능이 더 떨어짐. 하지만 강의에서는
// 정렬로 풀수 있다는걸 보여주고자 함.

import java.util.*;

public class Num5 {
    public String solution(int n, int[] arr) {
        // // 내 풀이 : 버블정렬 사용. 정렬하고 j와 j+1비교했을때 같으면 바로 D를 리턴하도록 했음.
        // String answer = "";
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i; j < n - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int tmp = arr[j + 1];
        //             arr[j + 1] = arr[j];
        //             arr[j] = tmp;
        //         }
        //         if(arr[j]==arr[j+1])
        //             return "D";
        //         else
        //             answer = "U";
        //     }
        // }
        // return answer;

        // // 강의 풀이 : 정렬 사용. 배열 정렬은 Arrays.sort 메소드 사용. 기본 오름차순 정렬한다.
        // String answer = "U";
        // Arrays.sort(arr);
        // for (int i = 0; i < n - 1; i++) {
        //     if(arr[i]==arr[i+1])
        //         return "D";
        // }
        // return answer;

        // HashMap 사용 풀이
        String answer = "U";
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr) {
            if(hm.containsKey(x))
                return "D";
            else
                hm.put(x, 1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num5 t = new Num5();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(t.solution(n,arr));
    }
}
