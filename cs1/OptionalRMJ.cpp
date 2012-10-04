//Optional Assignment by Ryan Johnson
//Algorithm Design
/*
First the input and output files are opened, then all the variables necessary will be declared (weights for each day, daysFined, daysUsed, truckNum, and totalFine).
Right after that the headers for the table are fprintf'd to the output file (TRUCK, PERCENTAGE, DAYS USED, and FINE TOTAL). Then a while loop is run until the end
of the file. Inside of the while loop is a for loop that runs through each piece of data for 1 truck. The weights are collected from the input file and fines necessary
are calculated. Then all the necessary information (truck number, percentage of days fined, number of days the truck was used, and the total fine amount) is
fprintf'd to the output file. Finally, the daysFined, and daysUsed variables are reset for the next set of data. The truckNum variable will be increased by 1.
Finally, a nice message is printed out to the user and the two files (input and output) are closed.
*/
#include <iostream>
#include <fstream>
#include <stdio.h>

using namespace std;

float calcFine(int);

int main()
{
	ifstream input;
	input.open("Trucks.txt");
	FILE * output;
	output = fopen("TruckFines.txt","w");

	float weights[31], daysFined=0, daysUsed=0, truckNum=1, totalFine=0;

	fprintf(output,"%-10s %-10s %-10s %s\n","TRUCK","PERCENTAGE","DAYS USED","FINE TOTAL");

	while(!input.eof())
	{
		for(int i=0;i<31;i++)
		{
			input >> weights[i];
			if(weights[i] != 0)
				daysUsed++;
			if(weights[i] > 2000)
			{
				totalFine += calcFine(int(weights[i]));
				daysFined++;
			}
		}
		fprintf(output,"Truck %-4.0f %s%-9.1f %-10.0f $%.2f\n",truckNum,"%",(daysFined/daysUsed)*100, daysUsed, totalFine);

		daysFined=0;
		daysUsed=0;
		truckNum++;
		totalFine=0;
	}


	cout << "Data has been processed and results are stored in \"TruckFines.txt\"";

	fclose(output);
	input.close();
	return 0;
}

float calcFine(int weight)
{
	return ((weight-2000)/100)*50;
}
