#include <iostream>

using namespace std;


int multiply(int, int);
int difference(int, int);
int addition(int, int);
float division(float, float);
void menu();


int main() //START OF MAIN FUNCTION
{
	/////////////
	//Variables//
	/////////////
	int num1,num2,result, menuinput; //The first number to be multiplied, the second number to be multiplied, 
								 //and the result of the multiplication.

	float divresult;

	////////////////////
	//Body of program//
	//////////////////

	menu();
	cin >> menuinput;

	cout << "Please enter the first integer: "; //Prompt the user for the first number
	cin >> num1; //Get input for first number

	cout << "\nPlease enter the second integer: "; //Prompt the user for the second number
	cin >> num2; //Get input for second number

	if(menuinput==1)
	{
		result = multiply(num1,num2); //Multiply the numbers together
		cout << "\n" << num1 << " * " << num2 << " = " << result; //The final output in the form x * y = z
	}
	else if(menuinput==2)
	{
		divresult = division(num1,num2); //Divide the numbers
		cout << "\n" << num1 << " / " << num2 << " = " << divresult; //The final output in the form x / y = z
	}
	else if(menuinput==3)
	{
		result = addition(num1,num2); //Get the sum
		cout << "\n" << num1 << " + " << num2 << " = " << result; //The final output in the form x + y = z
	}
	else if(menuinput==4)
	{
		result = difference(num1,num2); //Subtract the numbers
		cout << "\n" << num1 << " - " << num2 << " = " << result; //The final output in the form x - y = z
	}
	else
	{
		cout << "Invalid input.";
	}
	return 0;
 
} //END OF MAIN FUNCTION

//Mutiply takes two integers and returns their product.
int multiply(int pnum1, int pnum2)
{
	return pnum1*pnum2;
}
//Difference takes two integers and returns their difference.
int difference(int pnum1, int pnum2)
{
	return pnum1-pnum2;
}
//addition takes two integers and returns their sum.
int addition(int pnum1, int pnum2)
{
	return pnum1+pnum2;
}
//Division takes two floats and returns their quotient.
float division(float pnum1, float pnum2)
{
	return pnum1/pnum2;
}
void menu()
{
	cout << "Please select the operation you would like to perform.\n";
	cout << "(1)Multiplication\n";
	cout << "(2)Division\n";
	cout << "(3)Addition\n";
	cout << "(4)Subtraction\n";
	cout << "Input: ";
}
