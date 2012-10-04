#include <iostream>
#include <fstream>

using namespace std;

int maxsum(int[], int);

int main()
{
	int const totalCols=10;

	int data[totalCols][5000], colSums[totalCols], max;
	int x=0,y=0;
	string secreteSocial,inputSocial;

	ifstream input;
	ofstream log;
	input.open("SecreteInfo.txt");
	log.open("log.txt");

	input >> secreteSocial;
	cout << "Please enter your social security number:";
	cin >> inputSocial;
	
	//If the inputted social does not match the social in the file
	if(secreteSocial != inputSocial)
	{
		cout << "Log in failed.";
		log << "The person with the social security number " << inputSocial << " has tried getting into the SecreteInfo file.";
	} else {
		//Else grab all the data
		for(int i=0;i<totalCols;i++)
		{
			colSums[i]=0;
		}
		while(!input.eof())
		{
			y = 0;
			for(x=0;x<totalCols;x++)
			{
				input >> data[x][y];
				colSums[x] += data[x][y];
			}
			y++;
		}
		max = maxsum(colSums, totalCols);
		for(int i=0;i<totalCols;i++)
		{
			printf("Column %i %.1f%s\n",i+1,((float)colSums[i]/max)*100,"%");
		}
	}

	log.close();
	input.close();

	return 0;
}


int maxsum(int colSums[], int totalCols)
{
	int max = colSums[0];
	for(int i=1;i< totalCols;i++)
	{
		if(max < colSums[i])
		{
			max = colSums[i];
		}
	}
	return max;
}
