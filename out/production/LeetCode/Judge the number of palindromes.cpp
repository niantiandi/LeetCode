#include<iostream>
using namespace std;
class receive{
	public:
		int input;
		bool judge(int input);
};
bool receive :: judge(int input){
	int transfer=input;
	int Reverse=0;
	if(input<0){
		return false;
	}
	else{
		while(transfer!=0){
		Reverse=Reverse*10+transfer%10;
		transfer=transfer/10;
		}
		if(Reverse==input)
		return true;
		else{
			return false;
		}
	}
	
}
int main(){
	receive s;
	cout<<"请输入数字:";
	cin>>s.input;
	if(s.judge(s.input))
	cout<<s.input<<"是回文数";
	else if(s.judge(s.input)==false)
	cout<<s.input<<"不是回文数";
	return 0;
}
