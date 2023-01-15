/**
 * Num2
 */
import java.util.*;
public class Num2 {

    public static void main(String[] args) {
        selfNum sn = new selfNum();
        for(int i=1;i<=10000;i++)
            sn.d(i);
        ArrayList<Integer> temp = sn.getAns();
        for(int i=0;i<temp.size();i++)
            System.out.println(temp.get(i));
    }
}
class selfNum{
    ArrayList<Integer> ar = new ArrayList<>();
    void d(int n){
        if(n==n/10000 + n/(n%10000)+n/1000 + n/(n%1000)+n/100 + n/(n%100)+n/10 + n/(n%10)+n%10)
            ar.add(n);
    }
    ArrayList<Integer> getAns(){
        return ar;
    }
}