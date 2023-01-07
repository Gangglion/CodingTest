// 1. 선택정렬 - 복습 필요
// N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요. 정렬하는 방법은 선택정렬입니다.
// 입력
// 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
// 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
// 출력
// 오름차순으로 정렬된 수열을 출력합니다.

// 선택정렬 : 배열을 2중 for문으로 돌면서 가장 작은 수의 index 를 저장하고, 현재 i가 가리키는 위치와 idx의 값을 바꿔준다.
// 앞에서부터 돌때마다 그 범위의 최솟값이 앞으로 오도록 재정렬 되는 알고리즘이다.
import java.util.*;

public class Num1 {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) { // 마지막까지 돌 필요가 없음. 왜? 마지막 전 i와 idx를 비교해서 교환했다면, 두개가 이미 자리가 잡혀있기 때문.
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx])
                    idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Num1 t = new Num1();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for (int x : t.solution(n, arr))
            System.out.print(x+" ");
    }
}

// // 복습 - 선택정렬(1월7일)
// // 최솟값을 찾아(선택) 현재 탐색중인 위치(i위치)와 교환해줌.
// import java.util.*;

// public class Num1 {
//     public int[] solution(int n, int[] arr) {
//         for (int i = 0; i < n - 1; i++) {
//             int idx = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[idx])
//                     idx = j;
//             }
//             int tmp = arr[idx];
//             arr[idx] = arr[i];
//             arr[i] = tmp;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Num1 t = new Num1();
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++)
//             arr[i] = sc.nextInt();
//         for(int x : t.solution(n,arr))
//             System.out.print(x+" ");
//     }
// }