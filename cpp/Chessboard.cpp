/*
 * =====================================================================================
 *
 *       Filename:  Chessboard.cpp
 *
 *    Description:  This program prints a chessboard pattern that is built up from basic
 *                  strings of white and black characters.
 *
 *        Version:  1.0
 *        Created:  08/08/2011 12:37:13 PM
 *       Revision:  none
 *
 *         Author:  Ryan Johnson (), RyanMarkJohnson@letu.edu
 *
 * =====================================================================================
 */

#include <iostream>
#include <string>
using namespace std;

const string BLACK = "########";
const string WHITE = "        ";

int main()
{
    string whiteRow; // A row beginning with a white square
    string blackRow; // A row beginning with a black square

    for(int x=0;x<4;x++)
    {
        whiteRow += WHITE + BLACK;
        blackRow += BLACK + WHITE;
    }
    for(int x=0;x<8;x++)
    {
        for(int y=0;y<5;y++)
        {
            if(x%2==0)
                cout << whiteRow << endl;
            else
                cout << blackRow << endl;
        }
    }
    
    return 0;
}
