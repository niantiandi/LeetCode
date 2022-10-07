package 力扣杯秋季编程大赛.团队;

public class 最小展台数量 {
    public int minNumBooths(String[] demand) {
        int sum=0;
        StringBuilder flag=new StringBuilder();

            flag= new StringBuilder(demand[0]);
            for (int i = 1; i < demand.length; i++) {
                char c;
                for (int j = 0; j < demand[i].length(); j++) {
                    c=demand[i].charAt(j);
                    String ss=flag.toString();
                    if (!ss.contains(String.valueOf(c))) {
                        flag.append(c);
                    }
                }
            }
            sum=flag.length();


        return sum;
    }

    /*
        if (demand.length==0){
            sum=0;
        }
        else{
            sum=demand[0].length();
            for (int i = 1; i < demand.length; i++) {
                sum += demand[i].length();
                for (int j = 0; j < i-1; j++) {
                    for (int k = 0; k < demand[j].length(); k++) {
                        char c=demand[j].charAt(k);
                        if(demand[i].contains(String.valueOf(c))){
                            sum--;
                        }
                    }
                }
            }
        }
*/

}