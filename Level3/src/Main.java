// 1번
// import java.util.*;
// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);

//         int input = sc.nextInt();

//         for(int i=1;i<=9;i++)
//             System.out.printf("%d * %d = %d\n",input,i,input*i);
//     }
// }

//2번
// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();
//         int[] sum = new int[T];

//         for(int i=0;i<T;i++)
//         {
//             sum[i]=sc.nextInt()+sc.nextInt();
//         } 
//         for(int i=0;i<sum.length;i++)
//             System.out.println(sum[i]);
//     }
// }

//3번
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int sum=0,T = 0;
//         T=sc.nextInt();
//         for(int i=1;i<=T;i++)
//             sum+=i;
//         System.out.println(sum);
//     }
// }

//4번
// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int price = sc.nextInt();
//         int kind = sc.nextInt();
//         for(int i=0;i<kind;i++)
//             price-=sc.nextInt()*sc.nextInt();
//         if(price==0)
//             System.out.println("Yes");
//         else
//             System.out.println("No");
//     }
// }

//5번
// import java.io.*;
// import java.util.*;
// public class Main {

//     public static void main(String[] args) throws IOException{
//         // BufferedReader / BufferedWriter 사용시 - 메모리 236MB, 소요시간 864ms

//         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//         int T=Integer.parseInt(bf.readLine());
//         for(int i=0;i<T;i++)
//         {
//             StringTokenizer st = new StringTokenizer(bf.readLine());
//             bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
//         }
//         bw.flush();
//         bw.close();

//         // 기존 방법인 Scanner 와 Println 사용시 - 결과는 동일하지만 백준에 제출시 시간초과 나옴.
//         // Scanner sc = new Scanner(System.in);

//         // int T = sc.nextInt();
//         // int[] sum = new int[T];
//         // for(int i=0;i<T;i++)
//         //     sum[i]=sc.nextInt()+sc.nextInt();
//         // for(int i=0;i<sum.length;i++)
//         //     System.out.println(sum[i]);        
//     }
// }

// 6번
// import java.io.*;
// import java.util.*;
// public class Main {

//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//         int T = Integer.parseInt(br.readLine());
//         for(int i=1;i<=T;i++)
//         {
//             StringTokenizer st = new StringTokenizer(br.readLine());
//             bw.write("Case #"+i+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
//         }
//         bw.flush();
//         bw.close();
//     }
// }

//7번
// import java.io.*;
// import java.util.*;
// public class Main {

//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         int T = Integer.parseInt(br.readLine());
//         for(int i=1;i<=T;i++)
//         {
//             StringTokenizer st = new StringTokenizer(br.readLine());
//             int num1 = Integer.parseInt(st.nextToken());
//             int num2 = Integer.parseInt(st.nextToken());
//             bw.write("Case #"+i+": "+num1+" + "+num2+" = "+(num1+num2)+"\n");
//         }
//         bw.flush();
//         bw.close();
//     }
// }

//8번
// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<=i;j++)
//                 System.out.print("*");
//             System.out.println();
//         }
//     }
// }

//9번
// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n =sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             for(int j=n-i-1;j>0;j--)
//                 System.out.print(" ");
//             for(int k=0;k<=i;k++)
//                 System.out.print("*");
//             System.out.println();
//         }
//         // repeat 활용한 코드 : 문자열.repeat(n) 하게 되면 문자열을 n회 만큼 반복한다.
//         // for(int i=1;i<=n;i++)
//         //     System.out.println(" ".repeat(n-i)+"*".repeat(i));
//     }
// }

//10번
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

//11번
// import java.util.*;
// public class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         while(true){
//             int num1=sc.nextInt();
//             int num2 = sc.nextInt();
//             if(num1==0 && num2==0)
//                 break;
//             else
//                 System.out.println(num1+num2);
//         }
//     }
// }

//12번
// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         while(sc.hasNextInt())
//         {
//             int num1=sc.nextInt(),num2 = sc.nextInt();
//             System.out.println(num1+num2);
//         }
//     }
// }

//13번
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0,num2=0,count=1;
        int input=sc.nextInt();
        int temp = input;
        while(true)
        {
            if(temp<10)
                num1=0;
            else
                num1=temp/10;
            num2=temp%10;
            if(input == (num2*10)+((num1+num2)%10))
                break;
            else
                temp = (num2*10)+((num1+num2)%10);
                count++;
        }
        System.out.println(count);
    }
}
