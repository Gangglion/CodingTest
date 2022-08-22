// 1번
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int a,b=0;

//         a=sc.nextInt();
//         b=sc.nextInt();

//         if(a<b)
//             System.out.println("<");
//         else if(a>b)
//             System.out.println(">");
//         else
//             System.out.println("==");
//     }
// }

// 2번
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);

//         int score = sc.nextInt();

//         if (score >= 90 && score <= 100)
//             System.out.println("A");
//         else if (score >= 80 && score <= 89)
//             System.out.println("B");
//         else if (score >= 70 && score <= 79)
//             System.out.println("C");
//         else if(score>=60 && score<=69)
//             System.out.println("D");
//         else
//             System.out.println("F");
//     }
// }

// 3번
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);

//         int score = sc.nextInt();

//         if ((score % 4 == 0 && score % 100 != 0) || (score % 4 == 0 && score % 400 == 0))
//             System.out.println("1");
//         else
//             System.out.println("0");
//     }
// }

// 4번
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);

//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         if (num1 > 0 && num2 > 0)
//             System.out.println("1");
//         else if (num1 < 0 && num2 > 0)
//             System.out.println("2");
//         else if (num1 < 0 && num2 < 0)
//             System.out.println("3");
//         else if (num1 > 0 && num2 < 0)
//             System.out.println("4");
//     }
// }

//5번
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
        
//         int hour = sc.nextInt();
//         int min = sc.nextInt();

//         if(min<45)
//         {
//             if(hour==0)
//                 System.out.printf("%d %d",(hour+24)-1,(min+60)-45);
//             else
//                 System.out.printf("%d %d",hour-1,(min+60)-45);
//         }
//         else
//             System.out.printf("%d %d",hour,min-45);
//     }
// }

// 6번
// 내가 짠 코드
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
        
//         int[] nowTime = new int[]{sc.nextInt(),sc.nextInt()+sc.nextInt()};

//         if(nowTime[1]>=60)
//         {
//             nowTime[0]+=nowTime[1]/60;
//             nowTime[1]%=60;
//         }
//         if(nowTime[0]>=24)
//             nowTime[0]%=24;
//         System.out.printf("%d %d",nowTime[0],nowTime[1]);
//     }
// }
// 숏코딩 보고 수정한 코드 - %연산해서 나머지가 있냐 없냐 를 if를 통해 검사했는데, 사실 생각해보면 60분 기준으로 %60 하면 60보다 크거나 작다는 조건을 여기서 검사하는
// 셈이 된다. 따라서 if를 거치지 않고 %연산을 바로 수행해도 같은 결과가 나온다.
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
        
//         int[] nowTime = new int[]{sc.nextInt(),sc.nextInt()+sc.nextInt()};

//         System.out.printf("%d %d",(nowTime[0]+nowTime[1]/60)%24,nowTime[1]%60);
//     }
// }

// 7번
// import java.util.*;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
        
//         int[] dice = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()};
//         Arrays.sort(dice);

//         if(dice[0]==dice[1]&&dice[0]==dice[2])
//             System.out.println(10000+dice[0]*1000);
//         else if(dice[1]==dice[0]||dice[1]==dice[2])
//             System.out.println(1000+dice[1]*100);
//         else
//             System.out.println(dice[2]*100);
//     }
// }