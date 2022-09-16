// import java.util.Scanner;


/*
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
 * 将最终结果插入 nums 的前 k 个位置后返回 k 。
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */

public class 删除有序数组中的重复项 {

    public static void main(String[] args) {
        //!#region
        // try (Scanner input = new Scanner(System.in)) {
        //     int length=0;
        //     System.out.println("请输入数组长度:");
        //     length=input.nextInt();
        //     int[] nums=new int[length];
        //     System.out.println("请输入数组:");
        //     for (int i=0;i<nums.length;i++) {
        //         nums[i]=input.nextInt();
        //     }
        //     deleate(nums);
        // }


        int nums[]=nums_in(1,2,2,5,3);
        int nums_length=removeDuplicates(nums);
        System.out.println("删除后的数组长度为:"+nums_length);
    }

    //FIXME:
    public static int removeDuplicates(int nums[]) {
        if(nums==null || nums.length == 1){
            return nums.length;
        }
        int i = 0,j =1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }


    public static int[] nums_in(int...nums) {
        int[] result=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i]=nums[i];
        }
        return result;
    }


    //#region
    // public static void deleate(int[] nums) {
    //     String[] transfer_1=new String[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         transfer_1[i]=String.valueOf(nums[i]);
    //     }

    //     String flag=transfer_1[0];
        
    //     for (int i=0;i<transfer_1.length-1;i++) {
    //         flag=transfer_1[i];
    //         for(int j=1;j<transfer_1.length;j++){
    //             if(transfer_1[j]==flag){
    //                 transfer_1[j]=null;
    //             }
    //         }
    //     }


    //     //FIXME:
    //     String[] transfer_2=new String[nums.length];
    //     for(int jj=0;jj<transfer_2.length;jj++){
    //         transfer_2[jj]="0";
    //     }
    //     int flag_2=0;
    //     for(int k=0;k<transfer_1.length;k++){
    //         if(transfer_1[k]!=null){
    //             transfer_2[flag_2]=transfer_1[k];
    //             flag_2=flag_2++;
    //     }

    //     for(int kk=0;kk<nums.length;kk++){
    //         System.out.println(transfer_2[kk]);
    //     }
    // }
    // }


}


