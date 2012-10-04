#include <iostream>
using namespace std;

int s(int);

int main() {
	cout << s(5);
}
int s(int n)
{
	if(n==1)
		return 50000;
	if(n>1)
		return s(n-1) * 1.05 + 3000;
}
