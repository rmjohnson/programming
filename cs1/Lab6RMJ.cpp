//Lab 6 by Ryan Johnson
//Alogrithm Design:
/*Open the data file (ExperimentData.txt) and then read in the first two values (which will be rows and then columns.)
Those will be stored to variables and then used to create the size of the arrays needed (temp_column, data, and mins).
An above and below variable will also be needed to tally up how many minimums are above and below the average. 
The data is read from the file and stored into the data array using two for loops. The columns and then cycled through and
the minimums for each column are found by passing the column to a function and then they are stored in an array. The average
of the array is then calculated using a function and stored into a float. All of the minimums are then compared to the average
and how many are above and belowed are tallied up. If the difference between above and below is greater than one, then the data is rejected.
Otherwise, the data is accepted and the minimums are printed out to the screen using a nice pretty table that uses the number of digits to calculate
the size of it.

The average function will take the minimum array and the number of columns and then add up all the values in the array. This sum will then be
divided by the number of columns.

The minimum function will take in the temporary column array and the number of values in it. The first value in the array is set to a minimum variable,
and then then the rest of the array is looped through and if the value is less than the current minimum, the minimum gets set to the value.
*/
#include <iostream>
#include <fstream>

using namespace std;

float average( int[], int);
int minimum( int[], int);

int main() {

	ifstream input;
	input.open("ExperimentData.txt");

	int rows;
	int cols;

	input >> rows;
	input >> cols;

	int temp_column[rows];
	int data[rows][cols];
	int mins[cols];
	int above=0, below=0;
	float ave;

	//Read in the data from the file
	for(int x=0;x<cols;x++)
	{
		for(int y=0;y<rows;y++)
		{
			input >> data[x][y];
		}
	}

	//Place each column in the temp column and then run the necessary function
	for(int x=0;x<cols;x++)
	{
		for(int y=0;y<rows;y++)
		{
			temp_column[y] = data[y][x];
		}
		mins[x] = minimum(temp_column, rows);
	}

	//Get the average of the minimums
	ave = average(mins, cols);

	//Get how many minimums are above and below the average
	for(int i=0;i<cols;i++)
	{
		if(mins[i] < ave)
		{
			below++;
		} else {
			above++;
		}
	}


	cout << "Above: " << above << "\n";
	cout << "Below: " << below << "\n";

	//Check if the data has failed or not
	if((above - below) > 1 || (below-above) > 1)
	{
		cout << "Sorry, but your data has been rejected. Have a nice day!";
	} else {
		cout << "Your data has been accepted! Have a nice pretty table!\n"; //A nice message
		for(int i=0;i < cols;i++) //Display the top of the table
		{
			cout << "+-";
			if(mins[i] < 10)
				cout << "-";
			else if(mins[i] < 100)
				cout << "--";
			else if(mins[i] < 1000)
				cout << "---";
			else if(mins[i] < 10000)
				cout << "----";
			cout << "-";
		}
		cout << "+\n"; //Go to the next line
		cout << "| "; //The first |
		for(int i=0;i < cols;i++)
		{
			cout << mins[i] << " | "; //Display all the numbers and a |
		}
		cout << "\n"; //Go to the bottom border
		for(int i=0;i < cols;i++) //Display the bottom border
		{
			cout << "+-";
			if(mins[i] < 10)
				cout << "-";
			else if(mins[i] < 100)
				cout << "--";
			else if(mins[i] < 1000)
				cout << "---";
			else if(mins[i] < 10000)
				cout << "----";
			cout << "-";
		}
		cout << "+\n";
	}
	input.close(); //Close the file
	return 0;
}

float average(int mins[], int cols)
{
	float answer=0;
	for(int i=0;i<cols;i++)
	{
		answer = answer + mins[i];
	}
	answer = answer / (float)cols;
	return answer;
}

int minimum(int temp_column[], int rows)
{
	float min = temp_column[0];
	for(int i=1;i<rows-1;i++)
	{
		if(temp_column[i] < min)
			min = temp_column[i];
	}
	return min;
}
