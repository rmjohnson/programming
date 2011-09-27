#include <iostream>
using namespace std;

int main()
{
	float average, num, numvalues;
	int setcount = 1, gogogo = 1;
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
		cout << "The average for set #" << setcount << " is: " << average << "\n";
		setcount++;
		cout << "Do you want to go again? ( 1 for yes, 0 for no): ";
		cin >> gogogo;

	}

	cout << "Program is complete. Thank you, come again.";

	return 0;

}
