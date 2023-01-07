// Last Recently Used 문제. - 복습필요(LRU 알고리즘)
// LRU 알고리즘은 Least Recently Used 의 약자로 직역하자면 가장 최근에 사용되지 않은 것 정도의 의미를 가짐.

/*
 * 캐시 사이즈만큼 배열 선언. 가장 최근 작업을 0번 인덱스에 저장함. i는 배열 맨 뒤에서부터 앞으로 순차적으로 돈다.
 * 새로운 작업이 들어왔을때, miss(캐시에 작업내역이 없다면) 이미 있던 작업을 한칸 뒤로 밀고, 제일 앞에 현재 새로운 작업을 넣는다.
 * hit(새로운 작업이 이미 캐시안에 들어있을때), hit 난 지점 인덱스부터 for문이 돌게 된다. 여기부터 이미 있던 작업을 한칸 뒤로 밀고 새로운 작업을 다시 앞에 넣어준다.
 * 현재 작업은 항상 0번에 들어간다.
 */

import java.util.*;

public class Num4 {
    public int[] solution(int size, int work_n, int[] work) {
        int[] cache = new int[size];
        for (int x : work) { // 각 작업을 반복하면서 작업이 캐시에 존재하는가(hit), 존재하지 않는가(miss)를 판별한다.
            int pos = -1; // 위치.
            for (int i = 0; i < size; i++) { // 캐시를 탐색하여 hit인지 miss인지 찾는다.
                if (x == cache[i])
                    pos = i;
            }
            if (pos == -1) { // miss 일때
                for (int i = size - 1; i >= 1; i--) 
                    cache[i] = cache[i - 1];
            }
            else { // hit 일떄
                for (int i = pos; i >= 1; i--)
                    cache[i] = cache[i - 1];
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num4 t = new Num4();
        int size = sc.nextInt();
        int work_n = sc.nextInt();
        int[] work = new int[work_n];
        for (int i = 0; i < work_n; i++)
            work[i] = sc.nextInt();
        for (int x : t.solution(size, work_n, work))
            System.out.print(x + " ");
    }
}

// /**
//  * 복습 - LRU알고리즘
//  * miss와 hit을 판별하여 miss 일때는 캐시에 있는 작업을 한개씩 뒤로 밀고 현재 작업을 제일 앞에 넣는다
//  * hit일때는 hit인 부분 앞에있는 작업을 전부 한개씩 민 다음 현재작업(hit인 작업)을 제일 앞에 넣는다
//  */
// import java.util.*;

// public class Num4 {
//     public int[] solution(int s, int n, int[] work) {
//         int[] cache = new int[s];
//         for (int x : work) {
//             int pos=-1;
//             for (int i = 0; i < s; i++) {
//                 if (cache[i] == x)
//                     pos = i;
//             }
//             if (pos == -1) { // miss일 경우
//                 for(int i=s-1;i>0;i--)
//                     cache[i] = cache[i-1];
//             } else { //  hit일 경우
//                 for (int i = pos; i >0; i--) {
//                     cache[i] = cache[i-1];
//                 }
//             }
//             cache[0] = x;
//         }
//         return cache;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Num4 t = new Num4();
//         int s = sc.nextInt();
//         int n = sc.nextInt();
//         int[] work = new int[n];
//         for(int i=0;i<n;i++)
//             work[i] = sc.nextInt();
//         for(int x : t.solution(s, n, work))
//             System.out.print(x+" ");
//     }
// }