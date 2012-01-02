//In Class Program 2 by Ryan Johnson
#include <iostream>
#include <fstream>

using namespace std;

float findAverage(float[][4], int);

int main()
{
	ifstream inputFile;
	inputFile.open("scores.txt");

	float scores[35][4];
	float averages[35];
	int studentcount = 0;

	//Get all the scores from the input file
	while(!inputFile.eof())
	{
		for(int i=0;i<4;i++)
		{
			inputFile >> scores[studentcount][i];
		}
		studentcount++;
	}
	//Find all the averages
	for(int x=0;x<studentcount;x++)
	{
		averages[x] = findAverage(scores,x);
	}
	//Send all the averages to the output file
	for(int i=1;i<=studentcount;i++)
	{
		cout << "Student " << i << " " << averages[i-1] << "\n";
	}

	inputFile.close();

	return 0;
}

float findAverage(float scores[][4], int studentIndex)
{
	float average=0;
	for(int i=0;i<4;i++)
	{
		average = average + scores[studentIndex][i];
	}
	average = average / 4;
	return average;
}
