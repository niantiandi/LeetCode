#include<iostream>
#include<string>
#include<stdlib.h>
using namespace std;
class solution{
	public:
		string s;
		string rev(string s){
			string rev;
			for(int i=s.size()-1;i>=0;i--){
				rev=rev+s[i];
			}
			return rev;
		}
		void compare(string s,string rev){
			int len=s.size();
			if(s==rev)
			cout<<"right";
			else
			cout<<"wrong";
		}
}; 
int main(){
	solution solu;
	cout<<"编译完成……\n"<<"请输入字符串:";
	cin>>solu.s;
	solu.compare(solu.s,solu.rev(solu.s));
	return 0;
}
