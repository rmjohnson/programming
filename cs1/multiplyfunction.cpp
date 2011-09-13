#include <iostream>

using namespace std;


int multiply(int, int);


int main() //START OF MAIN FUNCTION
{
	/////////////
	//Variables//
	/////////////
	int num1,num2,result; //The first number to be multiplied, the second number to be multiplied, 
								 //and the result of the multiplication.

	////////////////////
	//Body of program//
	//////////////////
	cout << "Please enter the first integer to be multiplied: "; //Prompt the user for the first number
	cin >> num1; //Get input for first number

	cout << "\nPlease enter the second integer to be multiplied: "; //Prompt the user for the second number
	cin >> num2; //Get input for second number
	
	result = multiply(num1,num2); //Multiply the numbers together

	cout << "\n" << num1 << " * " << num2 << " = " << result; //The final output in the form x * y = z

	return 0;
 
} //END OF MAIN FUNCTION

//Mutiply takes two integers and returns their product.
int multiply(int pnum1, int pnum2)
{
	return pnum1*pnum2;
}
