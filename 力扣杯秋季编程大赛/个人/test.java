package 力扣杯秋季编程大赛.个人;
public class test {
    public static void main(String[] args) {
        int test[]={1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1};
        int result[]=new int[test.length];
        for (int i = 0; i < result.length; i++) {
            result[i]=0;
        }
        int trans=0;
        for (int i = 0; i < test.length; i++) {
            if(test[i]==1){
                result[trans]++;
            }
            else
            trans++;
        }
        int max_result=0;
        for (int i = 0; i < result.length; i++) {
            if(result[i]>max_result){
                max_result=result[i];
            }
        }
        System.out.println(max_result);
    }
}
