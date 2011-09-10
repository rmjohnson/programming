#include <iostream>

using namespace std;

int main()
{
	int sold;
	string firstname, lastname;
	float cost, commission, gross, incometax, sstax, netpay, incometaxpercent = .06, sstaxpercent = .055;

	cout << "Please input your first name: ";
	cin >> firstname;
	cout << "Please input your last name: ";
	cin >> lastname;

	cout << "Please input the number of widgets sold: ";
	cin >> sold;

	if(sold <= 25)
		cost = 15;
	else if(sold <= 50)
		cost = 10.5;
	else
		cost = 7.25;
	if(sold < 100)
		commission = 0.05;
	else
		commission = 0.12;
	
	gross = sold*cost*commission;
	incometax = incometaxpercent * gross;
	sstax = sstaxpercent * gross;
	netpay = gross - incometax - sstax;
	
	cout << "\n\nName: " << firstname << " " << lastname << "\n";
	cout << "Amount Sold: " << sold << "\n";
	cout << "Gross Pay: $" << gross << "\n";
	cout << "<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3\n";
	cout << "Income Tax: $" << incometax << "\n";
	cout << "Social Secuirt Tax: $" << sstax << "\n";
	cout << "<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3\n";
	cout << "Net Pay: $" << netpay << "\n";

	return 0;
}
