package 双周赛87;

public class 统计共同度过的日子数 {
    public static void main(String[] args) {
        int res=countDaysTogether("09_01", "10-19", "06_19", "10-20");
        System.out.println(res);
    }
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        char Alice_arrive[]=arriveAlice.toCharArray();
        char Alice_leave[]=leaveAlice.toCharArray();
        char Bob_arrive[]=arriveBob.toCharArray();
        char Bob_leave[]=leaveBob.toCharArray();

        int Alice_arrive_month=Character.getNumericValue(Alice_arrive[0])*10+Character.getNumericValue(Alice_arrive[1]);
        int Alice_arrive_day=Character.getNumericValue(Alice_arrive[3])*10+Character.getNumericValue(Alice_arrive[4]);
        int Alice_leave_month=Character.getNumericValue(Alice_leave[0])*10+Character.getNumericValue(Alice_leave[1]);
        int Alice_leave_day=Character.getNumericValue(Alice_leave[3])*10+Character.getNumericValue(Alice_leave[4]);
        int Bob_arrive_month=Character.getNumericValue(Bob_arrive[0])*10+Character.getNumericValue(Bob_arrive[1]);
        int Bob_leave_month=Character.getNumericValue(Bob_leave[0])*10+Character.getNumericValue(Bob_leave[1]);
        int Bob_arrive_day=Character.getNumericValue(Bob_arrive[3])*10+Character.getNumericValue(Bob_arrive[4]);
        int Bob_leave_day=Character.getNumericValue(Bob_leave[3])*10+Character.getNumericValue(Bob_leave[4]);
        
        int[] year={31,28,31,30,31,30,31,31,30,31,30,31};

        int alice_arrivedays=Alice_arrive_day;
        for (int i = 0; i < Alice_arrive_month-1; i++) {
            alice_arrivedays+=year[i];
        }

        int alice_leavedays=Alice_leave_day;
        for (int i = 0; i < Alice_leave_month-1; i++) {
            alice_leavedays+=year[i];
        }

        int bob_arrivedays=Bob_arrive_day;
        for (int i = 0; i < Bob_arrive_month-1; i++) {
            bob_arrivedays+=year[i];
        }

        int bob_leavedays=Bob_leave_day;
        for (int i = 0; i < Bob_leave_month-1; i++) {
            bob_leavedays+=year[i];
        }



        //FIXME:没有考虑所有情况
        if(alice_leavedays<bob_arrivedays||bob_leavedays<alice_arrivedays){
            return 0;
        }
        else if(alice_arrivedays<=bob_arrivedays&alice_leavedays<=bob_leavedays||bob_arrivedays<=alice_arrivedays&bob_leavedays<=alice_leavedays){
            if(alice_leavedays>=bob_arrivedays){
                return alice_leavedays-bob_arrivedays+1;
            }
            else{
                return bob_leavedays-alice_arrivedays+1;
            }
        }
        else if(alice_arrivedays>bob_arrivedays){
            if(alice_leavedays<=bob_leavedays){
                return alice_leavedays-alice_arrivedays+1;
            }
            else{
                return bob_leavedays-alice_arrivedays+1;
            }
        }
        else if(bob_arrivedays>alice_arrivedays){
            if(bob_leavedays<=alice_leavedays){
                return bob_leavedays-bob_arrivedays+1;
            }
            else{
                return alice_leavedays-bob_arrivedays+1;
            }
        }
        else
        return 0;

    }
}
