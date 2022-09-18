package 周赛311;

public class 最小偶倍数 {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        else
            return n*2;
    }
}
