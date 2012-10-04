#include <iostream>
using namespace std;

int l(int);

int main()
{
	for(int i=1;i<=12;i++)
	{
		cout << i << ": ";
		cout << l(i) << endl;
	}
}
int l(int n)
{
	if(n==1)
		return 1;
	if(n==2)
		return 3;
	if(n>2)
		return l(n-1)+l(n-2);
}
