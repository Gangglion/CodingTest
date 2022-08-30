// 1번
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

// 2번
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

// 3번
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int count = array.length;
        for(int i=0;i<array.length;i++)
        {
            array[i] = sc.nextInt()%42;
        }
        Arrays.sort(array);
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                    count--;
            }
        }
        if(count<0) count=1;
        System.out.println(count);
    }
}