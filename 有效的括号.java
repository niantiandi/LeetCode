    /*
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。有效字符串需满足：
     * 有效字符串需满足：
     * 1、左括号必须用相同类型的右括号闭合.
     * 2、左括号必须以正确的顺序闭合。
     * 
     * 示例 1：
     * 输入：s = "()"
     * 输出：true
     * 
     * 示例 2：
     * 输入：s = "()[]{}"
     * 输出：true
     * 
     * 示例 3：
     * 输入：s = "(]"
     * 输出：false
     * 
     * 示例 4：
     * 输入：s = "([)]"
     * 输出：false
     * 
     * 示例 5：
     * 输入：s = "{[]}"
     * 输出：true
     * 
     !提示：
     !1 <= s.length <= 10^4
     !s 仅由括号 '()[]{}' 组成
     */
//FIXME:
import java.util.Scanner;
public class 有效的括号 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String s;
            System.out.println("请输入字符串:");
            s=input.next();
            // System.out.println(s);
            boolean re=isValid(s);
            System.out.println(re);
        }
    }

    public static boolean isValid(String s) {
        int length=s.length()/2;
        for (int i = 0; i < length; i++) {
            s=s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        return s.length()==0;
    }
}
