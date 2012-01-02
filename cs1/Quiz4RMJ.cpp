//C++ is dumb
#include <iostream>
using namespace std;

float average(float);

int main() {

	string firstname, lastname, lettergrade;
	float ave, score;

	cout << "Please input your first name: ";
	cin >> firstname;
	cout << "Please input your last name: ";
	cin >> lastname;

	for(int i=0;i<4;i++)
	{
		cout << "Please input your score for exam #" << i+1<< ": ";
		cin >> score;
		ave = ave + score;
	}
	
	ave = average(ave);
	if(ave < 60)
		lettergrade = "F";
	else if(ave < 70)
		lettergrade = "D";
	else if(ave < 80)
		lettergrade = "C";
	else if(ave < 90)
		lettergrade = "B";
	else if(ave <= 100)
		lettergrade = "A";

	cout << "Name: " << lastname << ", " << firstname << "\n";
	cout << "Letter Grade: " << lettergrade << "\n";
	cout << "Course Average: " << ave << "\n";

	return 0;
}

float average(float pave)
{
	return pave/4;
}
