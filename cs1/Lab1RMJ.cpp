//A program to find the midpoint and slope given 2 sets of x,y cordinates.
//By Ryan Johnson 9/1/11
#include <iostream>

using namespace std;

int main()
{
	//VARIABLES
	int x1,x2,y1,y2,midpointx, midpointy; //The first and second x-cordinates, the first and second y-cordinates, and the x and y cordinates for the midpoint.
	float slope; //The slope

	//BODY OF THE PROGRAM
	cout << "Please input the first x-cordinate: ";
	cin >> x1;
	cout << "Please input the first y-cordinate: ";
	cin >> y1;

	cout << "Please input the second x-cordinate: ";
	cin >> x2;
	cout << "Please input the second y-cordinate: ";
	cin >> y2;
	slope = (float) (y2-y1)/(x2-x1); //Calculate the slope using the slope formula

	midpointx = (x2+x1)/2; //Calculate the x-cordinate of the midpoint
	midpointy = (y2+y1)/2; //Calculate the y-cordinate of the midpoint

	cout << "The midpoint between the point (" << x1 << "," << y1 << ") and (" << x2 << "," << y2 << ") is (" << midpointx << "," << midpointy << ").\n";
	cout << "The slope of the line between the points is " << slope << "\n";

	return 0;

} //END OF MAIN

