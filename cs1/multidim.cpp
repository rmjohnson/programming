#include <iostream>

using namespace std;

void myFunc(int[][3]);

int main()
{
	int myArray[3][3] = {{5,7,8},{3,2,1},{7,8,11}};
	myFunc(myArray);

	return 0;
}

void myFunc(int myArray[][3])
{
	for(int i=0;i<3;i++)
	{
		for(int ii=0;ii<3;ii++)
		{
			cout << "[" << i << "][" << ii << "] is " << myArray[i][ii] << "\n";
		}
	}
}
