#include <iostream>
using namespace std;

int q(int);

int main() {
	cout << q(5);
}

int q(int n)
{
	if(n==0)
		return 0;
	if(n==1)
		return 1;
	if(n==2)
		return 2;
	if(n>2)
		return q(n-1) + q(n-2) + q(n-3);
}
