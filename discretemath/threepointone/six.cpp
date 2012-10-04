#include <iostream>
using namespace std;

int p(int);

int main() {
	for(int i=1;i<=4;i++)
	{
		cout << i << " : " << p(i) << endl;
	}
}

int p(int n)
{
	if(n==0)
		return 0;
	if(n>0)
		return (p(n-1)) * (p(n-1)) - n;
}
