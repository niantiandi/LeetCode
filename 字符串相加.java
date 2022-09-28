public class 字符串相加 {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int flag=0;
        StringBuffer answer=new StringBuffer();
        while (i>=0||j>=0||flag!=0){
            int x=i>=0?num1.charAt(i)-'0':0;
            int y=j>=0?num2.charAt(j)-'0':0;
            int result=x+y+flag;
            answer.append(result % 10);
            flag=result/10;
            i--;
            j--;
        }
        answer.reverse();
        return answer.toString();
    }
}
