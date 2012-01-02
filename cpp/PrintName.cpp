/*
 * =====================================================================================
 *
 *       Filename:  PrintName.cpp
 *
 *    Description:  This program prints a name in two different formats.
 *
 *        Version:  1.0
 *        Created:  08/08/2011 12:23:06 PM
 *       Revision:  none
 *
 *         Author:  Ryan Johnson (), RyanMarkJohnson@letu.edu
 *
 * =====================================================================================
 */


#include <iostream>
#include <string>
using namespace std;

const string FIRST = "Herman";
const string LAST = "Smith";
const char MIDDLE = 'G';
const string TITLE = "Mr.";

int main()
{
    string firstLast;  // Name in first-last format
    string lastFirst; // Name in last-first format
    
    firstLast = TITLE + " " + FIRST +  " " + LAST;
    cout << "Name in first-last format is " << firstLast << endl;

    lastFirst = LAST + ", " + TITLE + " " + FIRST + ", ";
    cout << "Name in last-first-initial format is ";
    cout << lastFirst << MIDDLE << '.' << endl;
    return 0;
}

