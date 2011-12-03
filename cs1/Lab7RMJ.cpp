//Lab 7 by Ryan Johnson
//Algorithm Design:
/*
First, the user is prompted for the first and last name of the employee they wish to look up. 
Then the days are looped through and then in each day file the names are looped through until
the name is found. Once the name is found the the number of widgets sold and the date is stored in 
arrays (widgetsSold and dates). If the name is not found in that day file then widgetsSold for that
day is set to 0, and the day is set to some sort of flag. Gross pay is calculated for each day and then
taxes are calculated after all the days' gross pays are added up. The net pay is then calculated by
subtracting the taxes from the sum of the gross pays. Finally, all the data is outputted to a file.
*/

#include <iostream>
#include <fstream>
#include <stdio.h>

using namespace std;

float sum(float[]);

int main()
{
	ifstream days;
	FILE * output;
	output = fopen("WidgetReport.txt","w");
	string tmpFirstName, tmpLastName, firstName, lastName, dates[5], strLength;
	float widgetsSold[5], grossPay[5];
	float netpay, cost, commission, sstax, incometax, sstaxpercent = .055, incometaxpercent = .06, col1len, col2len, col3len;
	
	cout << "Employee's first name: ";
	cin >> firstName;
	cout << "Employee's last name: ";
	cin >> lastName;

	for(int i=0;i<5;i++)
	{
		switch(i)
		{
			case 0: days.open("day1.txt");
					break;
			case 1: days.open("day2.txt");
					break;
			case 2: days.open("day3.txt");
					break;
			case 3: days.open("day4.txt");
					break;
			case 4: days.open("day5.txt");
					break;
		}

		while(tmpFirstName != firstName && tmpLastName != lastName)
		{
			days >> tmpFirstName;
			days >> tmpLastName;
			days >> widgetsSold[i];
			days >> dates[i];	
			if(days.eof())
			{
				widgetsSold[i] = 0;
				dates[i] = "hi";
				break;
			}
		}
		days.close();
	
		tmpFirstName = "";
		tmpLastName = "";
	}	

	for(int i=0;i < 5;i++)
	{
		if(widgetsSold[i] <= 25)
			cost = 15;
		else if(widgetsSold[i] <= 50)
			cost = 10.5;
		else
			cost = 7.25;
		if(widgetsSold[i] < 100)
			commission = 0.05;
		else
			commission = 0.12;
		

		grossPay[i] = widgetsSold[i]*cost*commission;
	}
	incometax = incometaxpercent * sum(grossPay);
	sstax = sstaxpercent * sum(grossPay);
	netpay = sum(grossPay) - incometax - sstax;

	fprintf(output,"%s, %s\n",lastName.c_str(),firstName.c_str());
	fprintf(output,"+--------------------+--------------------+----------+\n");
	fprintf(output,"|    Widgets Sold    |      Gross Pay     |   Date   |\n");
	fprintf(output,"+--------------------+--------------------+----------+\n");
	for(int i=0;i < 5;i++)
	{
		if(dates[i] != "hi")
		{

			fprintf(output,"|         %-10.0f |       $%-11.2f | %s |\n",widgetsSold[i],grossPay[i],dates[i].c_str());	
			fprintf(output,"+--------------------+--------------------+----------+\n");
		}
	}
	fprintf(output,"\n");
	//Totals
	fprintf(output,"+--------------------+----------------+---------------+\n");
	fprintf(output,"| Total Widgets Sold |   Gross Pay    |    Net Pay    |\n");
	fprintf(output,"+--------------------+----------------+---------------+\n");
	fprintf(output,"|        %-11.0f |    $%-10.2f |   $%-10.2f |\n",sum(widgetsSold),sum(grossPay),netpay);
	fprintf(output,"+--------------------+----------------+---------------+\n");
	
	printf("Program completed successfully, results are located in \"WidgetReport.txt\".");

	fclose(output);
	return 0;
}

float sum(float grossPay[])
{
	float sum = 0;
	for(int i=0;i <= sizeof grossPay; i++)
	{
		sum += grossPay[i];
	}
	return sum;
}
