//AD
//1. Setup 2. Read name 3. Write statement to file 4.For loop through 2 and 3. 5. Close files. 6. Write statement. 7. EAT PIZZA!
#include <iostream>
#include <fstream>
using namespace std;

int main()
{
	ifstream input;
	ofstream output;
	string name;

	input.open("input.txt");
	output.open("nametags.txt");

	for(int i=0;i<6;i++)
	{
		input >> name;
		output << "Hello my name is " << name << ".\n";
	}

	input.close();
	output.close();

	cout << "Program complete. Output file: nametags.txt";

	return 0;
}

		
