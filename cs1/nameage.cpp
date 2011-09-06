#include <iostream>

using namespace std;

int main()
{
	string name;
	int age;
	cout << "Please enter your first name: ";
	cin >> name;
	cout << "Please enter your age: ";
	cin >> age;

	if(age < 25)
		cout << name << ", you are quite young at the age of " << age << ".";
	else if(age < 35)
		cout << name << ", you are quite mature at the age of " << age << ".";
	else if(age < 50)
		cout << name << ", you are getting old at the age of " << age << ".";
	else
		cout << "Wow, " << name << ". You are over the hill at the age of " << age << ".";
	return 0;
}
