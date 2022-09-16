public class 可变参数 {
    public static void main(String[] args) {
        int re[]=character(1,2,3);
        for (int i = 0; i < re.length; i++) {
            System.out.println(re[i]);
        }
    }
    public static int[] character(int...nums) {
        int[] result=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i]=nums[i];
        }
        return result;
    }
}
