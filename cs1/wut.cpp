//Initialize and input 3 integers. initialize an average variable, set average = (n1 + n2 + n3)/3. output average.


#include <iostream>

using namespace std;

int main()
{
	int n1,n2,n3;
	float average;

	cout << "Please input the first integer: ";
	cin >> n1;

	cout << "Please input the second integer: ";
	cin >> n2;

	cout << "Please input the third integer: ";
	cin >> n3;

	average = (float)(n1 + n2 + n3)/3;

	cout << average;

}
