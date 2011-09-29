#include <iostream>
using namespace std;

int main()
{
	float average, num, numvalues;
	float averages[30];
	int setcount = 0, gogogo = 1;
	while(gogogo == 1)
	{
		average = 0;
		cout << "Please enter how many numbers you want to be averaged: ";
		cin >> numvalues;
		for(int i=1;i <= numvalues; i++)
		{
			cout << "#" << i << ":";
			cin >> num;
			average += num;
		}
		average = average / numvalues;
		averages[setcount] = average;
		setcount++;
		cout << "Do you want to go again? ( 1 for yes, 0 for no): ";
		cin >> gogogo;

	}

	for(int i=0; i < setcount; i++)
	{
		cout << "The average for set #" << i+1 << " is: " << averages[i] << "\n";
	}

	cout << "Program is complete. Thank you, come again.";

	return 0;

}
