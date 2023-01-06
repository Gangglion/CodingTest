// 버블정렬 - 복습 필요
// 설명
// N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
// 정렬하는 방법은 버블정렬입니다.

// 입력
// 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
// 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

/*
버블정렬이란?
이웃한 두수를 비교하여 앞에수가 크고 뒤에수가 작으면 swap해줌.
한번의 턴을 통해 맨 뒷자리 수를 정해줌. 다음턴엔 맨 뒷자리 제외하고 동일한 로직을 돈다. 반복횟수가 줄어든다.
 */

import java.util.*;

public class Num2 {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            // 턴이 돌때마다 마지막 수가 정해짐. [a,b,c,d,e] 라고 했을때 한번돌면 e의 값이 정해지고, 두번째는 d, 세번째는 c, 네번째는 b의 값이 정해지고
            // a는 자동으로 정해지므로 총 길이 5일때 4번만 돌면 정렬이 끝난다.
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num2 t = new Num2();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int x : t.solution(n, arr))
            System.out.print(x+" ");
    }
}
