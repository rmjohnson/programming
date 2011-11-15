//Lab 4 by Ryan Johnson
//Alogrithm Design: Get all the coefficients from the user and assign them to variables (a,b,c,d,e). Display the function, only showing if the coefficient is not 0 and
//using a minus symbol where appropriate. Get all the x values the user wants to use and store them in an array. Calculate the answers using the supplied x's and
//a power function. The power function loops the number of times that the power is, multiplying the supplied number by itself that many times.
//At the very end output all the answers and then a nice statement saying that the program completed.
#include <iostream>
using namespace std;

float pow(float,float);
float function(float,float,float,float,float,float);

int main()
{

	float a,b,c,d,e;
	float x[25];
	float fx[25];
	int input=1;
	int i=0;

	cout << "Please enter the first coefficient: ";
	cin >> a;
	cout << "Please enter the second coefficient: ";
	cin >> b;
	cout << "Please enter the third coefficient: ";
	cin >> c;
	cout << "Please enter the fourth coefficient: ";
	cin >> d;
	cout << "Please enter the constant: ";
	cin >> e;

	cout << "The function you entered...\n";
	cout << "f(x)= ";
	if (a != 0)
		cout << a << "x^4 ";
	if(b < 0)
		cout << "- " << b*-1;
	else if(b != 0)
	{
		cout << "+ " << b;
		cout << "x^3 ";	
	}
	if(c < 0)
		cout << "- " << c*-1;
	else if(c != 0)
	{
		cout << "+ " << c;
		cout << "x^2 ";
	}
	if(d < 0)
		cout << "- " << d*-1;
	else if(d != 0)
	{
		cout << "+ " << d;
		cout << "x ";
	}
	if(e < 0)
		cout << "- " << e*-1;
	else if(e != 0)
	{
		cout << "+ " << e;
		cout << "\n";	
	}

	while(input)
	{
		cout << "Please enter a x value: ";
		cin >> x[i];
		fx[i] = function(a,b,c,d,e,x[i]);
		cout << "Would you like to enter another x value? (1 for yes, 0 for no): ";
		cin >> input;
		if(input)
			i++;
	}
	for(int n=0;n<=i;n++)
	{
		cout << "f(" << x[n] << ")= "<< fx[n] << "\n";
	}

	cout << "Program completed without error, have a nice day!";

	return 0;
}

float pow(float num, float exponent)
{
	float answer = 1;
	for(int i=0;i<exponent;i++)
	{
		answer = answer*num;
	}
	return answer;
}
float function(float a, float b, float c, float d, float e, float x)
{
	float fx=0;
	if(a!=0)
		fx = fx + a * pow(x,4);
	if(b!=0)
		fx = fx + b * pow(x,3);
	if(c!=0)
		fx = fx + c * pow(x,2);
	if(d!=0)
		fx = fx + d * x;
	if(e!=0)
		fx = fx + e;
	return fx;
}
