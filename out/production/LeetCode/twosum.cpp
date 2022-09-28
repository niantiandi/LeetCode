#include <iostream>
using namespace std;
int main(){
		int num;
		int count=0;
		int arr[100];
		int target;
		cout<<"编译完成……\n"<<"请输入数组："; 
		while(1){
			cin>>num;
			arr[count++]=num;
			char c=getchar();
			if(c=='\n')
				break;
		}
		cout<<"请输入目标值：";
		cin>>target;
		for(int i=0;i<count-1;i++)
			for(int j=0;(j<count)&&(j!=i);j++){
		        if(target==arr[i]+arr[j])
			    cout<<"["<<j<<","<<i<<"]"<<endl;
			}
		return 0;
}
