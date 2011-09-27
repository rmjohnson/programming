#include <iostream>
using namespace std;


int main()
{
	int lowB, upB, product = 1;

	cout << "Please enter beginning integer: ";
	cin >> lowB;
	cout << "Please enter ending intger: ";
	cin >> upB;

	for (int i=lowB; i <= upB; i++)
	{
		product = product * i;
	}
	cout << "The product: " << product << "\n";

	return 0;

}
