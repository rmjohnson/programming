// Ryan Johnson Lab 3
// Alogrith Design: Input data (first name, last name, payrate, and hours worked). Check if overtime pay is needed, and if so calculate it with a function. 
// Calculate the gross pay. Calculate both taxes with one function (calling it twice). Calculate the net pay. Ask if the user would like an itemized list
// or just their net pay and output accordingly (the itemized list should be a function call).
#include <iostream>
using namespace std;
float overtime(float,float); // (payrate, hours) Overtime is past 40 hours
float taxes(float, float); //(grosspay, taxrate)
void display(string, string, float, float, float, float, float, float); //(firstname, lastname, regpay, ot, gross, incometax, sstax, netpay)
int main()
{
	string firstname,lastname;
	float payrate, hours, regpay, ot, gross, incometax, sstax, incometaxrate = 0.06, sstaxrate = 0.055, netpay;
	int input;

	cout << "Please enter your first name: ";
	cin >> firstname;
	cout << "Please enter your last name: ";
	cin >> lastname;
	
	cout << "Please enter your hourly pay: ";
	cin >> payrate;
	cout << "Please enter how many hours you worked: ";
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
	cout << "Please select an option.\n";
	cout << "(1) Itemized List\n";
	cout << "(2) Just net pay\n";
	cin >> input;
	if(input == 1)
		display(firstname, lastname, regpay, ot, gross, incometax, sstax, netpay);
	else if(input == 2)
		cout << firstname << " " << lastname << " ===> $" << netpay << "\n";

	return 0;
	
}

float overtime(float ppayrate, float phours)
{
	return ppayrate * phours * 1.5;
}
float taxes(float pgross,float ptaxrate)
{
	return pgross * ptaxrate;
}
void display(string pfirstname, string plastname, float pregpay, float pot, float pgross, float pincometax, float psstax, float pnetpay)
{
	cout << "Name ===> " << pfirstname << " " << plastname << "\n";
	cout << "Regulay Pay ===> $" << pregpay << "\n";
	cout << "Overtime Pay ===> $" << pot << "\n";
	cout << "<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3\n";
	cout << "Gross Pay ===> $" << pgross << "\n";
	cout << "Income Tax ===> $" << pincometax << "\n";
	cout << "SS Tax ===> $" << psstax << "\n";
	cout << "<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3\n";
	cout << "Net Pay ===> $" << pnetpay << "\n";
}
	
