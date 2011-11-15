#include <iostream>
#include <fstream>

using namespace std;

float findAverage(float [][scorecount], int, int);
void findGrade(char[],float[]);

int main()
{
	ifstream scoresInput;
	scoresInput.open("scores.txt");

	int const studentcount = 40;
	int const scorecount = 4;
	float average[scorecount];
	float scores[studentcount][scorecount];
	int rownum=0;
	char studentgrade[studentcount];
