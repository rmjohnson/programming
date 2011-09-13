#include <iostream>

using namespace std;


int multiply(int, int);
int difference(int, int);
int addition(int, int);
float division(float, float);


int main() //START OF MAIN FUNCTION
{
	/////////////
	//Variables//
	/////////////
	int num1,num2,result; //The first number to be multiplied, the second number to be multiplied, 
								 //and the result of the multiplication.

	float divresult;

	////////////////////
	//Body of program//
	//////////////////
	cout << "Please enter the first integer: "; //Prompt the user for the first number
	cin >> num1; //Get input for first number

	cout << "\nPlease enter the second integer: "; //Prompt the user for the second number
	cin >> num2; //Get input for second number
	
	result = multiply(num1,num2); //Multiply the numbers together

	cout << "\n" << num1 << " * " << num2 << " = " << result; //The final output in the form x * y = z

	result = difference(num1,num2); //Get the difference

	cout << "\n" << num1 << " - " << num2 << " = " << result; //The final output in the form x - y = z

	result = addition(num1,num2); //Get the sum

	cout << "\n" << num1 << " + " << num2 << " = " << result; //The final output in the form x + y = z

	divresult = division(num1,num2); //Divide the numbers

	cout << "\n" << num1 << " / " << num2 << " = " << divresult; //The final output in the form x / y = z

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
float division(float pnum1, float pnum2)
{
	return pnum1/pnum2;
}
