import java.util.Scanner;

public class X的平方根 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        System.out.println("请输入X:");
        x=input.nextInt();
        System.out.println("结果为:"+MySqrt(x));
    }
    public static int MySqrt(int x) {
        int result=0;
        int m,n;
        if(x==1||x==0){
            result=x;
        }
        else{
            m=x/2;
            n=(m+x/m)/2;
            while(m-n>1){
                m=n;
                n=(m+x/m)/2;
            }
            result=n;
        }
        return result;
    }
}