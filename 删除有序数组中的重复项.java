import java.util.Scanner;


public class 删除有序数组中的重复项 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int length=0;
            System.out.println("请输入数组长度:");
            length=input.nextInt();
            int[] nums=new int[length];
            System.out.println("请输入数组:");
            for (int i=0;i<nums.length;i++) {
                nums[i]=input.nextInt();
            }
            deleate(nums);
        }
    }

    public static void deleate(int[] nums) {
        String[] transfer_1=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            transfer_1[i]=String.valueOf(nums[i]);
        }

        String flag=transfer_1[0];
        
        for (int i=0;i<transfer_1.length-1;i++) {
            flag=transfer_1[i];
            for(int j=1;j<transfer_1.length;j++){
                if(transfer_1[j]==flag){
                    transfer_1[j]=null;
                }
            }
        }


        //FIXME:
        String[] transfer_2=new String[nums.length];
        for(int jj=0;jj<transfer_2.length;jj++){
            transfer_2[jj]="0";
        }
        int flag_2=0;
        for(int k=0;k<transfer_1.length;k++){
            if(transfer_1[k]!=null){
                transfer_2[flag_2]=transfer_1[k];
                flag_2=flag_2++;
        }

        for(int kk=0;kk<nums.length;kk++){
            System.out.println(transfer_2[kk]);
        }
    }
}
}