/*
 * =====================================================================================
 *
 *       Filename:  test.cpp
 *
 *    Description:  Do not panic, this is only a test.
 *
 *        Version:  1.0
 *        Created:  08/08/2011 11:29:36 AM
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Ryan Johnson (), RyanMarkJohnson@letu.edu
 *        Company:  
 *
 * =====================================================================================
 */


/* 
 * ===  FUNCTION  ======================================================================
 *         Name:  test
 *  Description:  
 * =====================================================================================
 */
    int
test ( int x)
{
    return x*2;
}		/* -----  end of function test  ----- */


#include	<stdlib.h>
#include <iostream>
using namespace std;
/* 
 * ===  FUNCTION  ======================================================================
 *         Name:  main
 *  Description:  
 * =====================================================================================
 */
    int
main ( int argc, char *argv[] )
{

    cout << test(2) << "\n";
    return EXIT_SUCCESS;
}				/* ----------  end of function main  ---------- */
