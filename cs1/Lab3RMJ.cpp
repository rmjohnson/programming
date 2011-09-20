//Ryan Johnson Lab 3
//Alogrith Design:
#include <iostream>
using namespace std;
int overtime(int,int) // (payrate, hours) Overtime is past 40 hours
int taxes(int, int) //(grosspay, taxrate)
void display(string, string, int, int, int, int, int, int) //(firstname, lastname, regpay, ot, gross, incometax, sstax, netpay)
int main()
{
	string firstname,lastname;
	int payrate, hours, regpay, ot, gross, incometax, sstax, incometaxrate = 0.06, sstaxrate = 0.055, netpay;

	cout << "Please enter your first name: ";
	cin >> firstname;
	cout << "Please enter your last name: ";
	cin >> lastname;
	
	cout << "Please enter your hourly pay: ";
	cin >> payrate;
	cout << "Pleasse enter how many hours you worked: ";
	cin >> hours;

	if(hours > 40)
	{
		ot = overtime(payrate, hours - 40);
		regpay = 40*payrate;
	}
	else
	{	
		regpay = hours*payrate;
		ot = 0;	
	}
	gross = regpay + ot;
	incometax = taxes(gross, incometaxrate);
	sstax = taxes(gross, sstaxrate);
	netpay = gross - incometax - sstax;
	
	display(firstname, lastname, regpay, ot, gross, incometax, sstax, netpay);
	
}

int overtime(int ppayrate, phours)
{
	return ppayrate * phours * 1.5;
}
int taxes(int pgross, ptaxrate)
{
	return pgross * ptaxrate;
}
void display(string pfirstname, string plastname, int pregpay, int pot, int pgross, int pincometax, int psstax, int pnetpay)
{
	cout << "Name ===> " << pfirstname << " " << plastname << "\n";
	cout << "Regulay Pay ===> " << pregpay << "\n";
	cout << "Overtime Pay ===> " << pot << "\n";
	cout << "<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3\n";
	cout << "Gross Pay ===> " << pgross << "\n";
	cout << "Income Tax ===> " << pincometax << "\n";
	cout << "SS Tax ===> " << psstax << "\n";
	cout << "<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3\n";
	cout << "Net Pay ===> " << pnetpay << "\n";
}
	
