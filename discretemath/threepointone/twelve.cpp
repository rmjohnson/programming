#include <iostream>
using namespace std;

int h(int);

int main() {
	cout << h(7);
}

int h(int n)
{
	if(n==1)
		return 1;
	if(n>1)
		return h(n-1)+6*n-6;
}
