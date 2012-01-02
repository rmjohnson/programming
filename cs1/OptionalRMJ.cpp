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
