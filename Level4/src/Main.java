// 1번 - 브론즈5 : 갯수 세기
// import java.util.*;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int count = 0;
//         int[] array = new int[sc.nextInt()];

//         for(int i=0;i<array.length;i++)
//             array[i] = sc.nextInt();
//         int v = sc.nextInt();
//         for(int i=0;i<array.length;i++){
//             if(array[i]==v)
//                 count++;
//         }
//         System.out.println(count);
//     }
// }

// 2번 - 브론즈5 : X보다 작은 수
// import java.io.*;
// import java.util.*;
// public class Main {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int size = Integer.parseInt(st.nextToken());
//         int array[] = new int[size];
//         int num = Integer.parseInt(st.nextToken());

//         StringTokenizer arraySt = new StringTokenizer(br.readLine());
//         for(int i=0;i<array.length;i++)
//             array[i]=Integer.parseInt(arraySt.nextToken());
//         for(int i=0;i<array.length;i++)
//         {
//             if(array[i]<num)
//                 bw.write(array[i]+" ");
//             else
//                 continue;
//         }
//         bw.flush();
//         bw.close();
//     }
// }

// 3번 - 브론즈3 : 최소, 최대
// import java.util.*;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);

//         int[] array = new int[sc.nextInt()];

//         for(int i=0;i<array.length;i++)
//             array[i] = sc.nextInt();
        
//         Arrays.sort(array);
//         System.out.printf("%d %d",array[0],array[array.length-1]);
//     }
// }

// 4번 - 브론즈3 : 최댓값
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
//         int[] array = new int[10];
//         for(int i=0;i<9;i++)
//         {
//             array[i]=sc.nextInt();
//             hashmap.put(array[i],i+1);
//         }
//         Arrays.sort(array);
//         System.out.printf("%d\n%d",array[array.length-1],hashmap.get(array[array.length-1]));
//     }
// }

// 5번 - 브론즈5 : 과제 안내신 분...?(배열 사용)
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<28;i++)
            ar.add(Integer.parseInt(br.readLine()));
        for(int i=1;i<=30;i++){
            if(ar.contains(i))
                continue;
            else
                System.out.println(i);
        }
    }
}

// 6번 - 브론즈2 : 나머지
/*
알고리즘 풀이 : 입력값에 42로 나눈 나머지가 만약 39 40 41 0 1 2 40 41 0 1 이라면
중복되지 않는, 즉 서로 다른 값들은 0,1,2,39,40,41 이 된다. 0번 인덱스와 1~9번인덱스 비교, 1번 인덱스와 2~9번인덱스 비교...하는 알고리즘을 통해
같은 값이 있을때마다 count변수에 + 를 해주도록 하였다. 이렇게 했을 떄 마지막까지 반복하게 되면, 6번인덱스에 있는 40은 그 뒤에 7,8,9번 인덱스의 값과 비교하였을때 중복이 없는셈이 되고
count에는 중복되는 쌍의 개수가 들어가게 된다(0,0)(1,1)(40,40)(41,41) -> 4개
중복되지 않는 서로 다른 값은 전체 10개 중 중복되는 값 4개 빼서 6개가 나오게 된다.
*/
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] array = new int[10];
//         int count = 0;
//         for(int i=0;i<array.length;i++)
//         {
//             array[i] = sc.nextInt()%42;
//         }
//         for(int i=0;i<array.length;i++)
//         {
//             for(int j=i+1;j<array.length;j++)
//             {
//                 if(array[i]==array[j])
//                 {
//                     count++;
//                     break;
//                 }
//             }
//         }
//         System.out.println(array.length-count);
//     }
// }

// 7번 - 브론즈1 : 평균
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float[] score = new float[sc.nextInt()];
//         float sum=0;
//         for(int i=0;i<score.length;i++)
//             score[i]=sc.nextFloat();
//         Arrays.sort(score);       
//         for(float i:score){
//             sum += i/score[score.length-1]*100;
//         }
//         System.out.println(sum/score.length);
//     }
// }

// 8번 - 브론즈2 : OX퀴즈
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[] str = new String[sc.nextInt()];
//         for(int i=0;i<str.length;i++)
//         {
//             int sum = 0;
//             str[i]=sc.next();
//             String[] temp = new String[str[i].length()];
//             temp = str[i].split("X");
//             for(int j=0;j<temp.length;j++)
//             {
//                 sum+=(temp[j].length())*(temp[j].length()+1)/2;
//             }
//             System.out.println(sum);
//         }
//     }
// }

// 9번 - 브론즈1 : 평균은 넘겠지
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for(int i=sc.nextInt();i>0;i--)
//         {
//             int[] score = new int[sc.nextInt()];
//             float avg = 0;
//             int count = 0;
//             for(int k=0;k<score.length;k++)
//             {
//                 score[k]=sc.nextInt();
//                 avg+=score[k];
//             }
//             avg/=score.length;
//             for(int j:score)
//             {
//                 if(j>avg)
//                     count++;
//             }
//             System.out.println(String.format("%.3f",(float)count/score.length*100)+"%");
//         }
//     }
// }