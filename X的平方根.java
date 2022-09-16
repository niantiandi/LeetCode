import java.util.Scanner;

public class X的平方根 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int x;
            System.out.println("请输入X:");
            x=input.nextInt();
            System.out.println("结果为:"+MySqrt(x));
        }
    }
    public static int MySqrt(int x) {
        if(x == 1)
            return 1;
        int min = 0;
        int max = x;
        while(max-min>1)
        {
            int m = (max+min)/2;
            if(x/m<m)
                max = m;
            else
                min = m;
        }
        return min;
    }
}