#include <iostream>
using namespace std;

int main()
{
	float average = 0, num, numvalues = 6;
	cout << "Please enter "  << numvalues << " numbers to be averaged.\n";
	for(int i=1;i <= numvalues; i++)
	{
		cout << "#" << i << ":";
		cin >> num;
		average += num;
	}
	average = average / numvalues;
	cout << "The average is: " << average;

	return 0;

}
