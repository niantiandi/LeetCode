public class 汉明距离 {
    public static void main(String[] args) {
        //FIXME: 4和14结果为3，预期结果为2。0100  1110.已解决
        System.out.println(hammingDistance(3,1));
//        int[] test=Binary(1);
//        for (int i = 0; i < test.length; i++) {
//            System.out.println(test[i]);
//        }
    }
    public static int hammingDistance(int x, int y) {
        int[] num1=reverse_Binary(x);
        int[] num2=reverse_Binary(y);
        int flag=0;
        if(num1.length>=num2.length){
            int[] new_num2=new int[num1.length];
            System.arraycopy(num2, 0, new_num2, 0, num2.length);
            for (int i = 0; i < new_num2.length; i++) {
                if(num1[i]!=new_num2[i]){
                    flag++;
                }
            }
        }
        else{
            int[] new_num1=new int[num2.length];
            System.arraycopy(num1, 0, new_num1, 0, num1.length);
            for (int i = 0; i < new_num1.length; i++) {
                if(new_num1[i]!=num2[i]){
                    flag++;
                }
            }
        }
        return flag;
    }
    public static int[] reverse_Binary(int num){
        StringBuilder s = new StringBuilder();
        int remainder;
        while (num!=0){
            remainder=num%2;
            num=num/2;
            s.append(remainder);
        }
//        s.reverse();
//        System.out.println(s);
        int[] result=new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i]=s.charAt(i)-'0';
        }
        return result;
    }
}
