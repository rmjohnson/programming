//Lab 5 by Ryan Johnson
//Alogrithm Design: Get all the coefficients from the user and assign them to variables (a,b,c,d,e). Display the function, only showing if the coefficient is not 0 and
//using a minus symbol where appropriate. Get all the x values the user wants to use and store them in an array. Calculate the answers using the supplied x's and
//a power function. The power function loops the number of times that the power is, multiplying the supplied number by itself that many times.
//At the very end output all the answers and then a nice statement saying that the program completed.
#include <iostream>
#include <fstream>
using namespace std;

float pow(float,float);
float function(float,float,float,float,float,float);

int main()
{

	float a,b,c,d,e;
	float xfx[25][2]; //Stores all the x's anf(x)'s.
	int i=0;
	ifstream inputFile;
	ofstream outputFile;
	inputFile.open("functioninfo.txt");
	outputFile.open("functionoutput.txt");

	inputFile >> a;
	inputFile >> b;
	inputFile >> c;
	inputFile >> d;
	inputFile >> e;

	outputFile << "f(x)= ";
		outputFile << a << "x^4 ";
	if(b < 0)
		outputFile << "- " << b*-1;
	else
	{
		outputFile << "+ " << b;
		outputFile << "x^3 ";	
	}
	if(c < 0)
		outputFile << "- " << c*-1;
	else
	{
		outputFile << "+ " << c;
		outputFile << "x^2 ";
	}
	if(d < 0)
		outputFile << "- " << d*-1;
	else
	{
		outputFile << "+ " << d;
		outputFile << "x ";
	}
	if(e < 0)
		outputFile << "- " << e*-1;
	else
	{
		outputFile << "+ " << e;
		outputFile << "\n";	
	}

	while(!inputFile.eof())
	{
		inputFile >> xfx[i][0];
		xfx[i][1] = function(a,b,c,d,e,xfx[i][0]);
		i++;
	}
	for(int n=0;n<i;n++)
	{
		outputFile << "f(" << xfx[n][0] << ")= "<< xfx[n][1] << "\n";
	}

	cout << "Program completed without error, have a nice day!";

	inputFile.close();
	outputFile.close();
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
