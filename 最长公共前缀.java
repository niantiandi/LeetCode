/*
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 
 * 示例 2：
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * 
 * 提示：
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 */
import java.util.Scanner;
public class 最长公共前缀 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] strs=new String[3];
            System.out.println("请输入：");
            for(int i=0;i<3;i++){
                strs[i]=input.next();
            }

            System.out.println(longestCommonPrefix(strs));
        }

        // System.out.println("结果是：");
        // for(int i=0;i<3;i++){
        //     System.out.println(strs[i]);
        // }
        
    }


    //FIXME:
    public static String longestCommonPrefix(String[] strs){
        if(strs.length==0)
        return "";
        //公共前缀比所有字符串都短，随便选一个先
        String s=strs[0];
        for (String string : strs) {
            while(!string.startsWith(s)){

                if(s.length()==0){
                    return "";
                }
                
                //公共前缀不匹配就让它变短！
                else{
                    s=s.substring(0,s.length()-1);
                }
                
            }
        } 
        return s;
    }


}


        
        
        
       
        