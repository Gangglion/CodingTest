// // 삽입정렬 - 복습 필요
// // 설명
// // N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
// // 정렬하는 방법은 삽입정렬입니다.

// /*
//  * 삽입정렬이란?
//  * 이중for문 사용. i는 1번인덱스부터 돈다. j는 i바로 앞부터 0까지 돈다. 한개씩 작아지면서 도는것임.
//  * arr[j] 가 tmp 보다 크면 arr[j]를 뒤로 밀어준다. j+1 지점에 j값이 들어가게 된다. tmp 는 j for문 돌기전 arr[i]를 넣어준다.
//  * j for문이 한번 돌았으면 마지막에 j가 멈춘 지점 바로 '뒤'에 tmp 를 삽입해준다. else 일 경우 j for 문을 break해버린다.
//  * 이말은 j가 0, tmp와 비교햇을때 크지 않다면 break 하고 j가 멈춘지점 바로 뒤에 tmp 를 삽입하므로 arr[1] 에 tmp 가 들어간다는 말이다.
//  */

// import java.util.*;

// public class Num3 {
//     public int[] solution(int n, int[] arr) {
//         for (int i = 1; i < n; i++) {
//             int tmp = arr[i];
//             int j; // j for문 scope 밖에서 j를 사용할 것이기 때문에 밖에다 선언해주는 모습이다.
//             for (j = i - 1; j >= 0; j--) {
//                 if (arr[j] > tmp)
//                     arr[j + 1] = arr[j];
//                 else
//                     break;
//             }
//             arr[j+1] = tmp;
//         }
//         return arr;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Num3 t = new Num3();
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++)
//             arr[i] = sc.nextInt();
//         for (int x : t.solution(n, arr))
//             System.out.print(x + " ");
//     }
// }

// /**
//  * 복습 : 삽입정렬(1월7일)
//  * 한개 값을 정한 후, 크기를 비교하여 적당한 위치 찾아 해당 위치에 삽입해준다. 이미 존재한 값들은 한개씩 뒤로 밀어준다.
//  * 
//  */
// import java.util.*;
// public class Num3 {
//     public int[] solution(int n, int[] arr) {
//         for (int i = 1; i < n; i++) {
//             int tmp = arr[i];
//             int j;
//             for (j = i - 1; j >= 0; j--) {
//                 if (arr[j] > tmp)
//                     arr[j + 1] = arr[j];
//                 else
//                     break;
//             }
//             arr[j + 1] = tmp;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Num3 t = new Num3();
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++)
//             arr[i] = sc.nextInt();
//         for(int x : t.solution(n,arr))
//             System.out.print(x+" ");
//         sc.close();
//     }
// }