#include <iostream>
using namespace std;

int f(int);

int main() {
	cout << f(5);
}
int f(int n)
{
	if(n==0 || n==1)
		return 1;
	if(n>1)
		return n * f(n-1);
}
