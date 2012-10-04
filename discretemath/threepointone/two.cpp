#include <iostream>
using namespace std;

int g(int);
int main()
{
	
	cout << g(1) << endl;
	cout << g(2) << endl;
	cout << g(12) << endl;
	return 0;
}

int g(int n)
{
	if(n <= 0)
		return 0;
	if(n==1 || n==2)
		return 1;
	if(n>2)
		return g(n-1)+g(n-2)-g(n-8);
}
